package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView, textView2, textView3, valueofpounds, textView5, valueoftonne;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.valueofpounds);
        valueofpounds = findViewById(R.id.valueofpounds);
        textView5 = findViewById(R.id.valueoftonne);
        valueoftonne = findViewById(R.id.valueoftonne);

        editText = findViewById(R.id.editTextNumber);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                KiloToPound ();
                KiloToTonne ();

            }
        });

    }

    private void KiloToTonne() {

        String valueEnteredinKILO = editText.getText().toString();

        double Kilo = Double.parseDouble(valueEnteredinKILO);

        double tonne = Kilo / 1000;

        textView5.setText("" + tonne);
    }

    private void KiloToPound() {

        String valueEnteredinKILO = editText.getText().toString();

        double Kilo = Double.parseDouble(valueEnteredinKILO);

        double pounds = Kilo * 2.205;

        textView3.setText("" + pounds);
    }
}