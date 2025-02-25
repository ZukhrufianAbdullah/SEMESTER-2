import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = input26.nextInt();
        input26.nextLine();
        
        String[] namaMataKuliah = new String[n];
        int[] sks = new int[n];
        int[] semester = new int[n];
        String[] hariKuliah = new String[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan data untuk mata kuliah ke-" + (i + 1) + ":");
            System.out.print("Nama Mata Kuliah: ");
            namaMataKuliah[i] = input26.nextLine();
            
            System.out.print("SKS: ");
            sks[i] = input26.nextInt();
            
            System.out.print("Semester: ");
            semester[i] = input26.nextInt();
            input26.nextLine(); // consume newline
            
            System.out.print("Hari Kuliah: ");
            hariKuliah[i] = input26.nextLine();
        }
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan seluruh jadwal");
            System.out.println("2. Tampilkan jadwal berdasarkan hari");
            System.out.println("3. Tampilkan jadwal berdasarkan semester");
            System.out.println("4. Cari mata kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = input26.nextInt();
            input26.nextLine();
            
            if (pilihan == 1) {
                tampilkanSeluruhJadwal(namaMataKuliah, sks, semester, hariKuliah);
            } else if (pilihan == 2) {
                System.out.print("Masukkan hari kuliah: ");
                String hari = input26.nextLine();
                tampilkanJadwalBerdasarkanHari(namaMataKuliah, sks, semester, hariKuliah, hari);
            } else if (pilihan == 3) {
                System.out.print("Masukkan semester: ");
                int sem = input26.nextInt();
                tampilkanJadwalBerdasarkanSemester(namaMataKuliah, sks, semester, hariKuliah, sem);
            } else if (pilihan == 4) {
                System.out.print("Masukkan nama mata kuliah: ");
                String nama = input26.nextLine();
                cariMataKuliah(namaMataKuliah, sks, semester, hariKuliah, nama);
            } else if (pilihan == 5) {
                System.out.println("Keluar dari program.");
                break;
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }
        input26.close();
    }
    
    public static void tampilkanSeluruhJadwal(String[] namaMataKuliah, int[] sks, int[] semester, String[] hariKuliah) {
        System.out.println("\nJadwal Kuliah:");
        for (int i = 0; i < namaMataKuliah.length; i++) {
            System.out.println(namaMataKuliah[i] + " - " + sks[i] + " SKS - Semester " + semester[i] + " - " + hariKuliah[i]);
        }
    }
    
    public static void tampilkanJadwalBerdasarkanHari(String[] namaMataKuliah, int[] sks, int[] semester, String[] hariKuliah, String hari) {
        System.out.println("\nJadwal Kuliah pada hari " + hari + ":");
        for (int i = 0; i < namaMataKuliah.length; i++) {
            if (hariKuliah[i].equalsIgnoreCase(hari)) {
                System.out.println(namaMataKuliah[i] + " - " + sks[i] + " SKS - Semester " + semester[i]);
            }
        }
    }
    
    public static void tampilkanJadwalBerdasarkanSemester(String[] namaMataKuliah, int[] sks, int[] semester, String[] hariKuliah, int sem) {
        System.out.println("\nJadwal Kuliah untuk Semester " + sem + ":");
        for (int i = 0; i < namaMataKuliah.length; i++) {
            if (semester[i] == sem) {
                System.out.println(namaMataKuliah[i] + " - " + sks[i] + " SKS - " + hariKuliah[i]);
            }
        }
    }
    
    public static void cariMataKuliah(String[] namaMataKuliah, int[] sks, int[] semester, String[] hariKuliah, String nama) {
        System.out.println("\nInformasi Mata Kuliah " + nama + ":");
        for (int i = 0; i < namaMataKuliah.length; i++) {
            if (namaMataKuliah[i].equalsIgnoreCase(nama)) {
                System.out.println("Nama: " + namaMataKuliah[i] + ", SKS: " + sks[i] + ", Semester: " + semester[i] + ", Hari: " + hariKuliah[i]);
                return;
            }
        }
        System.out.println("Mata kuliah tidak ditemukan.");
    }
}
