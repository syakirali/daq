package com.example.sam_pc.daq.jadwal_shalat;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.sql.Time;
import java.util.Date;

@Entity
public class Jadwal {
    @PrimaryKey
    private Date tanggal;

    @ColumnInfo(name = "imsak")
    private Time imsak;

    @ColumnInfo(name = "shubuh")
    private Time shubuh;

    @ColumnInfo(name = "dhuhur")
    private Time dhuhur;

    @ColumnInfo(name = "ashar")
    private Time ashar;

    @ColumnInfo(name = "maghrib")
    private Time maghrib;

    @ColumnInfo(name = "isya")
    private Time isya;

    public Jadwal(Date tanggal, Time imsak, Time shubuh, Time dhuhur, Time ashar, Time maghrib, Time isya) {
        this.tanggal = tanggal;
        this.imsak = imsak;
        this.shubuh = shubuh;
        this.dhuhur = dhuhur;
        this.ashar = ashar;
        this.maghrib = maghrib;
        this.isya = isya;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public Time getImsak() {
        return imsak;
    }

    public void setImsak(Time imsak) {
        this.imsak = imsak;
    }

    public Time getShubuh() {
        return shubuh;
    }

    public void setShubuh(Time shubuh) {
        this.shubuh = shubuh;
    }

    public Time getDhuhur() {
        return dhuhur;
    }

    public void setDhuhur(Time dhuhur) {
        this.dhuhur = dhuhur;
    }

    public Time getAshar() {
        return ashar;
    }

    public void setAshar(Time ashar) {
        this.ashar = ashar;
    }

    public Time getMaghrib() {
        return maghrib;
    }

    public void setMaghrib(Time maghrib) {
        this.maghrib = maghrib;
    }

    public Time getIsya() {
        return isya;
    }

    public void setIsya(Time isya) {
        this.isya = isya;
    }
}
