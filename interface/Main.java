import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // membuat objek HP
        Phone InfinixHOT11S = new Infinix();
        // membuat objek user
        PhoneUser desatra = new PhoneUser(InfinixHOT11S);
        // kita coba nyalakan HP nya
        desatra.turnOnThePhone();
        // buat program
        Scanner input = new Scanner(System.in);
        String aksi;

        while (true) {
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------");
            System.out.println("Pilih aksi>");
            aksi = input.nextLine();

            if (aksi.equalsIgnoreCase("1")) {
                desatra.turnOnThePhone();
            } else if (aksi.equalsIgnoreCase("2")) {
                desatra.turnOffThePhone();
            } else if (aksi.equalsIgnoreCase("3")) {
                desatra.makePhoneLouder();
            } else if (aksi.equalsIgnoreCase("4")) {
                desatra.makePhoneSilent();
            } else if (aksi.equalsIgnoreCase("0")) {
                System.exit(0);
            } else {
                System.out.println("Kamu memilih aksi yang salah!");
            }
        }
    }
}
