import java.util.Scanner;

public class Pemilihan {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");

        // Input nilai tugas, kuis, UTS, dan UAS
        System.out.print("Masukkan Nilai Tugas: ");
        double nilaiTugas = input26.nextDouble();

        System.out.print("Masukkan Nilai Kuis: ");
        double nilaiKuis = input26.nextDouble();

        System.out.print("Masukkan Nilai UTS: ");
        double nilaiUTS = input26.nextDouble();

        System.out.print("Masukkan Nilai UAS: ");
        double nilaiUAS = input26.nextDouble();

        // Validasi nilai (0-100)
        if (nilaiTugas < 0 || nilaiTugas > 100 || nilaiKuis < 0 || nilaiKuis > 100 ||
            nilaiUTS < 0 || nilaiUTS > 100 || nilaiUAS < 0 || nilaiUAS > 100) {
            System.out.println("==============================");
            System.out.println("Nilai tidak valid");
            System.out.println("==============================");
        } else {
            // Hitung nilai akhir
            double nilaiAkhir = (0.2 * nilaiTugas) + (0.2 * nilaiKuis) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
            String nilaiHuruf = "";
            String keterangan = "";

            // Tentukan nilai huruf dan keterangan
            if (nilaiAkhir >= 80) {
                nilaiHuruf = "A";
                keterangan = "LULUS";
            } else if (nilaiAkhir >= 73) {
                nilaiHuruf = "B+";
                keterangan = "LULUS";
            } else if (nilaiAkhir >= 65) {
                nilaiHuruf = "B";
                keterangan = "LULUS";
            } else if (nilaiAkhir >= 60) {
                nilaiHuruf = "C+";
                keterangan = "LULUS";
            } else if (nilaiAkhir >= 50) {
                nilaiHuruf = "C";
                keterangan = "LULUS";
            } else if (nilaiAkhir >= 39) {
                nilaiHuruf = "D";
                keterangan = "TIDAK LULUS";
            } else {
                nilaiHuruf = "E";
                keterangan = "TIDAK LULUS";
            }

            // Tampilkan hasil
            System.out.println("==============================");
            System.out.println("Nilai akhir : " + nilaiAkhir);
            System.out.println("Nilai Huruf : " + nilaiHuruf);
            System.out.println("==============================");
            System.out.println((keterangan.equals("LULUS") ? "SELAMAT ANDA LULUS" : "ANDA TIDAK LULUS"));
        }

        input26.close();
    }
}