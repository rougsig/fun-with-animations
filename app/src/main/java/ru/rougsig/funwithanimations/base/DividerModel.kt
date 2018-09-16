package ru.rougsig.funwithanimations.base

import android.view.View
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import ru.rougsig.funwithanimations.R

@EpoxyModelClass(layout = R.layout.divider_item)
abstract class DividerModel : EpoxyModelWithHolder<DividerModel.Holder>() {
  class Holder : EpoxyHolder() {
    override fun bindView(itemView: View?) = Unit
  }
}
