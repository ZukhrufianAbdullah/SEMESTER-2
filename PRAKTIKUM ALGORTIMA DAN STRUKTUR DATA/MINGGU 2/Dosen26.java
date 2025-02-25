public class Dosen26 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;
    //Konstraktor Default
    public Dosen26() {

    }
    //Konstraktor Berparameter
    public Dosen26(String idDosen, String nm, boolean statusAktif, int thnBergabung, String bdgKeahlian ) {
        this.idDosen = idDosen;
        nama = nm;
        this.statusAktif = statusAktif;
        tahunBergabung = thnBergabung;
        bidangKeahlian = bdgKeahlian;
    }
    //Method
    void tampilkanInformasi() {
        System.out.println("=== INFORMASI DOSEN ===");
        System.out.println("Nama Dosen: " + nama);
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
        System.out.println();
    }

    void setStatusAktif(boolean status) {
        if (status) {
            System.out.println("Status: Aktif");
        } else {
            System.out.println("Status : Tidak Aktif");
        }
        System.out.println();
    }

    int hitungMasaKerja(int thnSkrng) {
        return thnSkrng - tahunBergabung;
    }

    void ubahKeahlian(String bidang) {
        System.out.println("=== PERUBAHAN KEAHLIAN ===");
        System.out.println("Keahlian Awal: " + bidangKeahlian);
        bidangKeahlian = bidang;
        System.out.println("Keahlian Baru: " + bidangKeahlian);
        System.out.println();
    }
}
