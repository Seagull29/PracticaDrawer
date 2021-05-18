package com.example.practicadrawer;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ListFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ListFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ListFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ListFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ListFragment newInstance(String param1, String param2) {
        ListFragment fragment = new ListFragment();
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

    private LinearLayout llRossini, llChopin, llTartini, llBach, llVivaldi, llLiszt;
    private Dialog dialog;

    private void PopUp(int layout) {
        dialog.setContentView(layout);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }

    private void RossiniPop(int layout) {
        PopUp(layout);
    }

    private void ChopinPop(int layout) {
        PopUp(layout);
    }

    private void TartiniPop(int layout) {
        PopUp(layout);
    }

    private void BachPop(int layout) {
        PopUp(layout);
    }

    private void VivaldiPop(int layout) {
        PopUp(layout);
    }

    private void LisztPop(int layout) {
        PopUp(layout);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View root = inflater.inflate(R.layout.fragment_list, container, false);
        this.llRossini = root.findViewById(R.id.llRossini);
        this.llChopin = root.findViewById(R.id.llChopin);
        this.llBach = root.findViewById(R.id.llBach);
        this.llVivaldi = root.findViewById(R.id.llVivaldi);
        this.llLiszt = root.findViewById(R.id.llLiszt);
        this.llTartini = root.findViewById(R.id.llTartini);

        dialog = new Dialog(getContext());

        llRossini.setOnClickListener(e -> PopUp(R.layout.rossini_layout_popup));
        llChopin.setOnClickListener(e -> PopUp(R.layout.chopin_layout_popup));
        llBach.setOnClickListener(e -> PopUp(R.layout.bach_layout_popup));
        llTartini.setOnClickListener(e -> PopUp(R.layout.tartini_layout_popup));
        llVivaldi.setOnClickListener(e -> PopUp(R.layout.vivaldi_layout_popup));
        llLiszt.setOnClickListener(e -> PopUp(R.layout.liszt_layout_popup));


        return root;
    }
}