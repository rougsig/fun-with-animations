package ru.rougsig.funwithanimations.utils

import android.content.Context
import android.util.DisplayMetrics

fun Int.dp(context: Context): Int {
  val resources = context.getResources()
  val metrics = resources.getDisplayMetrics()
  return this * (metrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT)
}

