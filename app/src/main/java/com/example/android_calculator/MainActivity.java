package com.example.android_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView InputValue1;
    TextView InputValue2;
    TextView Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Botões para envento matemáticos entre os dois valores
        Button btnAdd = (Button) findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(onClickAdd());

        Button btnSubtract = (Button) findViewById(R.id.btnSubtract);
        btnSubtract.setOnClickListener(onClickSubtract());

        Button btnMultiply = (Button) findViewById(R.id.btnMultiply);
        btnMultiply.setOnClickListener(onClickMultiply());

        Button btnDivide = (Button) findViewById(R.id.btnDivide);
        btnDivide.setOnClickListener(onClickDivide());
    }

    // Evento do botão SOMAR
    private View.OnClickListener onClickAdd() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InputValue1 = (TextView) findViewById(R.id.value1);
                InputValue2 = (TextView) findViewById(R.id.value2);
                Result = (TextView) findViewById(R.id.txtResult);
                float value1 = Float.parseFloat(InputValue1.getText().toString());
                float value2 = Float.parseFloat(InputValue2.getText().toString());
                Result.setText(String.valueOf(value1+value2));
            }
        };
    }

    // Evento do botão SUBTRAIR
    private View.OnClickListener onClickSubtract() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InputValue1 = (TextView) findViewById(R.id.value1);
                InputValue2 = (TextView) findViewById(R.id.value2);
                Result = (TextView) findViewById(R.id.txtResult);
                float value1 = Float.parseFloat(InputValue1.getText().toString());
                float value2 = Float.parseFloat(InputValue2.getText().toString());
                Result.setText(String.valueOf(value1-value2));
            }
        };
    }

    // Evento do botão MULTIPLICAR
    private View.OnClickListener onClickMultiply() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InputValue1 = (TextView) findViewById(R.id.value1);
                InputValue2 = (TextView) findViewById(R.id.value2);
                Result = (TextView) findViewById(R.id.txtResult);
                float value1 = Float.parseFloat(InputValue1.getText().toString());
                float value2 = Float.parseFloat(InputValue2.getText().toString());
                Result.setText(String.valueOf(value1*value2));
            }
        };
    }

    // Evento do botão DIVIDIR
    private View.OnClickListener onClickDivide() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InputValue1 = (TextView) findViewById(R.id.value1);
                InputValue2 = (TextView) findViewById(R.id.value2);
                Result = (TextView) findViewById(R.id.txtResult);
                float value1 = Float.parseFloat(InputValue1.getText().toString());
                float value2 = Float.parseFloat(InputValue2.getText().toString());
                Result.setText(String.valueOf(value1 / value2));
            }
        };
    }
}