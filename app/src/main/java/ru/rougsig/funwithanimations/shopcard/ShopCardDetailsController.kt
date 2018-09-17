package ru.rougsig.funwithanimations.shopcard

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bluelinelabs.conductor.Router
import com.bluelinelabs.conductor.RouterTransaction
import kotlinx.android.synthetic.main.shop_card_details_controller.*
import ru.rougsig.funwithanimations.R
import ru.rougsig.funwithanimations.base.BaseController

class ShopCardDetailsController : BaseController() {

  companion object {
    fun createAndShow(router: Router) {
      router.pushController(RouterTransaction.with(ShopCardDetailsController())
        .pushChangeHandler(ShopCardChangeHandler())
        .popChangeHandler(ShopCardChangeHandler()))
    }
  }

  override fun inflateView(inflater: LayoutInflater, container: ViewGroup): View {
    return inflater.inflate(R.layout.shop_card_details_controller, container, false)
  }

  override fun onViewBound(view: View) {
    shop_card_details_close.setOnClickListener {
      router.popCurrentController()
    }
  }
}