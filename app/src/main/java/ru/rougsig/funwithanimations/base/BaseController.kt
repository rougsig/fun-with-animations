package ru.rougsig.funwithanimations.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bluelinelabs.conductor.Controller
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.*

abstract class BaseController : Controller, LayoutContainer {
  private var bindPropsRootView: View? = null

  protected constructor()
  protected constructor(args: Bundle) : super(args)

  protected abstract fun inflateView(inflater: LayoutInflater, container: ViewGroup): View

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
    val view = inflateView(inflater, container)
    bindPropsRootView = view
    onViewBound(view)
    return view
  }

  protected open fun onViewBound(view: View) {}

  override val containerView: View? get() = bindPropsRootView

  override fun onDestroyView(view: View) {
    clearFindViewByIdCache()
    bindPropsRootView = null
    super.onDestroyView(view)
  }
}
