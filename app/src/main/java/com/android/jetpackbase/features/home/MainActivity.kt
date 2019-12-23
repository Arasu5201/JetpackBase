package com.android.jetpackbase.features.home

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.android.jetpackbase.R
import com.android.jetpackbase.base.BaseActivity
import com.android.jetpackbase.databinding.ActivityMainBinding
import com.android.jetpackbase.utils.updateViewVisibility


class MainActivity : BaseActivity<MainViewModel, ActivityMainBinding>() {
    private lateinit var navigationController: NavController
    override fun initializeView(): MainViewModel {
        val viewModel: MainViewModel by viewModels()
        return viewModel
    }

    override fun layoutRes(): Int {
        return R.layout.activity_main
    }

    override fun initializeListener() {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        navigationController = findNavController(R.id.home_nav_fragment)
        navigationController.addOnDestinationChangedListener(listener)
        viewBinding.btmNavigationView.setupWithNavController(navigationController)
        /* onBackPressedDispatcher.addCallback(object : OnBackPressedCallback(true) {
             override fun handleOnBackPressed() {
                 Log.d("TAG","handleOnBackPressed")
             }
         })*/
        //findNavController().navigateUp()
    }

    private val listener = NavController.OnDestinationChangedListener { controller, destination, arguments ->
        when (destination.label) {
            getString(R.string.home_title) -> {
                viewBinding.toolbarTitle = getString(R.string.home_title)
                viewBinding.isBackOn = false
                viewBinding.btmNavigationView.updateViewVisibility(true)
            }
            getString(R.string.issue_detail) -> {
                viewBinding.toolbarTitle = getString(R.string.home_title)
                viewBinding.isBackOn = true
                viewBinding.btmNavigationView.updateViewVisibility(false)
            }
            getString(R.string.completed_title) -> {
                viewBinding.toolbarTitle = getString(R.string.completed_title)
                viewBinding.isBackOn = true
                viewBinding.btmNavigationView.updateViewVisibility(true)
            }
            getString(R.string.completed_detail) -> {
                viewBinding.toolbarTitle = getString(R.string.completed_title)
                viewBinding.isBackOn = true
                viewBinding.btmNavigationView.updateViewVisibility(false)
            }
            getString(R.string.settings_title) -> {
                viewBinding.toolbarTitle = getString(R.string.settings_title)
                viewBinding.isBackOn = true
                viewBinding.btmNavigationView.updateViewVisibility(true)
            }
            getString(R.string.change_password) -> {
                viewBinding.toolbarTitle = getString(R.string.change_password)
                viewBinding.isBackOn = true
                viewBinding.btmNavigationView.updateViewVisibility(false)
            }
            getString(R.string.help_faq) -> {
                viewBinding.toolbarTitle = getString(R.string.help_faq)
                viewBinding.isBackOn = true
                viewBinding.btmNavigationView.updateViewVisibility(false)
            }

        }
    }

    override fun onResume() {
        super.onResume()
        navigationController.addOnDestinationChangedListener(listener)
    }

    override fun onPause() {
        super.onPause()
        navigationController.removeOnDestinationChangedListener(listener)
    }

    fun backPressed(view: View) {
        navigationController.navigateUp()
    }

}
