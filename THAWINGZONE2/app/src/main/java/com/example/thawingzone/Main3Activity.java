package com.example.thawingzone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class Main3Activity extends AppCompatActivity {
    private ImageButton bttn, bttn2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        bttn=(ImageButton)findViewById(R.id.imageButton);
        bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Main4Activity.class));

            }
        });
        bttn2=(ImageButton)findViewById(R.id.imageButton2);
        bttn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Main6Activity.class));
            }
        });

    }
}
