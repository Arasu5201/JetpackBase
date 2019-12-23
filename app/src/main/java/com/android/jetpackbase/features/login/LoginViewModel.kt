package com.android.jetpackbase.features.login

import android.os.Bundle
import com.android.jetpackbase.base.BaseViewModel

class LoginViewModel : BaseViewModel() {
    override fun onCreate(bundle: Bundle?) {
        /*Log.d("TAG","onViewCreated===>")
        viewModelScope.launch {
            async {
                getList()
            }.await()
            runCatching { getList() }
                .onSuccess { it}.
                    onFailure { it.localizedMessage  }
        }


        Log.d("TAG","onViewCreated finish ===>")*/


    }

   /* private suspend fun getList() : String
    {
        hell()
        return "test"
    }

    suspend fun hell()
    {
        for (i in 0..10)
        {
            Log.d("TAG","launch===>$i")
        }
    }*/

}