package com.example.hitungvolume;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button kub ;
    Button bol ;
    Button tab ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kub = (Button)findViewById(R.id.kubus);
        bol = (Button) findViewById(R.id.bola);
        tab = (Button) findViewById(R.id.tabung);




        kub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Activitykubus.class
                );
                startActivity(intent);
            }
        });
        bol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Activitybola.class);
                startActivity(intent);
            }
        });
        tab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Activitytabung.class);
                startActivity(intent);
            }
        });

        }
        }







