import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);

        System.out.println("=======================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("=======================");
        
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = input26.nextInt();
        input26.nextLine();

        String[] namaMatkul = new String[jumlahMatkul];
        String[] nilaiHuruf = new String[jumlahMatkul];
        int[] jumlahSks = new int[jumlahMatkul];
        double[] nilaiAngka = new double[jumlahMatkul];
        double[] bobotNilai = new double[jumlahMatkul];

        System.out.println("=======================");
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.print("Masukkan nama mata kuliah ke-" + (i + 1) + ": ");
            namaMatkul[i] = input26.nextLine();
            
            System.out.print("Masukkan jumlah SKS: ");
            jumlahSks[i] = input26.nextInt();
            
            System.out.print("Masukkan nilai mata kuliah " + namaMatkul[i] + ": ");
            nilaiAngka[i] = input26.nextDouble();
            input26.nextLine();
            
            if (nilaiAngka[i] <= 100 && nilaiAngka[i] > 80) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4.00;
            } else if (nilaiAngka[i] <= 80 && nilaiAngka[i] > 73) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.50;
            } else if (nilaiAngka[i] <= 73 && nilaiAngka[i] > 65) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3.00;
            } else if (nilaiAngka[i] <= 65 && nilaiAngka[i] > 60) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.50;
            } else if (nilaiAngka[i] <= 60 && nilaiAngka[i] > 50) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2.00;
            } else if (nilaiAngka[i] <= 50 && nilaiAngka[i] > 39) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1.00;
            } else if (nilaiAngka[i] <= 39 && nilaiAngka[i] >= 0) {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0.00;
            } else {
                System.out.println("Nilai tidak valid, silakan ulangi!");
                i--; // Mengulang input untuk mata kuliah yang sama
                continue;
            }
            System.out.println();
        }

        int totalSks = 0;
        for (int sks : jumlahSks) {
            totalSks += sks;
        }

        double ipSemester = 0;
        for (int i = 0; i < jumlahMatkul; i++) {
            ipSemester += (bobotNilai[i] * jumlahSks[i]);
        }
        ipSemester /= totalSks;

        System.out.println("\n=======================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("=======================");
        System.out.printf("%-25s %-15s %-15s %-15s %-15s %n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai", "Jumlah SKS");
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.printf("%-25s %-15.2f %-15s %-15.2f %-15d %n", namaMatkul[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i], jumlahSks[i]);
        }
        System.out.println("=======================");
        System.out.printf("IP Semester: %.2f%n", ipSemester);
    }
}
