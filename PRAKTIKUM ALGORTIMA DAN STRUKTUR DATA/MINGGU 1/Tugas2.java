import java.util.Scanner;

public class Tugas2 {

    // Fungsi untuk menampilkan menu dan menerima input dari user
    public static int tampilkanMenu() {
        Scanner input26 = new Scanner(System.in);
        System.out.println("Pilih perhitungan yang ingin dilakukan:");
        System.out.println("1. Hitung Volume Kubus");
        System.out.println("2. Hitung Luas Permukaan Kubus");
        System.out.println("3. Hitung Keliling Kubus");
        System.out.print("Masukkan pilihan (1/2/3): ");
        return input26.nextInt();
    }

    // Fungsi untuk menghitung volume kubus
    public static double hitungVolume(double sisi) {
        return sisi * sisi * sisi; // Menghitung volume
    }

    // Fungsi untuk menghitung luas permukaan kubus
    public static double hitungLuasPermukaan(double sisi) {
        return 6 * (sisi * sisi); // Menghitung luas permukaan
    }

    // Fungsi untuk menghitung keliling kubus (total panjang rusuk)
    public static double hitungKeliling(double sisi) {
        return 12 * sisi; // Menghitung keliling dengan perkalian biasa
    }

    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);

        int pilihan = tampilkanMenu();

        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = input26.nextDouble();

        switch (pilihan) {
            case 1:
                System.out.println("Volume Kubus: " + hitungVolume(sisi));
                break;
            case 2:
                System.out.println("Luas Permukaan Kubus: " + hitungLuasPermukaan(sisi));
                break;
            case 3:
                System.out.println("Keliling Kubus: " + hitungKeliling(sisi));
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }

        input26.close();
    }
}
