package com.example.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Imc extends AppCompatActivity {

    private Button buttonResultado;
    private TextView textViewResultado;
    private EditText editTextPeso, editTextAltura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);

        buttonResultado = findViewById(R.id.button_resultado);
        textViewResultado = findViewById(R.id.textView_resultado);
        editTextPeso = findViewById(R.id.editText_peso);
        editTextAltura = findViewById(R.id.editText_altura);

        buttonResultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String peso = editTextPeso.getText().toString();
                String altura = editTextAltura.getText().toString();

                if (peso.isEmpty()) {
                    editTextPeso.setError("Campo vazio");
                } else if (altura.isEmpty()) {
                    editTextAltura.setError("Campo vazio");
                } else {
                    Float pesoF = (Float.parseFloat(peso));
                    Float alturaF = (Float.parseFloat(altura));

                    textViewResultado.setText(calcularImc(pesoF, alturaF));
                }
            }

            public String calcularImc(Float peso, Float altura) {
                String resultadoFinal;
                Float resultado = (peso / (altura * 2));

                if (resultado <= 18.5) {
                    resultadoFinal = "Abaixo do peso " + resultado;
                } else if (resultado > 18.5 && resultado <= 25) {
                    resultadoFinal = "Peso normal " + resultado;
                } else if (resultado > 25 && resultado <= 30) {
                    resultadoFinal = "Acima do peso " + resultado;
                } else {
                    resultadoFinal = "Obesidade I, ou muito GORDO " + resultado;
                }
                return resultadoFinal;
            }
        });
    }
}
