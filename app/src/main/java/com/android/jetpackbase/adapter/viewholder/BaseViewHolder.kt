package com.android.jetpackbase.adapter.viewholder


import android.view.View
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView


abstract class BaseViewHolder<T, VB : ViewDataBinding> : RecyclerView.ViewHolder {

    var data: T? = null
        set(value) {
            field = value
            data?.let { populateData(it) }
        }

    protected lateinit var viewDataBinding: VB

    open  var lastItemPosition = 0

    internal var TAG = javaClass.simpleName

    internal constructor(viewDataBinding: VB) : super(viewDataBinding.root) {
        this.viewDataBinding = viewDataBinding
    }

    internal constructor(itemView: View) : super(itemView)

    internal abstract fun populateData(data: T)

}