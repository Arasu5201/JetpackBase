package com.android.jetpackbase.adapter

import android.view.ViewGroup
import com.android.jetpackbase.R
import com.android.jetpackbase.adapter.listener.BaseRecyclerAdapterListener
import com.android.jetpackbase.adapter.viewholder.CompletedIssueViewHolder
import com.android.jetpackbase.databinding.InflateCompletedItemBinding
import com.android.jetpackbase.model.CompletedIssueData

class CompletedAdapter(data: MutableList<CompletedIssueData>?, var listener: BaseRecyclerAdapterListener<CompletedIssueData>) :
    BaseRecyclerAdapter<CompletedIssueData, CompletedIssueViewHolder>(data) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CompletedIssueViewHolder {
        return CompletedIssueViewHolder(
            inflateDataBinding(R.layout.inflate_completed_item, parent) as InflateCompletedItemBinding, listener
        )
    }
}