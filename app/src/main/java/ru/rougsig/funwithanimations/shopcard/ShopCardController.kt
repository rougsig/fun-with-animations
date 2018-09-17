package ru.rougsig.funwithanimations.shopcard

import android.content.Context
import android.support.design.widget.BottomSheetBehavior
import android.util.DisplayMetrics
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import com.bluelinelabs.conductor.Router
import com.bluelinelabs.conductor.RouterTransaction
import kotlinx.android.synthetic.main.shop_card_controller.*
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

  override fun onViewBound(view: View) {
    val context = view.context
    val windowManager = context.getSystemService(Context.WINDOW_SERVICE) as WindowManager
    val metrics = DisplayMetrics()
    windowManager.defaultDisplay.getMetrics(metrics)
    shop_card_bottom_sheet.layoutParams.height = (metrics.heightPixels * 0.70).toInt()

    val bottomSheetBehavior = BottomSheetBehavior.from(shop_card_bottom_sheet)
    bottomSheetBehavior.state = BottomSheetBehavior.STATE_EXPANDED

    shop_card_hide_button.setOnClickListener {
      bottomSheetBehavior.state = BottomSheetBehavior.STATE_EXPANDED
    }

    shop_card_show_button.setOnClickListener {
      bottomSheetBehavior.state = BottomSheetBehavior.STATE_COLLAPSED
    }

    shop_card_bottom_sheet.setOnClickListener {
      val bottomSheetState = bottomSheetBehavior.state

      when (bottomSheetState) {
        BottomSheetBehavior.STATE_COLLAPSED -> {
          bottomSheetBehavior.state = BottomSheetBehavior.STATE_EXPANDED
        }
        BottomSheetBehavior.STATE_EXPANDED -> {

        }
      }
    }

    shop_card_barcode.setOnClickListener {
      if (bottomSheetBehavior.state == BottomSheetBehavior.STATE_EXPANDED) {
        bottomSheetBehavior.state = BottomSheetBehavior.STATE_COLLAPSED
      }
    }
  }
}