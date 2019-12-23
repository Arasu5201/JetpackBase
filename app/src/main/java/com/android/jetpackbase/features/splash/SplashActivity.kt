package com.android.jetpackbase.features.splash

import androidx.activity.viewModels
import com.android.jetpackbase.R
import com.android.jetpackbase.base.BaseActivity
import com.android.jetpackbase.common.Constants
import com.android.jetpackbase.databinding.ActivitySplashBinding
import com.android.jetpackbase.features.login.LoginActivity
import java.util.*
import kotlin.concurrent.schedule

class SplashActivity : BaseActivity<SplashViewModel, ActivitySplashBinding>() {

    override fun initializeView(): SplashViewModel {
        val viewModel: SplashViewModel by viewModels()
        return viewModel
    }

    override fun layoutRes(): Int {
        return R.layout.activity_splash
    }

    override fun initializeListener() {
        viewBinding.mlSplash.setTransition(R.id.start, R.id.end)
        viewBinding.mlSplash.transitionToEnd()
        Timer().schedule(Constants.SPLASH_DELAY_TIME)
        {
            navigateTo(LoginActivity::class.java, true)
        }
    }

}