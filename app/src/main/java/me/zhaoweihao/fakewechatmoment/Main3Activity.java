package me.zhaoweihao.fakewechatmoment;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView webview = new WebView(this);
        setContentView(webview);
        ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null){
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.drawable.ic_keyboard_backspace_white_24dp);
        }
        // Simplest usage: note that an exception will NOT be thrown
        // if there is an error loading this page (see below).
        webview.loadUrl("http://mp.weixin.qq.com/s/XZZjcOCxxUwGqcQCBwhcKw");

    }
}
