package ru.rougsig.funwithanimations.shopcard

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.view.View
import com.airbnb.epoxy.CallbackProp
import com.airbnb.epoxy.ModelView
import ru.rougsig.funwithanimations.R

@ModelView(autoLayout = ModelView.Size.MATCH_WIDTH_WRAP_HEIGHT)
class ShopCardHomeItem(context: Context): ConstraintLayout(context) {
  init {
    View.inflate(context, R.layout.shop_card_home_item, this)
  }

  @CallbackProp
  fun setClickListener(listener: View.OnClickListener?) {
    setOnClickListener(listener)
  }
}