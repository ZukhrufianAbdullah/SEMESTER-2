import java.util.Scanner;

public class MahasiswaDemo26 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();
        input.nextLine();

        Mahasiswa26[] dataMahasiswa = new Mahasiswa26[jumlahMahasiswa];
        MahasiswaBerprestasi26 daftar = new MahasiswaBerprestasi26(jumlahMahasiswa);

        for (int i = 0; i < dataMahasiswa.length; i++) {
            System.out.println("\nMasukkan data mahasiswa ke-" + (i + 1));
            dataMahasiswa[i] = new Mahasiswa26();
            dataMahasiswa[i].isiData();
        }

        System.out.println("----------------------------------------");
        daftar.tambah(dataMahasiswa);

        System.out.println("\nData mahasiswa sebelum sorting:");
        daftar.tampil();

        daftar.bubbleSort();

        System.out.println("\nData mahasiswa setelah sorting berdasarkan IPK (DESC):");
        daftar.tampil();

        System.out.println("\nData yang sudah terurut menggunakan SELECTION SORT (ASC)");
        daftar.selectionSort();
        daftar.tampil();

        System.out.println("\nData yang sudah terurut menggunakan INSERTION SORT (DESC)");
        daftar.insertionSort();
        daftar.tampil();
    }
}