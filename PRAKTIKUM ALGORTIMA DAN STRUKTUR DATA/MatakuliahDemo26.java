import java.util.Scanner;

public class MatakuliahDemo26 {
    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Matakuliah : ");
        int jmlMk = sc26.nextInt();
        Matakuliah26[] arrayOfMatakuliah = new Matakuliah26[jmlMk];
    
        for(int i = 0; i < jmlMk; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i] = new Matakuliah26();
            arrayOfMatakuliah[i].tambahData();
        }

        for(int i = 0; i < jmlMk; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo();
        }
    }
}