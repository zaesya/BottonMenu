package com.example.bottonmenuexample;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class segitiga extends AppCompatActivity {
    private EditText editTextAlas;
    private EditText editTextTinggi;
    private TextView textViewResult;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segitiga);

        editTextAlas = findViewById(R.id.editTextAlas);
        editTextTinggi = findViewById(R.id.editTextTinggi);
        textViewResult = findViewById(R.id.textViewResult);
        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateArea();
            }
        });
    }

    private void calculateArea() {
        String alasStr = editTextAlas.getText().toString();
        String tinggiStr = editTextTinggi.getText().toString();

        float alas = Float.parseFloat(alasStr);
        float tinggi = Float.parseFloat(tinggiStr);
        float area = (alas * tinggi) / 2;

        textViewResult.setText("Luas Segitiga: " + area);
    }
}

