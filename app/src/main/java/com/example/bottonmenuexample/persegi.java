package com.example.bottonmenuexample;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class persegi  extends AppCompatActivity {
    EditText editTextSisi;
    Button buttonHitung;
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.persegi);

        editTextSisi = findViewById(R.id.editTextSisi);
        buttonHitung = findViewById(R.id.buttonHitung);
        textViewResult = findViewById(R.id.textViewResult);
        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasDanKeliling();
            }
        });
    }

    private void hitungLuasDanKeliling() {
        String inputSisi = editTextSisi.getText().toString().trim();

        if (inputSisi.isEmpty()) {
            Toast.makeText(this, "Masukkan panjang sisi terlebih dahulu", Toast.LENGTH_SHORT).show();
            return;
        }

        double sisi = Double.parseDouble(inputSisi);
        double luas = sisi * sisi;
        double keliling = 4 * sisi;

        textViewResult.setText("Luas: " + luas + ", Keliling: " + keliling);
    }
}
