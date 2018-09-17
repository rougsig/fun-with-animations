package ru.rougsig.funwithanimations.shopcard

import android.transition.*
import android.view.View
import android.view.ViewGroup
import com.bluelinelabs.conductor.changehandler.SharedElementTransitionChangeHandler
import kotlinx.android.synthetic.main.shop_card_controller.view.*
import ru.rougsig.funwithanimations.R

class ShopCardChangeHandler : SharedElementTransitionChangeHandler() {

  private val sharedElementNameRes = R.string.transition_shop_card

  override fun getExitTransition(container: ViewGroup, from: View?, to: View?, isPush: Boolean): Transition? {
    return Fade(Fade.OUT)
  }

  override fun getSharedElementTransition(container: ViewGroup, from: View?, to: View?, isPush: Boolean): Transition? {

    val hideButton = if (isPush) {
      from!!.shop_card_hide_button
    } else {
      to!!.shop_card_hide_button
    }
    hideButton.visibility = View.INVISIBLE

    return TransitionSet()
      .addTransition(ChangeBounds())
      .addTransition(ChangeClipBounds())
      .addTransition(ChangeTransform())
      .addListener(object : Transition.TransitionListener {
        override fun onTransitionEnd(transition: Transition?) {
          hideButton.visibility = View.VISIBLE
        }

        override fun onTransitionResume(transition: Transition?) = Unit
        override fun onTransitionPause(transition: Transition?) = Unit
        override fun onTransitionCancel(transition: Transition?) = Unit
        override fun onTransitionStart(transition: Transition?) = Unit
      })
  }

  override fun getEnterTransition(container: ViewGroup, from: View?, to: View?, isPush: Boolean): Transition? {
    return Fade(Fade.IN)
  }

  override fun configureSharedElements(container: ViewGroup, from: View?, to: View?, isPush: Boolean) {
    addSharedElement(container.resources.getString(sharedElementNameRes))
  }

  override fun allowTransitionOverlap(isPush: Boolean): Boolean {
    return true
  }
}
