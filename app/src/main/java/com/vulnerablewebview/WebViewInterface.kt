package com.vulnerablewebview

import android.webkit.JavascriptInterface


class WebViewInterface () {

    @JavascriptInterface
    fun displayFlag(): String {
        return "Super Secret Code: " + (1000..2000).random()
    }
}