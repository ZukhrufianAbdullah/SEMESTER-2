package Jobsheet9;

import java.util.Scanner;

public class SuratMain26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat26 stack = new StackSurat26(10); // Stack max 10 surat
        int pilih;

        do {
            System.out.println("\n===== MENU SURAT IZIN =====");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat       : ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa : ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas          : ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.next().charAt(0);
                    System.out.print("Durasi (hari)  : ");
                    int durasi = sc.nextInt();
                    sc.nextLine(); 

                    Surat26 surat = new Surat26(id, nama, kelas, jenis, durasi);
                    stack.push(surat);
                    break;

                case 2:
                    Surat26 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Surat yang diproses:");
                        diproses.tampilkan();
                    }
                    break;

                case 3:
                    Surat26 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("Surat izin terakhir:");
                        terakhir.tampilkan();
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cariNama = sc.nextLine();
                    stack.cariSurat(cariNama);
                    break;

                case 5:
                    System.out.println("Terima kasih telah menggunakan sistem.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilih != 5);

        sc.close();
    }
}