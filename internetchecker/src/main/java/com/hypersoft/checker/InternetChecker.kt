package com.hypersoft.checker

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities

object InternetChecker {
    fun isInternetAvailable(context: Context?): Boolean {
        try {
            val connectivityManager = context?.getSystemService(Context.CONNECTIVITY_SERVICE) as? ConnectivityManager
            val network = connectivityManager?.activeNetwork ?: return false
            val capabilities = connectivityManager.getNetworkCapabilities(network) ?: return false
            return when {
                capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> true
                capabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> true
                capabilities.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) -> true
                capabilities.hasTransport(NetworkCapabilities.TRANSPORT_VPN) -> true
                else -> false
            }
        }catch (ex:Exception){
            ex.printStackTrace()
            return false
        }
    }
}