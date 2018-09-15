package ru.rougsig.funwithanimations.home

import android.view.View
import kotlinx.android.synthetic.main.home_controller.*
import ru.rougsig.funwithanimations.R
import ru.rougsig.funwithanimations.base.BaseController

class HomeController : BaseController() {
  override val layoutRes = R.layout.home_controller

  override fun initView(view: View) {
    val epoxyController = EpoxyHomeController()
    home_recycler_view.setController(epoxyController)
    epoxyController.requestModelBuild()
  }
}