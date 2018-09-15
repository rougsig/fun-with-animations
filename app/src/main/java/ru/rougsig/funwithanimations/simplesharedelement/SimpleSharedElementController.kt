package ru.rougsig.funwithanimations.simplesharedelement

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.rougsig.funwithanimations.R
import ru.rougsig.funwithanimations.base.BaseController

class SimpleSharedElementController : BaseController() {

  override fun inflateView(inflater: LayoutInflater, container: ViewGroup): View {
    return inflater.inflate(R.layout.simple_shared_element_controller, container, false)
  }

  override fun onViewBound(view: View) {
    view.setOnClickListener {
      router.popCurrentController()
    }
  }
}
