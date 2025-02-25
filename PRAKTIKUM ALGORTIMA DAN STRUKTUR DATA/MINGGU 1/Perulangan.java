import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);
        
        System.out.print("Masukkan NIM :");
        long nim = input26.nextLong();
        
        System.out.println("==========================");
        
        // Ambil 2 digit terakhir dari NIM
        int n = (int) (nim % 100);
        
        // Jika n < 10, tambahkan 10
        if (n < 10) {
            n += 10;
        }
        
        System.out.println("n : " + n);
        System.out.println();
        
        // Cetak deretan bilangan sesuai aturan
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue; // Lewati angka 6 dan 10
            }
            if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }
        
        input26.close();
    }
}