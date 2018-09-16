package ru.rougsig.funwithanimations.simplesharedelement

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bluelinelabs.conductor.Router
import com.bluelinelabs.conductor.RouterTransaction
import ru.rougsig.funwithanimations.R
import ru.rougsig.funwithanimations.base.BaseController

class SimpleSharedElementController : BaseController() {

  companion object {
    fun createAndShow(router: Router) {
      router.pushController(RouterTransaction.with(SimpleSharedElementController())
        .pushChangeHandler(SimpleSharedElementChangeHandler())
        .popChangeHandler(SimpleSharedElementChangeHandler()))
    }
  }

  override fun inflateView(inflater: LayoutInflater, container: ViewGroup): View {
    return inflater.inflate(R.layout.simple_shared_element_controller, container, false)
  }

  override fun onViewBound(view: View) {
    view.setOnClickListener {
      router.popCurrentController()
    }
  }
}
