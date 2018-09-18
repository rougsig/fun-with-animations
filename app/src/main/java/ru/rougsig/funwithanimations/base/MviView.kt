package ru.rougsig.funwithanimations.base

interface MviView<VS> {
  fun render(viewState: VS)
}