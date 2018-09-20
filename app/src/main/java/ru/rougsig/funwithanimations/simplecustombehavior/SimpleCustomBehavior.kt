package ru.rougsig.funwithanimations.simplecustombehavior

import android.content.Context
import android.support.design.widget.CoordinatorLayout
import android.util.AttributeSet
import android.view.View

class SimpleCustomBehavior : CoordinatorLayout.Behavior<View> {
  constructor() : super()
  constructor(context: Context, attrs: AttributeSet) : super(context, attrs)

}