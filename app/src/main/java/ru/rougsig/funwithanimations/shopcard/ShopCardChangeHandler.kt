package ru.rougsig.funwithanimations.shopcard

import android.transition.*
import android.view.View
import android.view.ViewGroup
import com.bluelinelabs.conductor.changehandler.SharedElementTransitionChangeHandler
import ru.rougsig.funwithanimations.R

class ShopCardChangeHandler : SharedElementTransitionChangeHandler() {

  private val sharedElementNameRes = R.string.transition_shop_card

  override fun getExitTransition(container: ViewGroup, from: View?, to: View?, isPush: Boolean): Transition? {
    return Fade(Fade.OUT)
  }

  override fun getSharedElementTransition(container: ViewGroup, from: View?, to: View?, isPush: Boolean): Transition? {
    return TransitionSet()
      .addTransition(ChangeBounds())
      .addTransition(ChangeClipBounds())
      .addTransition(ChangeTransform())
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
