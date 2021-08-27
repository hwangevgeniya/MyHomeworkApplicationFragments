package com.geektech.myhomeworkapplicationfragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SongActivity2 extends AppCompatActivity {

    private TextView tvSong2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song2);

        initViews();

        tvSong2.setText(getIntent().getStringExtra("key"));

    }

    private void initViews() {

        tvSong2 = findViewById(R.id.tv_song_window2);

    }
}