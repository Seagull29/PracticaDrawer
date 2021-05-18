package com.example.practicadrawer.ui.gallery;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.practicadrawer.R;

public class GalleryFragment extends Fragment {

    private GalleryViewModel galleryViewModel;
    private ImageButton btnMusic;
    private MediaPlayer mediaPlayer;

    private void Reproducir() {
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
            Toast.makeText(getContext(), "Pausando", Toast.LENGTH_SHORT).show();
        } else {
            mediaPlayer.start();
            Toast.makeText(getContext(), "Reanudando", Toast.LENGTH_SHORT).show();
        }
    }

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel = new ViewModelProvider(this).get(GalleryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);
        this.btnMusic = root.findViewById(R.id.btnMusic);
        this.mediaPlayer = MediaPlayer.create(getContext(), R.raw.holdontight);

        btnMusic.setOnClickListener(e -> Reproducir());


        return root;
    }
}