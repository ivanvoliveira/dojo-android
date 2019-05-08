package com.example.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculadora extends AppCompatActivity {

    private EditText editTextNum1, editTextNum2;
    private Button buttonSoma, buttonSub, buttonDiv, buttonMult;
    private TextView textViewResultado;
    private String n1, n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        editTextNum1 = findViewById(R.id.editText_n1);
        editTextNum2 = findViewById(R.id.editText_n2);
        buttonSoma = findViewById(R.id.button_soma);
        buttonSub = findViewById(R.id.button_sub);
        buttonDiv = findViewById(R.id.button_div);
        buttonMult = findViewById(R.id.button_mult);
        textViewResultado = findViewById(R.id.textView_result);

        buttonSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = editTextNum1.getText().toString();
                n2 = editTextNum2.getText().toString();

                if (n1.isEmpty()) {
                    editTextNum1.setError("Campo Vazio");
                } else if (n2.isEmpty()) {
                    editTextNum2.setError("Campo Vazio");
                } else {
                    textViewResultado.setText((Float.parseFloat(n1) + Float.parseFloat(n2) + ""));
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = editTextNum1.getText().toString();
                n2 = editTextNum2.getText().toString();

                if (n1.isEmpty()) {
                    editTextNum1.setError("Campo Vazio");
                } else if (n2.isEmpty()) {
                    editTextNum2.setError("Campo Vazio");
                } else {
                    textViewResultado.setText((Float.parseFloat(n1) - Float.parseFloat(n2) + ""));
                }
            }
        });

        buttonMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = editTextNum1.getText().toString();
                n2 = editTextNum2.getText().toString();


                if (n1.isEmpty()) {
                    editTextNum1.setError("Campo Vazio");
                } else if (n2.isEmpty()) {
                    editTextNum2.setError("Campo Vazio");
                } else {
                    textViewResultado.setText((Float.parseFloat(n1) * Float.parseFloat(n2) + ""));
                }
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = editTextNum1.getText().toString();
                n2 = editTextNum2.getText().toString();

                if (n1.isEmpty()) {
                    editTextNum1.setError("Campo Vazio");
                } else if (n2.isEmpty()) {
                    editTextNum2.setError("Campo Vazio");
                } else {
                    textViewResultado.setText((Float.parseFloat(n1) / Float.parseFloat(n2) + ""));
                }
            }
        });
    }
}
