package com.example.kalkulator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Latihan2 extends AppCompatActivity {
Button btLatihan2Tambah;
Button btLatihan2Kurang;
Button btLatihan2Kali;
Button btLatihan2Bagi;
Button btLatihan2Bersihkan;
TextView tvLatihanDua;
TextView tvTextHasilLatihanDua;
TextView tvHasilLatihanDua;
EditText etInputanSatuLatihan2;
EditText etInputanDuaLatihan2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_latihan2);
       //coding disini
        btLatihan2Tambah = findViewById(R.id.btLatihan2Tambah);
        btLatihan2Kurang = findViewById(R.id.btLatihan2Kurang);
        btLatihan2Kali = findViewById(R.id.btLatihan2Kali);
        btLatihan2Bagi = findViewById(R.id.btLatihan2Bagi);
        btLatihan2Bersihkan = findViewById(R.id.btLatihan2Bersihkan);
        tvLatihanDua = findViewById(R.id.tvLatihanDua);
        tvTextHasilLatihanDua = findViewById(R.id.tvTextHasilLatihanDua);
        tvHasilLatihanDua = findViewById(R.id.tvHasilLatihanDua);
        etInputanSatuLatihan2 = findViewById(R.id.etInputanSatuLatihan2);
        etInputanDuaLatihan2 = findViewById(R.id.etInputanDuaLatihan2);

        btLatihan2Tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double bil1, bil2, hasil;
                bil1=Double.valueOf(etInputanSatuLatihan2.getText().toString().trim());
                bil2=Double.valueOf(etInputanDuaLatihan2.getText().toString().trim());
                hasil=bil1+bil2;
                tvHasilLatihanDua.setText("" + hasil);
            }
        });
        btLatihan2Kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double bil1, bil2, hasil;
                bil1=Double.valueOf(etInputanSatuLatihan2.getText().toString().trim());
                bil2=Double.valueOf(etInputanDuaLatihan2.getText().toString().trim());
                hasil=bil1-bil2;
                tvHasilLatihanDua.setText("" + hasil);
            }
        });
        btLatihan2Kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double bil1, bil2, hasil;
                bil1=Double.valueOf(etInputanSatuLatihan2.getText().toString().trim());
                bil2=Double.valueOf(etInputanDuaLatihan2.getText().toString().trim());
                hasil=bil1*bil2;
                tvHasilLatihanDua.setText("" + hasil);
            }
        });
        btLatihan2Bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double bil1, bil2, hasil;
                bil1=Double.valueOf(etInputanSatuLatihan2.getText().toString().trim());
                bil2=Double.valueOf(etInputanDuaLatihan2.getText().toString().trim());
                hasil=bil1/bil2;
                tvHasilLatihanDua.setText("" + hasil);
            }
        });
        btLatihan2Bersihkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etInputanSatuLatihan2.setText("");
                etInputanDuaLatihan2.setText("");
                tvHasilLatihanDua.setText("");
            }
        });
    }
}