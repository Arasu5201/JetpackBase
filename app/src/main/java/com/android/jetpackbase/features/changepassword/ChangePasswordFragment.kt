package com.android.jetpackbase.features.changepassword

import androidx.fragment.app.viewModels
import com.android.jetpackbase.R
import com.android.jetpackbase.base.BaseFragment
import com.android.jetpackbase.databinding.FragmentChangePasswordBinding

class ChangePasswordFragment : BaseFragment<ChangePasswordViewModel, FragmentChangePasswordBinding>()
{
    override fun initializeViewModel(): ChangePasswordViewModel {
        val viewModel : ChangePasswordViewModel by viewModels()
        return viewModel
    }

    override fun layoutRes(): Int {
        return R.layout.fragment_change_password
    }

    override fun initializeListener() {
    }

}