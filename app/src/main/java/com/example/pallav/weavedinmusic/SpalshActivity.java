package com.example.pallav.weavedinmusic;


import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SpalshActivity extends AppCompatActivity {

    @BindView(R.id.et_splash) EditText etSplash;
    @BindView(R.id.tv_text_splash) TextView tvSplashText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ButterKnife.bind(this);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
               showSearchBar();
            }
        }, 2000);
    }

    private void showSearchBar(){

        //TODO: Add Animation if time allows
        etSplash.setVisibility(View.VISIBLE);
        tvSplashText.setVisibility(View.VISIBLE);
    }
}
