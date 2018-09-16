package ru.rougsig.funwithanimations.home

import android.view.View
import com.airbnb.epoxy.EpoxyController
import com.bluelinelabs.conductor.Router
import ru.rougsig.funwithanimations.simplesharedelement.SimpleSharedElementController
import ru.rougsig.funwithanimations.simplesharedelement.simpleSharedElementHomeItem

class HomeEpoxyController(private val router: Router) : EpoxyController() {

  override fun buildModels() {
    simpleSharedElementHomeItem {
      id("item")
      clickListener(View.OnClickListener {
        SimpleSharedElementController.createAndShow(router)
      })
    }
  }
}
