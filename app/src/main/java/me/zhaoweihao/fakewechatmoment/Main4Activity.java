package me.zhaoweihao.fakewechatmoment;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Main4Activity extends AppCompatActivity {

    private ImageView imageViewFri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null){
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.drawable.ic_keyboard_backspace_white_24dp);
        }
        imageViewFri = (ImageView) findViewById(R.id.iv_fri);

        Glide.with(this).load(R.drawable.fri).into(imageViewFri);
    }
}
