package Asosiasi;

import Relasi.Engine;

public class MainProgram {
    public static void main(String[] args) {
        // Membuat object engine
        Engine mesin = new Engine();

        /* memanggil atribut dan nilai */
        mesin.merk = "Infinix";
        mesin.baterai = 5000;

        HP odyssey = new HP();

        odyssey.merk = "Infinix";
        odyssey.mesin = mesin;
        odyssey.start();
        odyssey.run();
        odyssey.stop();
    }
}
