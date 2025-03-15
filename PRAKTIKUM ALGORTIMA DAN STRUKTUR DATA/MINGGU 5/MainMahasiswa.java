import java.util.Scanner;

public class MainMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== DATA MAHASISWA JTI POLINEMA ===");
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();
        input.nextLine(); 

        Mahasiswa[] mahasiswa = new Mahasiswa[jumlah];
        int[] nilaiUTS = new int[jumlah];
        int[] nilaiUAS = new int[jumlah];

        // Input data mahasiswa
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));

            System.out.print("Nama: ");
            String nama = input.nextLine();

            System.out.print("NIM: ");
            int nim = input.nextInt();

            System.out.print("Tahun Masuk: ");
            int tahunMasuk = input.nextInt();

            System.out.print("Nilai UTS: ");
            int nilaiUTSInput = input.nextInt();

            System.out.print("Nilai UAS: ");
            int nilaiUASInput = input.nextInt();
            input.nextLine(); 

            mahasiswa[i] = new Mahasiswa(nama, nim, tahunMasuk, nilaiUTSInput, nilaiUASInput);
            nilaiUTS[i] = nilaiUTSInput;
            nilaiUAS[i] = nilaiUASInput;
        }

        // Menghitung nilai UTS tertinggi
        int utsTertinggi = HitungNilai.maxDC(nilaiUTS, 0, nilaiUTS.length - 1);
        System.out.println("\n1) Nilai UTS tertinggi menggunakan Divide and Conquer: " + utsTertinggi);

        // Menghitung nilai UTS terendah
        int utsTerendah = HitungNilai.minDC(nilaiUTS, 0, nilaiUTS.length - 1);
        System.out.println("2) Nilai UTS terendah menggunakan Divide and Conquer: " + utsTerendah);

        // Menghitung rata-rata nilai UAS
        double rataRataUAS = HitungNilai.averageBF(nilaiUAS);
        System.out.println("3) Rata-rata nilai UAS dari semua mahasiswa menggunakan Brute Force: " + rataRataUAS);

        input.close();
    }
}