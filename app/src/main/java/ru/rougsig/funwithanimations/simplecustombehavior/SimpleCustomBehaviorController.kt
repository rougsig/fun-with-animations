package ru.rougsig.funwithanimations.simplecustombehavior

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bluelinelabs.conductor.Router
import com.bluelinelabs.conductor.RouterTransaction
import ru.rougsig.funwithanimations.R
import ru.rougsig.funwithanimations.base.BaseController

class SimpleCustomBehaviorController : BaseController() {
  companion object {
    fun createAndShow(router: Router) {
      router.pushController(RouterTransaction.with(SimpleCustomBehaviorController()))
    }
  }

  override fun inflateView(inflater: LayoutInflater, container: ViewGroup): View {
    return inflater.inflate(R.layout.simple_custom_behavior_controller, container, false)
  }
}