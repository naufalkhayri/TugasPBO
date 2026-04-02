package edu.smartdevice;

public class MainApp {
    public static void main(String[] args) {
        SmartWatch watch = new SmartWatch(20);

        System.out.println("Baterai awal : " + watch.getBatteryLevel() + "%");
        System.out.println("Koneksi awal : " + watch.isConnected());

        watch.chargeBattery(30);
        watch.connectWifi("WiFi_Kampus");

        System.out.println("\nSetelah charge & connect:");
        System.out.println("Baterai      : " + watch.getBatteryLevel() + "%");
        System.out.println("Terhubung    : " + watch.isConnected());
        System.out.println("SSID         : " + watch.ssid);
    }
}
