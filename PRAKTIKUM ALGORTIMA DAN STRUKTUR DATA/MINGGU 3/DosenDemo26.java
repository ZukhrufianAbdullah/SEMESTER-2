import java.util.Scanner;

public class DosenDemo26 {
    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Dosen: ");
        int jmlDosen = sc26.nextInt();
        sc26.nextLine();

        Dosen26[] arrayOfDosen = new Dosen26[jmlDosen];
        String kode, nama;
        boolean jenisKelamin;
        int usia;
        //INPUT DATA DOSEN
        for(int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode               : ");
            kode = sc26.nextLine();
            System.out.print("Nama               : ");
            nama = sc26.nextLine();
            System.out.print("Jenis Kelamin (L/P): ");
            char jk = sc26.nextLine().charAt(0);
            jenisKelamin = (jk == 'L' || jk == 'l'); 
            System.out.print("Usia               : ");
            usia = sc26.nextInt();
            sc26.nextLine();

            arrayOfDosen[i] = new Dosen26(kode, nama, jenisKelamin, usia);
        }

        sc26.close();
        //FOREACH
        int i = 1;
        for(Dosen26 dosen : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + i);
            System.out.println("Kode            : " + dosen.kode);
            System.out.println("Nama            : " + dosen.nama);
            System.out.println("Jenis Kelamin   : " + (dosen.jenisKelamin ? "Laki-laki" : "Perempuan"));
            System.out.println("Usia            : " + dosen.usia);
            System.out.println("--------------------------------------");
            i++;
        }
        
        DataDosen26 infoDosen = new DataDosen26();
        infoDosen.dataSemuaDosen(arrayOfDosen);
        infoDosen.jumlahDosenPerJenisKelamin(arrayOfDosen);
        infoDosen.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        infoDosen.infoDosenPalingTua(arrayOfDosen);
        infoDosen.infoDosenPalingMuda(arrayOfDosen);

    }
}
