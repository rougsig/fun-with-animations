package ru.rougsig.funwithanimations.simplesharedelement

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.view.View
import com.airbnb.epoxy.CallbackProp
import com.airbnb.epoxy.ModelView
import ru.rougsig.funwithanimations.R
import ru.rougsig.funwithanimations.utils.dp

@ModelView(autoLayout = ModelView.Size.MATCH_WIDTH_WRAP_HEIGHT)
class SimpleSharedElementHomeItem(context: Context) : ConstraintLayout(context) {

  init {
    View.inflate(context, R.layout.simple_shared_element_home_item, this)

    clipChildren = false
    clipToPadding = false
  }

  @CallbackProp
  fun setClickListener(listener: View.OnClickListener?) {
    setOnClickListener(listener)
  }
}
