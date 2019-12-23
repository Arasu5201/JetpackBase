package com.android.jetpackbase.features.helpfaq

import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.jetpackbase.R
import com.android.jetpackbase.adapter.HelpFaqAdapter
import com.android.jetpackbase.adapter.listener.OnHelpFaqItemClickListener
import com.android.jetpackbase.base.BaseFragment
import com.android.jetpackbase.databinding.FragmentHelpFaqBinding
import com.android.jetpackbase.model.HelpFaqData

class HelpAndFaqFragment : BaseFragment<HelpAndFaqViewModel, FragmentHelpFaqBinding>() {

    private val adapter by lazy {
        HelpFaqAdapter(ArrayList(), listener)
    }

    override fun initializeViewModel(): HelpAndFaqViewModel {
        val viewModel: HelpAndFaqViewModel by viewModels()
        return viewModel
    }

    override fun layoutRes(): Int {
        return R.layout.fragment_help_faq
    }

    override fun initializeListener() {
        viewBinding.rvHelpFaq.layoutManager = LinearLayoutManager(activity)
        viewBinding.helpAdapter = adapter
        viewModel.helpFaqList.observe(this, Observer {
            adapter.resetItems(it)
        })
    }

    private val listener = object : OnHelpFaqItemClickListener<HelpFaqData> {
        override fun onClickItem(position: Int, data: HelpFaqData?) {

        }
    }

}