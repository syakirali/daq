package com.example.sam_pc.daq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.sam_pc.daq.Quran.QuranActivity;
import com.example.sam_pc.daq.jadwal_shalat.JadwalShalatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    LinearLayout bacaQuran;
    LinearLayout kitab;
    LinearLayout jadwalShalat;
    LinearLayout doa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bacaQuran = findViewById(R.id.tombol_baca_quran);
        kitab = findViewById(R.id.tombol_kitab);
        jadwalShalat = findViewById(R.id.tombol_jadwal_shalat);
        doa = findViewById(R.id.tombol_doa);

        bacaQuran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, QuranActivity.class));
            }
        });

        jadwalShalat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, JadwalShalatActivity.class));
            }
        });

    }


}
