package ru.rougsig.funwithanimations.base

import com.jakewharton.rxrelay2.PublishRelay
import io.reactivex.Observable
import io.reactivex.disposables.CompositeDisposable

abstract class BaseMviPresenter<V : MviView<VS>, VS, A>(private val view: V) : MviPresenter<V, VS> {
  private val compositeDisposable = CompositeDisposable()
  private val newActionsAfterReduce = PublishRelay.create<A>()

  override fun onAttach() {
    val intents = createIntents(view)

    val disposable = Observable.merge(intents.plus(newActionsAfterReduce))
      .scan(Pair<VS, Function0<A?>?>(createInitialViewState(), null)) { s, a ->
        reduceActions(s.first, a)
      }
      .doAfterNext { (_, a) ->
        a?.invoke()?.let { newActionsAfterReduce.accept(it) }
      }
      .map { it.first }
      .subscribe { view.render(it) }

    compositeDisposable.addAll(disposable)
  }

  override fun onDetach() {
    compositeDisposable.clear()
  }

  abstract fun createIntents(view: V): List<Observable<A>>
  abstract fun reduceActions(viewState: VS, action: A): Pair<VS, Function0<A?>?>
  abstract fun createInitialViewState(): VS
}