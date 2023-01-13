package Komposisi;

import Relasi.Engine;

public class HP {
    public String merk;
    public Engine mesin;

    public HP(String merkMesin, int baterai) {
        mesin = new Engine();
        mesin.merk = merkMesin;
        mesin.baterai = baterai;
    }

    public void start() {
        mesin.start();
    }

    public void stop() {
        mesin.stop();
    }

    public void run() {
        System.out.println("HP running...");
    }
}
