package com.example.junew.lasd1;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class AlphabetFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //MediaPlayer mysong;
        //mysong = MediaPlayer.create(this, R.raw.alphabetlist);
        //mysong.start();

        return inflater.inflate(R.layout.fragment_alphabet, container, false);
    }
}
