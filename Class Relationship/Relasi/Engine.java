package Relasi;

public class Engine implements IEngine {
    public String merk;
    public int baterai;

    @Override
    public void start() {
        System.out.println("Engine starting...");
    }

    @Override
    public void stop() {
        System.out.println("Engine stopped...");
    }
}
