package Agregasi;

import Relasi.Engine;

public class HP {
    public String merk;
    public Engine mesin;

    public HP(Engine e) {
        mesin = e;
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
