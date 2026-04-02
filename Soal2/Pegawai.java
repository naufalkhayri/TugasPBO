package edu.university.staff;

public class Pegawai {
    public String nama;
    public double gajiPokok;

    public Pegawai(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    public double hitungGaji() {
        return gajiPokok;
    }
}