package com.geektech.myhomeworkapplicationfragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initFragments();


    }

    private void initFragments() {

        getSupportFragmentManager().beginTransaction().add(R.id.fl_containerFirst,new PictureFragment()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.fl_containerSecond,new SongFragment()).commit();

    }


}