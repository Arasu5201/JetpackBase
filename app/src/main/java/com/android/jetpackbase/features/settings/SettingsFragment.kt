package com.android.jetpackbase.features.settings

import android.view.View
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.android.jetpackbase.R
import com.android.jetpackbase.base.BaseFragment
import com.android.jetpackbase.databinding.FragmentSettingsBinding
import com.android.jetpackbase.utils.OnClickListener

class SettingsFragment : BaseFragment<SettingsViewModel, FragmentSettingsBinding>(), OnClickListener {
    override fun initializeViewModel(): SettingsViewModel {
        val viewModel: SettingsViewModel by viewModels()
        return viewModel
    }

    override fun layoutRes(): Int {
        return R.layout.fragment_settings
    }

    override fun initializeListener() {
        viewBinding.listener = this
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.btnChangePassword -> {
                findNavController().navigate(R.id.action_settings_fragment_to_changePasswordFragment)
            }
            R.id.btnHelp -> {
                findNavController().navigate(R.id.action_settings_fragment_to_helpAndFaqFragment)
            }
            R.id.btnLogout -> {

            }
        }
    }


}