package ru.rougsig.funwithanimations.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.home_controller.*
import ru.rougsig.funwithanimations.R
import ru.rougsig.funwithanimations.base.BaseController

class HomeController : BaseController() {

  override fun inflateView(inflater: LayoutInflater, container: ViewGroup): View {
    return inflater.inflate(R.layout.home_controller, container, false)
  }

  override fun onViewBound(view: View) {
    super.onViewBound(view)
    recycler_view.setControllerAndBuildModels(HomeEpoxyController(router))
  }
}
