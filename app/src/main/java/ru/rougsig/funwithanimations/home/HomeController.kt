package ru.rougsig.funwithanimations.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bluelinelabs.conductor.Controller
import ru.rougsig.funwithanimations.R

class HomeController : Controller() {
  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
    return inflater.inflate(R.layout.home_controller, container, false)
  }
}