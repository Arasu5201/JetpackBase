package com.android.jetpackbase.webservice.base

import android.content.Context
import com.android.jetpackbase.BuildConfig
import com.android.jetpackbase.common.Constants
import com.android.jetpackbase.utils.sharepreference.SharedPrefManager
import com.google.gson.GsonBuilder
import com.google.gson.JsonParser
import com.google.gson.JsonSyntaxException
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import timber.log.Timber
import java.util.concurrent.TimeUnit

const val TIMEOUT_LENGTH: Long = 100

object RetrofitModules {
    private lateinit var sharePreferenceManager: SharedPrefManager
    private lateinit var retrofitBuilder: Retrofit
    fun init(context: Context) {
        sharePreferenceManager = SharedPrefManager(context)
        retrofitBuilder = Retrofit.Builder()
            .baseUrl(BaseUrlMapping.getUrl(Feature.LiveUrl))
            .client(createClient())
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .addConverterFactory(MoshiConverterFactory.create()) /*Use can mention your desired parser over here.!*/
            .build()
    }

    private fun createClient(): OkHttpClient {
        val clientBuilder = OkHttpClient.Builder()

        if (BuildConfig.DEBUG) {
            val logging = getPrintLogger()
            clientBuilder.interceptors().add(logging)
        }

        //clientBuilder.interceptors().add(UserAgentInterceptor(USER_AGENT))

        val authToken = sharePreferenceManager.token
        clientBuilder.connectTimeout(TIMEOUT_LENGTH, TimeUnit.SECONDS)
            .readTimeout(TIMEOUT_LENGTH, TimeUnit.SECONDS)
            .addInterceptor {
                val original = it.request()
                val request = original.newBuilder()
                    .header(Constants.ApiHeaderKey.AUTHORIZATION, authToken)
                    .method(original.method(), original.body())
                    .build()

                it.proceed(request)
            }

        return clientBuilder.build()
    }

    private fun getPrintLogger(): HttpLoggingInterceptor =
        HttpLoggingInterceptor {
            val isJson = it.startsWith("{")

            if (!isJson) {
                Timber.d(it)
                return@HttpLoggingInterceptor
            }

            try {
                Timber.d(GsonBuilder().setPrettyPrinting().create().toJson((JsonParser().parse(it))))
            } catch (e: JsonSyntaxException) {
                Timber.e("error parsing json response data: $e")
            } catch (e: OutOfMemoryError) {
                e.printStackTrace()
            }
        }.setLevel(HttpLoggingInterceptor.Level.BODY)

    fun getRetrofitBuilder(): Retrofit {
        return retrofitBuilder
    }

}
