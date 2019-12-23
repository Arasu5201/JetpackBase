package com.android.jetpackbase.adapter.viewholder

import com.android.jetpackbase.adapter.listener.BaseRecyclerAdapterListener
import com.android.jetpackbase.databinding.InflateCompletedItemBinding
import com.android.jetpackbase.model.CompletedIssueData

class CompletedIssueViewHolder(view: InflateCompletedItemBinding, var listener: BaseRecyclerAdapterListener<CompletedIssueData>) : BaseViewHolder<CompletedIssueData, InflateCompletedItemBinding>(view) {


    override fun populateData(data: CompletedIssueData) {
        viewDataBinding.completedIssueData = data
        //viewDataBinding.ivFlower.loadUrl(data.url)
        viewDataBinding.listener = listener
    }
}