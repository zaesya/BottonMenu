package com.example.bottonmenuexample;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
public class balok extends AppCompatActivity {

    private EditText editTextPanjang;
    private EditText editTextLebar;
    private EditText editTextTinggi;
    private TextView textViewResult;
    private Button btnbalok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.balok);

        editTextPanjang = findViewById(R.id.editTextPanjang);
        editTextLebar = findViewById(R.id.editTextLebar);
        editTextTinggi = findViewById(R.id.editTextTinggi);
        textViewResult = findViewById(R.id.textViewResult);
        btnbalok = findViewById(R.id.btnbalok);
        btnbalok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateVolume();
            }
        });
    }

    private void calculateVolume() {
        String panjangStr = editTextPanjang.getText().toString();
        String lebarStr = editTextLebar.getText().toString();
        String tinggiStr = editTextTinggi.getText().toString();

        float panjang = Float.parseFloat(panjangStr);
        float lebar = Float.parseFloat(lebarStr);
        float tinggi = Float.parseFloat(tinggiStr);

        float volume = panjang * lebar * tinggi;

        textViewResult.setText("Volume Balok: " + volume);
    }
}




