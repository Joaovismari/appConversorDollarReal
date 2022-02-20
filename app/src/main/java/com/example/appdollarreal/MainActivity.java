package com.example.appdollarreal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText edtValorDollar, edtQuantDollar;
    TextView txtResultado;
    Button btConverter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtValorDollar = findViewById(R.id.edtValorDollar);
        edtQuantDollar = findViewById(R.id.edtQuantDollar);

        txtResultado = findViewById(R.id.txtResultado);

    }


    public void calcular(View view) {
        double quantDollar = Double.parseDouble(edtQuantDollar.getText().toString());
        double valorDollar = Double.parseDouble(edtValorDollar.getText().toString());

        double totalReais = quantDollar*valorDollar;
        DecimalFormat decimal = new DecimalFormat("0.00");
        String valorFormatado = decimal.format(totalReais);

        txtResultado.setText(String.format("R$: %s", valorFormatado));

    }
}