public class DataDosen26 {
  // Method menampilkan data semua dosen
  void dataSemuaDosen(Dosen26[] arrayOfDosen) {
      System.out.println("\n==== DATA SEMUA DOSEN ====");
      System.out.printf("%-15s %-25s %-20s %-10s\n", "Kode", "Nama", "Jenis Kelamin", "Usia");

      for (Dosen26 dosen : arrayOfDosen) {
          String jenisKelaminStr = dosen.jenisKelamin ? "Laki-laki" : "Perempuan";
          System.out.printf("%-15s %-25s %-20s %-10d\n", dosen.kode, dosen.nama, jenisKelaminStr, dosen.usia);
      }
  }

  // Method menampilkan jumlah dosen per jenis kelamin
  void jumlahDosenPerJenisKelamin(Dosen26[] arrayOfDosen) {
      System.out.println("\n==== Data Jumlah Dosen Per Jenis Kelamin ====");
      int jmlPria = 0, jmlWanita = 0;

      for (Dosen26 dosen : arrayOfDosen) {
          if (dosen.jenisKelamin) {
              jmlPria++;
          } else {
              jmlWanita++;
          }
      }

      System.out.println("Jumlah Laki-laki  : " + jmlPria);
      System.out.println("Jumlah Perempuan  : " + jmlWanita);
  }

  // Method menampilkan rata-rata usia dosen per jenis kelamin
  void rerataUsiaDosenPerJenisKelamin(Dosen26[] arrayOfDosen) {
      System.out.println("\n==== Rata-rata Usia Dosen Per Jenis Kelamin ====");
      int jmlPria = 0, jmlWanita = 0, totalUsiaPria = 0, totalUsiaWanita = 0;

      for (Dosen26 dosen : arrayOfDosen) {
          if (dosen.jenisKelamin) {
              jmlPria++;
              totalUsiaPria += dosen.usia;
          } else {
              jmlWanita++;
              totalUsiaWanita += dosen.usia;
          }
      }

      double rata2Pria = (jmlPria == 0) ? 0 : (double) totalUsiaPria / jmlPria;
      double rata2Wanita = (jmlWanita == 0) ? 0 : (double) totalUsiaWanita / jmlWanita;

      System.out.println("Rata-rata usia Laki-laki  : " + rata2Pria + " tahun");
      System.out.println("Rata-rata usia Perempuan  : " + rata2Wanita + " tahun");
  }

  // Method menampilkan data dosen paling tua
  void infoDosenPalingTua(Dosen26[] arrayOfDosen) {
      System.out.println("\n==== Data Dosen Paling Tua ====");

      Dosen26 dosenTertua = arrayOfDosen[0];
      for (Dosen26 dosen : arrayOfDosen) {
          if (dosen.usia > dosenTertua.usia) {
              dosenTertua = dosen;
          }
      }

      tampilkanDataDosen(dosenTertua);
  }

  // Method menampilkan data dosen paling muda
  void infoDosenPalingMuda(Dosen26[] arrayOfDosen) {
      System.out.println("\n==== Data Dosen Paling Muda ====");

      Dosen26 dosenTermuda = arrayOfDosen[0];
      for (Dosen26 dosen : arrayOfDosen) {
          if (dosen.usia < dosenTermuda.usia) {
              dosenTermuda = dosen;
          }
      }

      tampilkanDataDosen(dosenTermuda);
  }

  // Method untuk menampilkan data satu dosen
  void tampilkanDataDosen(Dosen26 dosen) {
      String jenisKelaminStr = dosen.jenisKelamin ? "Laki-laki" : "Perempuan";
      System.out.println("Kode          : " + dosen.kode);
      System.out.println("Nama          : " + dosen.nama);
      System.out.println("Jenis Kelamin : " + jenisKelaminStr);
      System.out.println("Usia          : " + dosen.usia);
  }
}