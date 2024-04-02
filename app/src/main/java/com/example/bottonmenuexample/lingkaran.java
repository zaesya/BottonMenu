package com.example.bottonmenuexample;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class lingkaran extends AppCompatActivity {
    private EditText editTextJariJari;
    private TextView textViewResult;
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lingkaran);

        editTextJariJari = findViewById(R.id.editTextJariJari);
        textViewResult = findViewById(R.id.textViewResult);
        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateArea();
            }
        });
    }

    private void calculateArea() {
        String jariJariStr = editTextJariJari.getText().toString();

        float jariJari = Float.parseFloat(jariJariStr);
        float area = (float) (Math.PI * Math.pow(jariJari, 2));
        textViewResult.setText("Luas Lingkaran: " + area);
    }
}
