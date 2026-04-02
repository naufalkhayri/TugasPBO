package edu.smartdevice;

public class SmartWatch implements Rechargeable, Connectable {
    int batteryLevel;
    boolean connected;
    String ssid;

    public SmartWatch(int batteryLevel) {
        this.batteryLevel = batteryLevel;
        this.connected = false;
        this.ssid = "";
    }

    @Override
    public void chargeBattery(int menit) {
        batteryLevel = Math.min(100, batteryLevel + menit);
    }

    @Override
    public int getBatteryLevel() {
        return batteryLevel;
    }

    @Override
    public void connectWifi(String ssid) {
        if (ssid != null && !ssid.isEmpty()) {
            this.ssid = ssid;
            this.connected = true;
        }
    }

    @Override
    public boolean isConnected() {
        return connected;
    }
}