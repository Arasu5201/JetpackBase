package com.android.jetpackbase.adapter.viewholder

import com.android.jetpackbase.adapter.listener.BaseRecyclerAdapterListener
import com.android.jetpackbase.databinding.InflateIssueItemBinding
import com.android.jetpackbase.model.IssueData


class IssueViewHolder(view: InflateIssueItemBinding, var listener: BaseRecyclerAdapterListener<IssueData>) : BaseViewHolder<IssueData, InflateIssueItemBinding>(view) {


    override fun populateData(data: IssueData) {
        viewDataBinding.issueData = data
//        viewDataBinding.ivFlower.loadUrl(data.url)
        viewDataBinding.listener = listener
    }
}