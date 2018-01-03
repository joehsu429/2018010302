package com.example.student.a2018010302;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wv=findViewById(R.id.webView);
        //wv.setWebViewClient(new WebViewClient());
        wv.setWebChromeClient(new WebChromeClient());
        wv.getSettings().setJavaScriptEnabled(true);
        //wv.loadUrl("http://www.yahoo.co.jp");
        wv.loadData("<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/miI6KnXkR64\" frameborder=\"0\" gesture=\"media\" allow=\"encrypted-media\" allowfullscreen></iframe>","text/html;charset=UTF-8",null);

    }
}
