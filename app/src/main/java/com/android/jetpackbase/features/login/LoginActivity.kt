package com.android.jetpackbase.features.login

import android.view.View
import androidx.activity.viewModels
import com.android.jetpackbase.R
import com.android.jetpackbase.base.BaseActivity
import com.android.jetpackbase.databinding.ActivityLoginBinding
import com.android.jetpackbase.features.home.MainActivity


class LoginActivity : BaseActivity<LoginViewModel, ActivityLoginBinding>()
{
    override fun initializeView(): LoginViewModel {
        val viewModel : LoginViewModel by viewModels()
        return viewModel
    }

    override fun layoutRes(): Int {
        return R.layout.activity_login
    }

    override fun initializeListener() {

    }

    fun navigateToMainActivity(view : View) {
       navigateTo(MainActivity::class.java, true)
    }
}