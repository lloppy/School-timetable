package com.example.parser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.webkit.WebSettings




class MainActivity : AppCompatActivity() {
    private lateinit var webView: WebView
    private lateinit var webSettings: WebSettings

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView = findViewById(R.id.web)
        webView.settings.javaScriptEnabled = true

        webView.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                val url = "https://docs.google.com/gview?embedded=true&url=" + "https://14srv.uralschool.ru/upload/sc14srv_new/files/2a/1a/2a1a0442e3b3d597723ea20777867059.pdf"
                view?.loadUrl(url)
                return true
            }
        }
        webView.loadUrl("https://docs.google.com/gview?embedded=true&url=" + "https://14srv.uralschool.ru/upload/sc14srv_new/files/2a/1a/2a1a0442e3b3d597723ea20777867059.pdf")
    }
}