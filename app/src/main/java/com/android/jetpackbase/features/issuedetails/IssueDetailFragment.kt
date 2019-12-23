package com.android.jetpackbase.features.issuedetails

import androidx.fragment.app.viewModels
import com.android.jetpackbase.R
import com.android.jetpackbase.base.BaseFragment
import com.android.jetpackbase.databinding.FragmentIssueDetailBinding

class IssueDetailFragment : BaseFragment<IssueDetailViewModel, FragmentIssueDetailBinding>() {

    override fun initializeViewModel(): IssueDetailViewModel {
        val viewModel: IssueDetailViewModel by viewModels()
        return viewModel
    }

    override fun layoutRes(): Int {
        return R.layout.fragment_issue_detail
    }

    override fun initializeListener() {
        viewBinding.issueDetailViewModel = viewModel
    }
}