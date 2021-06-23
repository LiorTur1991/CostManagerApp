package com.example.costmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView mainWebView = findViewById(R.id.MainWebView);

        mainWebView.setWebChromeClient(new WebChromeClient());
        mainWebView.getSettings().setJavaScriptEnabled(true);
        mainWebView.getSettings().setAllowFileAccess(true);
        mainWebView.getSettings().setDomStorageEnabled(true);
        mainWebView.getSettings().setAllowContentAccess(true);
        mainWebView.loadUrl("file:///android_asset/htmlfiles/home.html");
    }
}