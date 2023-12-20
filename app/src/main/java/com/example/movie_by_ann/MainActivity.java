package com.example.movie_by_ann;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    private WebView webView;
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.id_web_view);
        //config web view
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        //Load html
        String htmlFileName = "index.html";
        String baseUrl = "file:///android_asset/";
        String htmlPath = baseUrl + htmlFileName;
        webView.loadUrl(htmlPath);

    }

    //on Pressed Button
    @Override
    public void onBackPressed() {
        if(webView !=null && webView.canGoBack()){
            webView.goBack();
        }else{
            super.onBackPressed();
        }
    }
}