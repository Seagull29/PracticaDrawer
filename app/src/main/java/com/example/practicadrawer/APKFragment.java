package com.example.practicadrawer;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link APKFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class APKFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public APKFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment APKFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static APKFragment newInstance(String param1, String param2) {
        APKFragment fragment = new APKFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    private ImageButton btnFace, btnInsta, btnYou, btnTwi, btnVino, btnVivinos, btnGoo;

    private void Face() {
        try {
            startActivity(new Intent(getContext().getPackageManager().getLaunchIntentForPackage("com.facebook.katana")));
        } catch(Exception e) {
            Toast.makeText(getContext(), "No tienes instalada esta aplicacion.", Toast.LENGTH_LONG);
            e.printStackTrace();
        }
    }

    private void Insta() {
        try {
            startActivity(new Intent(getContext().getPackageManager().getLaunchIntentForPackage("com.instagram.android")));
        } catch(Exception e) {
            Toast.makeText(getContext(), "No tienes instalada esta aplicacion.", Toast.LENGTH_LONG);
            e.printStackTrace();
        }
    }

    private void You() {
        try {
            startActivity(new Intent(getContext().getPackageManager().getLaunchIntentForPackage("com.google.android.youtube")));
        } catch(Exception e) {
            Toast.makeText(getContext(), "No tienes instalada esta aplicacion.", Toast.LENGTH_LONG);
            e.printStackTrace();
        }
    }

    private void Vivino() {
        try {
            startActivity(new Intent(getContext().getPackageManager().getLaunchIntentForPackage("vivino.web.app")));
        } catch(Exception e) {
            Toast.makeText(getContext(), "No tienes instalada esta aplicacion.", Toast.LENGTH_LONG);
            e.printStackTrace();
        }

    }

    private void Vino() {
        try {
            startActivity(new Intent(getContext().getPackageManager().getLaunchIntentForPackage("com.andromo.dev554305.app743130")));
        } catch(Exception e) {
            Toast.makeText(getContext(), "No tienes instalada esta aplicacion.", Toast.LENGTH_LONG);
            e.printStackTrace();
        }
    }

    private void Google() {
        try {
            startActivity(new Intent(getContext().getPackageManager().getLaunchIntentForPackage("com.android.chrome")));
        } catch(Exception e) {
            Toast.makeText(getContext(), "No tienes instalada esta aplicacion.", Toast.LENGTH_LONG);
            e.printStackTrace();
        }
    }

    private void Twitter() {
        try {
            startActivity(new Intent(getContext().getPackageManager().getLaunchIntentForPackage("com.twitter.android")));
        } catch(Exception e) {
            Toast.makeText(getContext(), "No tienes instalada esta aplicacion.", Toast.LENGTH_LONG);
            e.printStackTrace();
        }
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_a_p_k, container, false);
        this.btnFace = root.findViewById(R.id.btnFace);
        this.btnYou = root.findViewById(R.id.btnYou);
        this.btnTwi = root.findViewById(R.id.btnTwi);
        this.btnInsta = root.findViewById(R.id.btnInsta);
        this.btnGoo = root.findViewById(R.id.btnGoo);
        this.btnVino = root.findViewById(R.id.btnVino);
        this.btnVivinos = root.findViewById(R.id.btnVivinos);

        btnFace.setOnClickListener(e -> Face());
        btnInsta.setOnClickListener(e -> Insta());
        btnYou.setOnClickListener(e -> You());
        btnVivinos.setOnClickListener(e -> Vivino());
        btnVino.setOnClickListener(e -> Vino());
        btnGoo.setOnClickListener(e -> Google());
        btnTwi.setOnClickListener(e -> Twitter());
        return root;
    }
}