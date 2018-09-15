package ru.rougsig.funwithanimations

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.bluelinelabs.conductor.Conductor
import com.bluelinelabs.conductor.Router
import com.bluelinelabs.conductor.RouterTransaction
import kotlinx.android.synthetic.main.activity_main.*
import ru.rougsig.funwithanimations.home.HomeController

class MainActivity : AppCompatActivity() {

  private lateinit var router: Router

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    router = Conductor.attachRouter(this, root, savedInstanceState)
    if (!router.hasRootController()) router.setRoot(RouterTransaction.with(HomeController()))
  }

  override fun onBackPressed() {
    if (!router.handleBack()) super.onBackPressed()
  }
}
