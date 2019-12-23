package com.android.jetpackbase.adapter

import android.view.ViewGroup
import com.android.jetpackbase.R
import com.android.jetpackbase.adapter.listener.BaseRecyclerAdapterListener
import com.android.jetpackbase.adapter.viewholder.IssueViewHolder
import com.android.jetpackbase.databinding.InflateIssueItemBinding
import com.android.jetpackbase.model.IssueData


class IssueAdapter(
    data: MutableList<IssueData>?,
    var listener: BaseRecyclerAdapterListener<IssueData>
) :
    BaseRecyclerAdapter<IssueData, IssueViewHolder>(data) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IssueViewHolder {
        return IssueViewHolder(
            inflateDataBinding(R.layout.inflate_issue_item, parent) as InflateIssueItemBinding,
            listener
        )
    }
}