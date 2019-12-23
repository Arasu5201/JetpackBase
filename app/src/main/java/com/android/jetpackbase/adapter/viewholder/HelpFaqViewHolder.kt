package com.android.jetpackbase.adapter.viewholder

import android.view.View
import com.android.jetpackbase.adapter.listener.OnHelpFaqItemClickListener
import com.android.jetpackbase.databinding.InflateHelpFaqBinding
import com.android.jetpackbase.model.HelpFaqData

class HelpFaqViewHolder(view: InflateHelpFaqBinding, var listener: OnHelpFaqItemClickListener<HelpFaqData>) :
    BaseViewHolder<HelpFaqData, InflateHelpFaqBinding>(view) {


    override fun populateData(data: HelpFaqData) {
        viewDataBinding.helpFaqData = data
        //viewDataBinding.ivFlower.loadUrl(data.url)
        viewDataBinding.listener = listener
        viewDataBinding.tvTitle.setOnClickListener {
            viewDataBinding.tvFaqAnswer.visibility = if (viewDataBinding.tvFaqAnswer.visibility == View.VISIBLE) View.GONE else View.VISIBLE
        }
    }
}