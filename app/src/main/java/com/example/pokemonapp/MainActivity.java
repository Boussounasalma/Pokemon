package com.example.pokemonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton img;
    ImageButton img2;
    ImageButton img3;
    ImageButton img4;
    ImageButton img5;
    ImageButton img6;
    ImageButton img7;
    ImageButton img8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      img = findViewById(R.id.photo1);
      img.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent = new Intent(MainActivity.this, MainActivity2.class);
              intent.putExtra("imageId", R.drawable._6);
                      intent.putExtra("pokname", "Pidgey #0016");
                      intent.putExtra("bc", "#A4907C");
                      intent.putExtra("HP", 30);
                      intent.putExtra("attack", 30);
                      intent.putExtra("defense", 30);
                      intent.putExtra("sp attack", 30);
                      intent.putExtra("sp defence", 30);
                      intent.putExtra("Speed", 40);
                      startActivity(intent);
                  }
              });
        img2 = findViewById(R.id.photo2);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("imageId", R.drawable.fa);
                intent.putExtra("bc", "#E3DFFD");
                intent.putExtra("pokname", "Butterfree #0012");
                intent.putExtra("HP", 40);
                intent.putExtra("attack", 30);
                intent.putExtra("defense", 30);
                intent.putExtra("sp attack", 60);
                intent.putExtra("sp defence", 50);
                intent.putExtra("Speed", 50);
                startActivity(intent);
            }
        });
        img3= findViewById(R.id.imageButton8);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("imageId", R.drawable.h);
                intent.putExtra("bc", "#5F8D4E");
                intent.putExtra("pokname", "Venusaur #0003");
                intent.putExtra("HP", 50);
                intent.putExtra("attack", 50);
                intent.putExtra("defense", 50);
                intent.putExtra("sp attack", 60);
                intent.putExtra("sp defence", 60);
                intent.putExtra("Speed", 50);
                startActivity(intent);
            }
        });
        img4= findViewById(R.id.imageButton9);
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("imageId", R.drawable.ho);
                intent.putExtra("bc", "#6096B4");
                intent.putExtra("pokname", "Squirtle #0007");
                intent.putExtra("HP", 30);
                intent.putExtra("attack", 30);
                intent.putExtra("defense", 40);
                intent.putExtra("sp attack", 30);
                intent.putExtra("sp defence", 40);
                intent.putExtra("Speed", 30);
                startActivity(intent);
            }
        });
        img5= findViewById(R.id.imageButton7);
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("imageId", R.drawable.hj);
                intent.putExtra("bc", "#EA5455");
                intent.putExtra("pokname", "Bulbasaur #0001");
                intent.putExtra("HP", 30);
                intent.putExtra("attack", 30);
                intent.putExtra("defense", 30);
                intent.putExtra("sp attack", 40);
                intent.putExtra("sp defence", 40);
                intent.putExtra("Speed", 30);
                startActivity(intent);
            }
        });
        img6= findViewById(R.id.imageButton6);
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("imageId", R.drawable.pm);
                intent.putExtra("bc", "#D77FA1");
                intent.putExtra("pokname", "Ivysaur #0002");
                intent.putExtra("HP", 40);
                intent.putExtra("attack", 40);
                intent.putExtra("defense", 40);
                intent.putExtra("sp attack", 50);
                intent.putExtra("sp defence", 50);
                intent.putExtra("Speed", 40);
                startActivity(intent);
            }
        });
        img7= findViewById(R.id.imageButton4);
        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("imageId", R.drawable._5);
                intent.putExtra("bc", "#FBFFB1");
                intent.putExtra("pokname", "Pikachu #0025");
                intent.putExtra("HP", 30);
                intent.putExtra("attack", 40);
                intent.putExtra("defense", 30);
                intent.putExtra("sp attack", 30);
                intent.putExtra("sp defence", 30);
                intent.putExtra("Speed", 60);
                startActivity(intent);
            }
        });
        img8= findViewById(R.id.imageButton5);
        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("imageId", R.drawable.p3);
                intent.putExtra("bc", "#BFACE2");
                intent.putExtra("pokname", "Ekans #0023");
                intent.putExtra("HP", 20);
                intent.putExtra("attack", 40);
                intent.putExtra("defense", 30);
                intent.putExtra("sp attack", 30);
                intent.putExtra("sp defence", 40);
                intent.putExtra("Speed", 40);
                startActivity(intent);
            }
        });
          }}







