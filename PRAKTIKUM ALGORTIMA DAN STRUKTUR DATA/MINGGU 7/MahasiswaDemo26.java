import java.util.Scanner;

public class MahasiswaDemo26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = sc.nextInt();
        sc.nextLine(); // Membersihkan buffer
        
        MahasiswaBerprestasi26 list = new MahasiswaBerprestasi26(jumMhs);

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine(); // Membersihkan buffer
            System.out.println("---------------------------------");
            list.tambah(new Mahasiswa26(nim, nama, kelas, ipk));
        }
        
        list.tampil();
        
        // Pencarian data Sequential
        System.out.println("------------------------------------------------");
        System.out.println("Pencarian data menggunakan Sequential Search");
        System.out.print("Masukkan IPK mahasiswa yang dicari: ");
        double cari = sc.nextDouble();
        int posisi = list.sequentialSearching(cari);
        list.tampilPosisi(cari, posisi);
        list.tampilDataSearch(cari, posisi);

        // Pencarian data Binary Search
        System.out.println("------------------------------------------------");
        System.out.println("Pencarian data menggunakan Binary Search");
        System.out.print("Masukkan IPK mahasiswa yang dicari: ");
        double cari2 = sc.nextDouble();
        int posisi2 = list.findBinarySearch(cari2, 0, jumMhs - 1);
        list.tampilPosisi(cari2, posisi2);
        list.tampilDataSearch(cari2, posisi2);
    }
}   