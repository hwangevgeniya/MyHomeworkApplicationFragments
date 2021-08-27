package com.geektech.myhomeworkapplicationfragments;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    private ArrayList<Song> list = new ArrayList<>();
    private OnClick onClick;

    public void setList(ArrayList<Song> list){
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    public void setOnClick(OnClick onClick) {
        this.onClick = onClick;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_songs, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvSong, tvArtist, tvNumber, tvDuration;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvSong = itemView.findViewById(R.id.tv_song);
            tvArtist = itemView.findViewById(R.id.tv_artist);
            tvNumber = itemView.findViewById(R.id.tv_number);
            tvDuration = itemView.findViewById(R.id.tv_duration);
        }

        public void onBind(Song song) {
            tvSong.setText(song.getSongName());
            tvArtist.setText(song.getArtistName());
            tvNumber.setText(String.valueOf(song.getIndex()));
            tvDuration.setText(song.getDuration());

            itemView.setOnClickListener(v->{
                onClick.onItemClick(song);
            });
        }
    }

    public interface OnClick{

        void onItemClick(Song song);
    }
}
