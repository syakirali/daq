package com.example.sam_pc.daq.jadwal_shalat;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.sam_pc.daq.R;

public class JadwalShalatActivity extends AppCompatActivity{
    private static final String TAG = "JadwalShalatActivity";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jadwal_shalat);
    }
}
