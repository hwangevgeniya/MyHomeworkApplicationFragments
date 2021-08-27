package com.geektech.myhomeworkapplicationfragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class SongFragment extends Fragment implements MainAdapter.OnClick {

    private RecyclerView recyclerView;
    private MainAdapter adapter;
    private ArrayList<Song> list;
    private String song2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_song, container, false);

    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initRv(view);
        adapter.setOnClick(this::onItemClick);

    }

    private void initRv(View view) {

        recyclerView = view.findViewById(R.id.rv_songs);
        adapter = new MainAdapter();
        adapter.setList(createList());
        recyclerView.setAdapter(adapter);
    }

    private ArrayList<Song> createList() {
        int index = 0;
        list = new ArrayList<>();
        list.add(new Song(1, "Blank Space", "Taylor Swift", "3:22"));
        list.add(new Song(2, "Watch me", "Silento", "5:36"));
        list.add(new Song(3, "Earned it", "The Weekend", "4:51"));
        list.add(new Song(4, "The Hills", "The Weekend", "3:41"));
        list.add(new Song(5, "Writings on the wall", "Sam Smith", "5:33"));
        list.add(new Song(6, "Unstoppable", "Sia", "4:00"));
        list.add(new Song(7, "Blank Space", "Taylor Swift", "3:22"));
        list.add(new Song(8, "Watch me", "Silento", "5:36"));
        list.add(new Song(9, "Earned it", "The Weekend", "4:51"));
        list.add(new Song(10, "The Hills", "The Weekend", "3:41"));
        list.add(new Song(11, "Writings on the wall", "Sam Smith", "5:33"));
        list.add(new Song(12, "Unstoppable", "Sia", "4:00"));
        list.add(new Song(13, "Blank Space", "Taylor Swift", "3:22"));
        list.add(new Song(14, "Watch me", "Silento", "5:36"));
        list.add(new Song(15, "Earned it", "The Weekend", "4:51"));
        list.add(new Song(16, "The Hills", "The Weekend", "3:41"));
        list.add(new Song(17, "Writings on the wall", "Sam Smith", "5:33"));
        list.add(new Song(18, "Unstoppable", "Sia", "4:00"));
        return list;
    }

    @Override
    public void onItemClick(Song song) {

        Intent intent = new Intent(getContext(), SongActivity2.class);
        intent.putExtra("key",song.getSongName());
        startActivity(intent);
    }
}