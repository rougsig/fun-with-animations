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

  constructor()
  constructor(args: Bundle) : super(args)

  final override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
    val rootView = inflater.inflate(layoutRes, container, false)
    bindPropsRootView = rootView
    initView(rootView)
    return rootView
  }

  abstract val layoutRes: Int
  abstract fun initView(view: View)

  override val containerView: View? get() = bindPropsRootView

  final override fun onDestroyView(view: View) {
    clearFindViewByIdCache()
    bindPropsRootView = null
    super.onDestroyView(view)
  }
}
