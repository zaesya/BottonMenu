package com.example.bottonmenuexample;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ImageView;


import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class silinder extends AppCompatActivity {
    private EditText editTextJariJari;
    private EditText editTextTinggi;
    private TextView textViewResult;
    private Button btnsilinder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.silinder);

        editTextJariJari = findViewById(R.id.editTextJariJari);
        editTextTinggi = findViewById(R.id.editTextTinggi);
        textViewResult = findViewById(R.id.textViewResult);
        btnsilinder = findViewById(R.id.btnsilinder);
        btnsilinder.setOnClickListener(new View.OnClickListener() {
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

        float volume = (float) (Math.PI * Math.pow(jariJari, 2) * tinggi);

        textViewResult.setText("Volume Silinder: " + volume);
    }
}


