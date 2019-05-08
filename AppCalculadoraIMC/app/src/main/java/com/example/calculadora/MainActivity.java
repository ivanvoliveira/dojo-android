package com.example.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonCalculadora, buttonImc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonCalculadora = findViewById(R.id.button_calculadora);
        buttonImc = findViewById(R.id.button_imc);

        buttonCalculadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaCalculadora = new Intent(MainActivity.this, Calculadora.class);
                startActivity(telaCalculadora);
            }
        });

        buttonImc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaImc = new Intent(MainActivity.this, Imc.class);
                startActivity(telaImc);
            }
        });
    }
}
