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

public class kubus extends AppCompatActivity {
    private EditText editTextSisi;
    private TextView textViewResult;
    private Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kubus);

        editTextSisi = findViewById(R.id.editTextSisi);
        textViewResult = findViewById(R.id.textViewResult);
        button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateVolume ();
            }
        });
    }

    private void calculateVolume() {
        String sisiStr = editTextSisi.getText().toString();

        float sisi = Float.parseFloat(sisiStr);

        float volume = (float) Math.pow(sisi, 3);

        textViewResult.setText("Volume Kubus: " + volume);
    }
}

