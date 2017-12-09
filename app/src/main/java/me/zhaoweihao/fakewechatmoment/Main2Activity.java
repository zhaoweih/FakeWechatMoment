package me.zhaoweihao.fakewechatmoment;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Main2Activity extends AppCompatActivity {

    private ImageView imageViewMy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null){
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.drawable.ic_keyboard_backspace_white_24dp);
        }
        imageViewMy = (ImageView) findViewById(R.id.iv_my);

        Glide.with(this).load(R.drawable.my).into(imageViewMy);
    }
}
