package ru.rougsig.funwithanimations.utils

import android.view.View
import android.util.TypedValue

fun View.setSelectableBackground() {
  val valud = TypedValue()
  context.theme.resolveAttribute(android.R.attr.selectableItemBackground, valud, true)
  setBackgroundResource(valud.resourceId)
}