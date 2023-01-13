package Komposisi;

public class MainProgram {
    public static void main(String[] args) {
        // Membuat object HP
        HP odyssey = new HP("Infinix", 5000);

        /* memanggil atribut dan nilai */
        odyssey.merk = "Infinix";
        odyssey.start();
        odyssey.run();
        odyssey.stop();
    }
}
