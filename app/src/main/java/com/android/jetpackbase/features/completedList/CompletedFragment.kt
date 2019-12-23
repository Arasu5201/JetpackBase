package com.android.jetpackbase.features.completedList

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.jetpackbase.R
import com.android.jetpackbase.adapter.CompletedAdapter
import com.android.jetpackbase.adapter.listener.BaseRecyclerAdapterListener
import com.android.jetpackbase.base.BaseFragment
import com.android.jetpackbase.common.Constants
import com.android.jetpackbase.databinding.FragmentCompletedBinding
import com.android.jetpackbase.model.CompletedIssueData
import com.android.jetpackbase.utils.getBundleParcelableData

class CompletedFragment : BaseFragment<CompletedIssueViewModel, FragmentCompletedBinding>() {

    private val adapter by lazy {
        CompletedAdapter(ArrayList(), listener)
    }

    override fun initializeViewModel(): CompletedIssueViewModel {
        val viewModel: CompletedIssueViewModel by viewModels()
        return viewModel
    }

    override fun layoutRes(): Int {
        return R.layout.fragment_completed
    }

    override fun initializeListener() {
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewBinding.rvCompletedIssue.layoutManager = LinearLayoutManager(activity)
        viewBinding.completedIssueAdapter = adapter
        viewModel.completedIssueList.observe(this, Observer {
            adapter.resetItems(it)
        })
    }

    private val listener = object : BaseRecyclerAdapterListener<CompletedIssueData> {
        override fun onClickItem(position: Int, data: CompletedIssueData?) {
            findNavController().navigate(
                R.id.action_completed_fragment_to_completedDetailFragment,
                getBundleParcelableData(Constants.BUNDLE_COMPLETED_ISSUE_DATA, data)
            )
        }
    }

}