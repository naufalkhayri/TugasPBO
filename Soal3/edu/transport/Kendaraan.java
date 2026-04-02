package edu.transport;

public abstract class Kendaraan {
    public String nama;
    public double kecepatanMaks;

    public Kendaraan(String nama, double kecepatanMaks) {
        this.nama = nama;
        this.kecepatanMaks = kecepatanMaks;
    }

    public abstract double hitungWaktuTempuh(double jarak);
}