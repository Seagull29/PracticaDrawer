package com.example.practicadrawer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {
    private TextView lblTitulo, lblNombre, lblCarrera, lblSemestre;
    private Animation ivAnimation, ivAnimation2;

    private final long SPLASH_SCREEN_DELAY = 4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        this.lblTitulo = findViewById(R.id.tvTitulo);
        this.lblNombre = findViewById(R.id.tvNombre);
        this.lblCarrera = findViewById(R.id.tvCarrera);
        this.lblSemestre = findViewById(R.id.tvSemestre);
        this.ivAnimation = AnimationUtils.loadAnimation(this, R.anim.animation);
        this.ivAnimation2 = AnimationUtils.loadAnimation(this, R.anim.animation2);
        lblTitulo.setAnimation(ivAnimation);
        lblNombre.setAnimation(ivAnimation);
        lblCarrera.setAnimation(ivAnimation2);
        lblSemestre.setAnimation(ivAnimation2);

        // Implementar tiempo
        TimerTask time = new TimerTask() {
            @Override
            public void run() {
                Intent inten = new Intent().setClass(SplashActivity.this, MainActivity.class);
                startActivity(inten);
                finish();
            }
        };
        // Se ejecuta una vez cerrado
        Timer timer = new Timer();
        timer.schedule(time, SPLASH_SCREEN_DELAY);
    }
}