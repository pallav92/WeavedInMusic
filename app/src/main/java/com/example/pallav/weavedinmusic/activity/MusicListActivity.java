package com.example.pallav.weavedinmusic.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AutoCompleteTextView;

import com.example.pallav.weavedinmusic.R;

import butterknife.BindView;


public class MusicListActivity extends AppCompatActivity {

    @BindView(R.id.toolbar) Toolbar toolbar;
    @BindView(R.id.et_search) AutoCompleteTextView actSearch;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_list);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        View view = getLayoutInflater().inflate(R.layout.layout_toolbar,null);
        toolbar.addView(view);


    }
}
