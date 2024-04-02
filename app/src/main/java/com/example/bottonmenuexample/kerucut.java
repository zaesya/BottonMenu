package com.example.bottonmenuexample;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class kerucut extends AppCompatActivity {

    private EditText editTextJariJari;
    private EditText editTextTinggi;
    private TextView textViewResult;
    private Button btnkerucut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kerucut);

        editTextJariJari = findViewById(R.id.editTextJariJari);
        editTextTinggi = findViewById(R.id.editTextTinggi);
        textViewResult = findViewById(R.id.textViewResult);
        btnkerucut = findViewById(R.id.btnkerucut);
        btnkerucut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateVolume();
            }
        });
    }

    private void calculateVolume() {
        String jariJariStr = editTextJariJari.getText().toString();
        String tinggiStr = editTextTinggi.getText().toString();

        float jariJari = Float.parseFloat(jariJariStr);
        float tinggi = Float.parseFloat(tinggiStr);

        float volume = (float) ((1.0 / 3.0) * Math.PI * Math.pow(jariJari, 2) * tinggi);

        textViewResult.setText("Volume Kerucut: " + volume);
    }
}

