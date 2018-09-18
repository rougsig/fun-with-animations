package ru.rougsig.funwithanimations.base

interface MviPresenter<V : MviView<VS>, VS> {
  fun onAttach()
  fun onDetach()
}