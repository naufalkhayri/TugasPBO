package edu.university.staff;

public class MainApp {
    public static void main(String[] args) {
        Pegawai[] pegawais = {
                new Dosen("Pak Andri", 5000000, 10),
                new Dosen("Pak Poltak", 4500000, 8),
                new StafAdministrasi("Cici", 3000000, 5),
                new StafAdministrasi("Dedi", 3500000, 3)
        };

        for (Pegawai p : pegawais) {
            System.out.println("Nama: " + p.nama +
                    " | Gaji Pokok: " + p.gajiPokok +
                    " | Total Gaji: " + p.hitungGaji());
        }
    }
}
