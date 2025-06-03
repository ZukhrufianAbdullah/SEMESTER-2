import java.util.Scanner;

public class DLLMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedList01 dll = new DoubleLinkedList01();

        int pilihan;
        do {
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Hapus di awal");
            System.out.println("4. Hapus di akhir");
            System.out.println("5. Tampilkan data");
            System.out.println("6. Cari Mahasiswa berdasarkan NIM");
            System.out.println("7. Insert data setelah NIM tertentu");
            System.out.println("8. Tambah data pada indeks tertentu");
            System.out.println("9. Hapus data setelah NIM tertentu");
            System.out.println("10. Hapus data pada indeks tertentu");
            System.out.println("11. Tampilkan data pertama");
            System.out.println("12. Tampilkan data terakhir");
            System.out.println("13. Tampilkan data pada indeks tertentu");
            System.out.println("14. Tampilkan jumlah data");    
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt(); sc.nextLine();

            switch (pilihan) {
                case 1:
                    Mahasiswa01 mhs1 = inputMahasiswa(sc);
                    dll.addFirst(mhs1);
                    break;
                case 2:
                    Mahasiswa01 mhs2 = inputMahasiswa(sc);
                    dll.addLast(mhs2);
                    break;
                case 3:
                    dll.removeFirst();
                    break;
                case 4:
                    dll.removeLast();
                    break;
                case 5:
                    dll.print();
                    break;
                case 6:
                    System.out.print("Masukkan NIM yang ingin dicari: ");
                    String cariNim = sc.nextLine();
                    dll.search(cariNim);
                    break;
                case 7:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nimKey = sc.next();
                    System.out.print("Masukkan NIM: ");
                    String nimBaru = sc.next();
                    System.out.print("Masukkan Nama: ");
                    String namaBaru = sc.next();
                    System.out.print("Masukkan Kelas: ");
                    String kelasBaru = sc.next();
                    System.out.print("Masukkan IPK: ");
                    double ipkBaru = sc.nextDouble();
                    Mahasiswa01 mhsBaru = new Mahasiswa01(nimBaru, namaBaru, kelasBaru, ipkBaru);
                    dll.insertAfter(nimKey, mhsBaru);
                    break;
                case 8:
                    System.out.print("Masukkan indeks: ");
                    int indexAdd = sc.nextInt(); sc.nextLine();
                    Mahasiswa01 mhsAdd = inputMahasiswa(sc);
                    dll.add(indexAdd, mhsAdd);
                    break;
                case 9:
                    System.out.print("Masukkan NIM: ");
                    String nimKeyRemove = sc.nextLine();
                    dll.removeAfter(nimKeyRemove);
                    break;
                case 10:
                    System.out.print("Masukkan indeks yang ingin dihapus: ");
                    int indexRemove = sc.nextInt(); sc.nextLine();
                    dll.remove(indexRemove);
                    break;
                case 11:
                    dll.getFirst();
                    break;
                case 12:
                    dll.getLast();
                    break;
                case 13:
                    System.out.print("Masukkan indeks: ");
                    int indexGet = sc.nextInt(); sc.nextLine();
                    dll.get(indexGet);
                    break;
                case 14:
                    System.out.println("Jumlah data dalam linked list: " + dll.size());
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        sc.close();
    }

    private static Mahasiswa01 inputMahasiswa(Scanner sc) {
        System.out.print("NIM   : ");
        String nim = sc.nextLine();
        System.out.print("Nama  : ");
        String nama = sc.nextLine();
        System.out.print("Kelas : ");
        String kelas = sc.nextLine();
        System.out.print("IPK   : ");
        double ipk = sc.nextDouble(); sc.nextLine();
        return new Mahasiswa01(nim, nama, kelas, ipk);
    }
}