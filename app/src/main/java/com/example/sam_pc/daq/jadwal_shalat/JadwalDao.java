package com.example.sam_pc.daq.jadwal_shalat;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface JadwalDao {
    @Query("SELECT * FROM jadwal")
    List<Jadwal> jadwal_shalat();

    @Insert
    void insertAll(Jadwal... jadwal);
}
