import java.util.Scanner;

public class Matakuliah26 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public Matakuliah26(){
      
    }

    public Matakuliah26(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    void tambahData() {
        Scanner sc26 = new Scanner(System.in);
        String dummy;
        System.out.print("Kode : ");
        kode = sc26.nextLine();
        System.out.print("Nama : ");
        nama = sc26.nextLine();
        System.out.print("Sks : ");
        dummy = sc26.nextLine();
        sks = Integer.parseInt(dummy);
        System.out.print("Jumlah Jam : ");
        dummy = sc26.nextLine();
        jumlahJam = Integer.parseInt(dummy);
        System.out.println("-----------------------------");
    }

    void cetakInfo() {
        System.out.println("Kode    : " + kode);
        System.out.println("Nama   : " + nama);
        System.out.println("Sks  : " + sks);
        System.out.println("Jumlah Jam    : " + jumlahJam);
        System.out.println("----------------------------");
    }
}