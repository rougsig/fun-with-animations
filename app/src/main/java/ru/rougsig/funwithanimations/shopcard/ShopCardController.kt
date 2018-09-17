package ru.rougsig.funwithanimations.shopcard

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bluelinelabs.conductor.Router
import com.bluelinelabs.conductor.RouterTransaction
import ru.rougsig.funwithanimations.R
import ru.rougsig.funwithanimations.base.BaseController

class ShopCardController : BaseController() {

  companion object {
    fun createAndShow(router: Router) {
      router.pushController(RouterTransaction.with(ShopCardController()))
    }
  }

  override fun inflateView(inflater: LayoutInflater, container: ViewGroup): View {
    return inflater.inflate(R.layout.shop_card_controller, container, false)
  }
}