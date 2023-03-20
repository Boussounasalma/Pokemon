package com.example.pokemonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    ImageView imgv;

    ProgressBar pbj;
    TextView tx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        int imageId = getIntent().getIntExtra("imageId", 0);
        imgv = findViewById(R.id.mm);
        imgv.setImageResource(imageId);

        String nouv = getIntent().getStringExtra("bc");
        int col = Color.parseColor(nouv);
        imgv.setBackgroundColor(col);


        tx= findViewById(R.id.tx3);
        String nouveauTexte = getIntent().getStringExtra("pokname");
        tx.setText(nouveauTexte);

        pbj = findViewById(R.id.progressBar4);
        int hp = getIntent().getIntExtra("HP", 0);
        pbj.setProgress(hp);

        pbj = findViewById(R.id.progressBar8);
        int at = getIntent().getIntExtra("attack", 0);
        pbj.setProgress(at);

        pbj = findViewById(R.id.progressBar6);
        int df = getIntent().getIntExtra("defense", 0);
        pbj.setProgress(df);

        pbj = findViewById(R.id.progressBar3);
        int sp = getIntent().getIntExtra("sp attack", 0);
        pbj.setProgress(sp);

        pbj = findViewById(R.id.progressBar2);
        int sd = getIntent().getIntExtra("sp defence", 0);
        pbj.setProgress(sd);

        pbj = findViewById(R.id.progressBar);
        int spe = getIntent().getIntExtra("Speed", 0);
        pbj.setProgress(spe);





    }


}