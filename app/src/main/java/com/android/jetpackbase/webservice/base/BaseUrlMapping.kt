package com.android.jetpackbase.webservice.base

object BaseUrlMapping
{
    fun getUrl(feature: Feature): String {
        return when (feature) {
            Feature.LiveUrl -> "https://jetpackbase.free.beeceptor.com/"
            else -> "http://kashif123.000webhostapp.com/"
        }
    }
}

sealed class Feature
{
    object LiveUrl : Feature()
    object StagingUrl : Feature()
    object TestingUrl : Feature()
}