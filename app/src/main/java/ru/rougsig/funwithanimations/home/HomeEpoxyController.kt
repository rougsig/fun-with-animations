package ru.rougsig.funwithanimations.home

import android.view.View
import com.airbnb.epoxy.EpoxyController
import com.bluelinelabs.conductor.Router
import ru.rougsig.funwithanimations.base.divider
import ru.rougsig.funwithanimations.simplesharedelement.SimpleSharedElementController
import ru.rougsig.funwithanimations.simplesharedelement.simpleSharedElementHomeItem

class HomeEpoxyController(private val router: Router) : EpoxyController() {

  override fun buildModels() {
    simpleSharedElementHomeItem {
      id("simple_shared_element")
      clickListener(View.OnClickListener {
        SimpleSharedElementController.createAndShow(router)
      })
    }
    divider {
      id("divider_0")
    }
  }
}
