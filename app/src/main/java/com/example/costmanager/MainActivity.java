package com.example.costmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
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
        mainWebView.loadUrl("file:///android_asset/htmlfiles/home.html");

    }

    @Override
    public void onBackPressed() {
        // Cancel back press!

    }
}