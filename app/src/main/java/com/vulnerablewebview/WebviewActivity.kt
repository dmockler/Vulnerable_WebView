package com.vulnerablewebview

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebChromeClient
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_webview.*


class WebviewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview)

        ConfigWebview(url)
    }

    @SuppressLint("SetJavaScriptEnabled")
    private fun ConfigWebview(url :String) {
        webview.webChromeClient = WebChromeClient()
        webview.settings.supportZoom()
        webview.settings.displayZoomControls = true
        webview.addJavascriptInterface(WebViewInterface(), "Android")
        webview.settings.javaScriptEnabled = true
        webview.loadUrl(url)
    }
}