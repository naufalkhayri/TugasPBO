package edu.university.main;

import edu.university.model.Mahasiswa;

public class MainApp {
    public static void main(String[] args) {
        Mahasiswa[] mahasiswas = {
                new Mahasiswa("001", "Nopal", 3.7),
                new Mahasiswa("002", "Kela", 3.1),
                new Mahasiswa("003", "Verso", 2.4)
        };

        for (Mahasiswa m : mahasiswas) {
            System.out.println("NIM: " + m.nim + " | Nama: " + m.nama +
                    " | IPK: " + m.ipk + " | Kategori: " + m.getKategoriIPK());
        }
    }
}
