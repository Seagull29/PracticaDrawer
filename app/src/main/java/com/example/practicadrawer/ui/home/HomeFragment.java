package com.example.practicadrawer.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.practicadrawer.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    private Button btnSuma, btnResta, btnMul, btnDiv;
    private EditText etNum1, etNum2, etResultado;

    private void Sumar() {
        double nro1 = Double.valueOf(etNum1.getText().toString());
        double nro2 = Double.valueOf(etNum2.getText().toString());
        double r = nro1 + nro2;
        etResultado.setText(String.valueOf(r));
    }

    private void Restar() {
        double nro1 = Double.valueOf(etNum1.getText().toString());
        double nro2 = Double.valueOf(etNum2.getText().toString());
        double r = nro1 - nro2;
        etResultado.setText(String.valueOf(r));
    }

    private void Multiplicar() {
        double nro1 = Double.valueOf(etNum1.getText().toString());
        double nro2 = Double.valueOf(etNum2.getText().toString());
        double r = nro1 * nro2;
        etResultado.setText(String.valueOf(r));
    }

    private void Dividir() {
        double nro1 = Double.valueOf(etNum1.getText().toString());
        double nro2 = Double.valueOf(etNum2.getText().toString());
        double r = nro1 / nro2;
        if (nro2 == 0) {
            etResultado.setText("Indefinido");
        } else {
            etResultado.setText(String.valueOf(r));
        }
    }

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        this.btnSuma = root.findViewById(R.id.btnSumar);
        this.btnResta = root.findViewById(R.id.btnRestar);
        this.btnMul = root.findViewById(R.id.btnMultiplicar);
        this.btnDiv = root.findViewById(R.id.btnDividir);
        this.etNum1 = root.findViewById(R.id.etNro1);
        this.etNum2 = root.findViewById(R.id.etNro2);
        this.etResultado = root.findViewById(R.id.etResultado);

        btnSuma.setOnClickListener(e -> Sumar());
        btnResta.setOnClickListener(e -> Restar());
        btnMul.setOnClickListener(e -> Multiplicar());
        btnDiv.setOnClickListener(e -> Dividir());

        return root;
    }
}