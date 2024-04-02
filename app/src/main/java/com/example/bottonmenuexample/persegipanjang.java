package com.example.bottonmenuexample;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class persegipanjang extends AppCompatActivity {
    private EditText editTextLength;
    private EditText editTextWidth;
    private TextView textViewResult;
    private Button button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.persegipanjang);

        editTextLength = findViewById(R.id.editTextLength);
        editTextWidth = findViewById(R.id.editTextWidth);
        textViewResult = findViewById(R.id.textViewResult);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateArea();
            }
        });
    }

    private void calculateArea() {
        String lengthStr = editTextLength.getText().toString();
        String widthStr = editTextWidth.getText().toString();

        float length = Float.parseFloat(lengthStr);
        float width = Float.parseFloat(widthStr);
        float area = length * width;

        textViewResult.setText("Luas Persegi Panjang: " + area);
    }
}
