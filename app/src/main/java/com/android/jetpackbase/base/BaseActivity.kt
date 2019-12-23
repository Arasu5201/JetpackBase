package com.android.jetpackbase.base

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.android.jetpackbase.widget.CustomProgressBar


abstract class BaseActivity<VM : BaseViewModel, VB : ViewDataBinding> : AppCompatActivity() {

    protected lateinit var viewBinding: VB

    abstract fun initializeView(): VM

    abstract fun layoutRes(): Int

    private var mCustomProgressbar: CustomProgressBar? = null

    abstract fun initializeListener()

    open fun onViewModelCreated() {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.initContext(applicationContext)


        viewModel.onCreate(savedInstanceState)
        viewBinding = DataBindingUtil.setContentView(this, layoutRes())
        viewBinding.setLifecycleOwner(this)

        initializeListener()


        /* viewModel.basicEventLiveData.observe(this, Observer {
             when (it) {
                 SHOW_PROGRESS_BAR -> {
                     getProgressBar()!!.show()
                 }
                 DISMISS_PROGRESS_BAR -> {
                     runOnUiThread {
                         try {
                             if (getProgressBar() != null && getProgressBar()!!.isShowing())
                                 getProgressBar()!!.dismissProgress()
                         } catch (e: Exception) {
                         }
                     }
                 }
                 SHOW_NO_INTERNET -> {
                 }
             }
         })*/


    }


    private fun getProgressBar(): CustomProgressBar? {
        if (mCustomProgressbar == null) {
            mCustomProgressbar = CustomProgressBar(this)
        }
        return mCustomProgressbar
    }


    override fun onPause() {
        super.onPause()
        viewModel.onPause()
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }


    protected val viewModel: VM by lazy {

        initializeView()
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        viewModel.startActivityForResult(requestCode, resultCode, data)
    }

// new for me

    fun <navigateTo> navigateTo(
        className: Class<navigateTo>,
        isFinishCurrentActivity: Boolean = false,
        bundle: Bundle? = null,
        needDefaultAnim: Boolean = true
    ) {
        val intent = Intent(this, className)
        if (bundle != null)
            intent.putExtras(bundle)
        startActivity(intent)
        if (needDefaultAnim)
            overridePendingTransition(
                com.android.jetpackbase.R.anim.slide_from_left,
                com.android.jetpackbase.R.anim.slide_to_right
            )
        if (isFinishCurrentActivity)
            finish()
    }


    fun <G> navigateToWithResult(
        className: Class<G>,
        bundle: Bundle?,
        needDefaultAnim: Boolean,
        activityRequestCode: Int
    ) {
        val intent = Intent(this, className)
        if (bundle != null)
            intent.putExtras(bundle)
        startActivityForResult(intent, activityRequestCode)
        /*  if (needDefaultAnim)
              overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right)*/
    }

    fun showMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
