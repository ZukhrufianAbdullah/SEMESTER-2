import java.util.Scanner;

public class Mahasiswa26 {

    String nim;
    String nama;
    String kelas;
    double ipk;

    // Konstruktor default
    Mahasiswa26() {
    }

    // Konstruktor berparameter 
    Mahasiswa26(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }
}