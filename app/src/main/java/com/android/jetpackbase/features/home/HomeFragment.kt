package com.android.jetpackbase.features.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.jetpackbase.R
import com.android.jetpackbase.adapter.IssueAdapter
import com.android.jetpackbase.adapter.listener.BaseRecyclerAdapterListener
import com.android.jetpackbase.base.BaseFragment
import com.android.jetpackbase.common.Constants
import com.android.jetpackbase.databinding.FragmentHomeBinding
import com.android.jetpackbase.model.IssueData
import com.android.jetpackbase.utils.getBundleParcelableData

class HomeFragment : BaseFragment<HomeViewModel, FragmentHomeBinding>() {

    private val adapter by lazy {
        IssueAdapter(ArrayList(), listener)
    }

    override fun initializeViewModel(): HomeViewModel {
        val viewModel: HomeViewModel by viewModels()
        return viewModel
    }

    override fun layoutRes(): Int {
        return R.layout.fragment_home
    }

    override fun initializeListener() {

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewBinding.rvHome.layoutManager = LinearLayoutManager(activity)
        viewBinding.issueAdapter = adapter
        viewModel.issueList?.observe(this, Observer {
            adapter.resetItems(it)
        })
    }

    private val listener = object : BaseRecyclerAdapterListener<IssueData> {
        override fun onClickItem(position: Int, data: IssueData?) {
            findNavController().navigate(
                R.id.action_home_fragment_to_issue_detail_fragment,
                getBundleParcelableData(Constants.BUNDLE_ISSUE_DATA, data)
            )
        }
    }

}