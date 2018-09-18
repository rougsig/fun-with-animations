package ru.rougsig.funwithanimations.base

import android.os.Bundle
import android.view.View

abstract class BaseMviController<VS, V : MviView<VS>, P : MviPresenter<V, VS>> : BaseController, MviView<VS> {
  abstract val presenter: P

  protected constructor() : super()
  protected constructor(args: Bundle) : super(args)

  override fun onAttach(view: View) {
    presenter.onAttach()
    super.onAttach(view)
  }

  override fun onDetach(view: View) {
    presenter.onDetach()
    super.onDetach(view)
  }
}