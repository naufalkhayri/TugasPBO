package edu.transport;

public class MainApp {
    public static void main(String[] args) {
        Kendaraan[] kendaraans = {
                new Mobil("Toyota Avanza", 120),
                new Motor("Honda Vario", 110)
        };

        double jarak = 120;

        for (Kendaraan k : kendaraans) {
            System.out.printf("Kendaraan: %-15s | Kec. Maks: %.0f km/h | Waktu Tempuh %.0f km: %.2f jam%n",
                    k.nama, k.kecepatanMaks, jarak, k.hitungWaktuTempuh(jarak));
        }
    }
}
