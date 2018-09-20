package ru.rougsig.funwithanimations.simplecustombehavior

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.view.View
import com.airbnb.epoxy.CallbackProp
import com.airbnb.epoxy.ModelView
import ru.rougsig.funwithanimations.R

@ModelView(autoLayout = ModelView.Size.MATCH_WIDTH_WRAP_HEIGHT)
class SimpleCustomBehaviorHomeItem(context: Context) : ConstraintLayout(context) {

  init {
    View.inflate(context, R.layout.simple_custom_behavior_home_item, this)

    clipChildren = false
    clipToPadding = false
  }

  @CallbackProp
  fun setClickListener(listener: View.OnClickListener?) {
    setOnClickListener(listener)
  }
}
