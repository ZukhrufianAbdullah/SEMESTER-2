import java.util.Scanner;

public class MahasiswaDemo26 {
    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);
        Mahasiswa26[] arrayOfMahasiswa = new Mahasiswa26[3];
        String dummy;

        for(int i = 0; i < 3; i++) {
            arrayOfMahasiswa[i] = new Mahasiswa26();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM    : ");
            arrayOfMahasiswa[i].nim = sc26.nextLine();
            System.out.print("Nama   : ");
            arrayOfMahasiswa[i].nama = sc26.nextLine();
            System.out.print("Kelas  : ");
            arrayOfMahasiswa[i].kelas = sc26.nextLine();
            System.out.print("IPK    : ");
            dummy = sc26.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("-----------------------------");
        }
        for(int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            arrayOfMahasiswa[i].cetakInfo();
        }
    }
}