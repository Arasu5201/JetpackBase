package com.android.jetpackbase.common

object Constants
{
    const val SPLASH_DELAY_TIME : Long= 3000

    //Bundle
    const val BUNDLE_ISSUE_DATA : String = "BUNDLE_ISSUE_DATA"
    const val BUNDLE_COMPLETED_ISSUE_DATA : String = "BUNDLE_COMPLETED_ISSUE_DATA"

    interface ApiHeaderKey {
        companion object {
            val AUTHORIZATION = "Authorization"

        }

    }

    interface InternalHttpCode {
        companion object {
            const val FAILURE_CODE = 404
            const val BAD_REQUEST_CODE = 400
            const val UNAUTHORIZED_CODE = 401
            const val INTERNAL_SERVER_ERROR_CODE = 500
            const val TIMEOUT_CODE = 504
        }
    }

    interface PreferenceKey {
        companion object {
            const val TOKEN = "token"
            const val USER_DATA = "userData"

        }
    }
}