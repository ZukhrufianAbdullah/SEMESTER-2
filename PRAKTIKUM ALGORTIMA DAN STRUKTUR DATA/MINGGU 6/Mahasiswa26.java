import java.util.Scanner;

public class Mahasiswa26 {

    String nim;
    String nama;
    String kelas;
    double ipk;

    // Konstruktor default
    Mahasiswa26() {}

    // Konstruktor berparameter (dibuat ada yang nama var parameter inputnya ada yang sama apa tidak)
    Mahasiswa26(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    void tampilInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }

    void isiData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama  : ");
        nama = input.nextLine();
        System.out.print("NIM   : ");
        nim = input.nextLine();
        System.out.print("Kelas : ");
        kelas = input.nextLine();
        System.out.print("IPK   : ");
        ipk = input.nextDouble();
    }
}