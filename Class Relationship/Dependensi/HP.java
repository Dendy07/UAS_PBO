package Dependensi;

import Relasi.Engine;

public class HP {
    public String merk;

    public void start(Engine e) {
        e.start();
    }

    public void stop(Engine e) {
        e.stop();
    }

    public void run() {
        System.out.println("HP running...");
    }
}
