package com.example.frank_flores_prueba01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button button1 = findViewById(R.id.button_siguiente);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });

    }


    public static void Division() {

        int dividendo = 0;
        int divisor = 0;
        int cociente = 0;
        int residuo = dividendo;

        while (residuo >= divisor) {
            residuo -= divisor;
            cociente++;
        }

        System.out.println("Cociente: " + cociente);
        System.out.println("Residuo: " + residuo);

    }





}