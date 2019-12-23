package com.android.jetpackbase.features.completeddetails

import androidx.fragment.app.viewModels
import com.android.jetpackbase.R
import com.android.jetpackbase.base.BaseFragment
import com.android.jetpackbase.databinding.FragmentCompletedDetailBinding

class CompletedDetailFragment : BaseFragment<CompletedDetailViewModel, FragmentCompletedDetailBinding>() {

    override fun initializeViewModel(): CompletedDetailViewModel {
        val viewModel: CompletedDetailViewModel by viewModels()
        return viewModel
    }

    override fun layoutRes(): Int {
        return R.layout.fragment_completed_detail
    }

    override fun initializeListener() {
       // viewBinding.issueDetailViewModel = viewModel
        viewBinding.completedDetailViewModel = viewModel
    }
}