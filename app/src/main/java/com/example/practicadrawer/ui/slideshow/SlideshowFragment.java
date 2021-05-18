package com.example.practicadrawer.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.practicadrawer.R;

public class SlideshowFragment extends Fragment {

    private SlideshowViewModel slideshowViewModel;

    private EditText etUrl;
    private Button btnBuscar, btnInicio;
    private WebView wvWeb;

    private void Buscar() {
        String ur = etUrl.getText().toString();
        wvWeb.loadUrl("https://" + ur);
        etUrl.setText("");
    }

    private void Inicio() {
        wvWeb.loadUrl("https://www.google.com");
        etUrl.setText("");
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        slideshowViewModel =
                new ViewModelProvider(this).get(SlideshowViewModel.class);
        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);
        this.etUrl = root.findViewById(R.id.etUrl);
        this.wvWeb = root.findViewById(R.id.wvWeb);
        this.btnBuscar = root.findViewById(R.id.btnBuscar);
        this.btnInicio = root.findViewById(R.id.btnCerrar);

        wvWeb.setWebViewClient(new WebViewClient());

        btnBuscar.setOnClickListener(e -> Buscar());
        btnInicio.setOnClickListener(e -> Inicio());

        return root;
    }
}