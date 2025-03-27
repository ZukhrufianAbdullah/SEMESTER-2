import java.util.Scanner;

public class DosenDemo26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen26 data = new DataDosen26();
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data Dosen");
            System.out.println("3. BubbleSort (ASC) Usia Termuda ke Tertua");
            System.out.println("4. InsertionSort (DSC) Usia Tertua ke Termuda");
            System.out.println("5. Pencarian Data (Sequential) berdasarkan Nama");
            System.out.println("6. Pencarian Data (Binary) berdasarkan Usia");
            System.out.println("7. Keluar");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Kode: ");
                    String kode = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin (true = Laki-laki, false = Perempuan): ");
                    boolean jk = sc.nextBoolean();
                    System.out.print("Usia: ");
                    int usia = sc.nextInt();
                    data.tambah(new Dosen26(kode, nama, jk, usia));
                    break;
                case 2:
                    data.tampil();
                    break;
                case 3:
                    data.bubbleSort();
                    System.out.println("Data telah diurutkan secara ascending.");
                    break;
                case 4:
                    data.insertionSort();
                    System.out.println("Data telah diurutkan secara descending.");
                    break;
                case 5:
                    System.out.print("Masukkan Nama Dosen yang dicari: ");
                    String cariNama = sc.nextLine();
                    data.pencarianDataSequential(cariNama);
                    break;
                case 6:
                    System.out.print("Masukkan Usia Dosen yang dicari: ");
                    int cariUsia = sc.nextInt();
                    data.pencarianDataBinary(cariUsia);
                    break;
                case 7:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 7);
        sc.close();
    }
}