package com.example.sam_pc.daq;

import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.Database;

import com.example.sam_pc.daq.jadwal_shalat.Jadwal;

@Database(entities = {Jadwal.class}, version = 1)
public class NafalDatabase extends RoomDatabase{

    @Override
    protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration config) {
        return null;
    }

    @Override
    protected InvalidationTracker createInvalidationTracker() {
        return null;
    }
}
