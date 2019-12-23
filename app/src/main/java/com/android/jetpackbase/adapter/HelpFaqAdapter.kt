package com.android.jetpackbase.adapter

import android.view.ViewGroup
import com.android.jetpackbase.R
import com.android.jetpackbase.adapter.listener.OnHelpFaqItemClickListener
import com.android.jetpackbase.adapter.viewholder.HelpFaqViewHolder
import com.android.jetpackbase.databinding.InflateHelpFaqBinding
import com.android.jetpackbase.model.HelpFaqData

class HelpFaqAdapter(data: MutableList<HelpFaqData>?, var listener: OnHelpFaqItemClickListener<HelpFaqData>) :
    BaseRecyclerAdapter<HelpFaqData, HelpFaqViewHolder>(data) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HelpFaqViewHolder {
        return HelpFaqViewHolder(
            inflateDataBinding(R.layout.inflate_help_faq, parent) as InflateHelpFaqBinding, listener
        )
    }
}