public class MataKuliah26 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;
    //Konstraktor Default
    public MataKuliah26() {

    }
    //Konstraktor Berparameter
    public MataKuliah26(String kode, String nm, int sks, int jmlJam){
        kodeMK = kode;
        nama = nm;
        this.sks = sks;
        jumlahJam = jmlJam;
    }
    //Method
    void tampilkanInformasi() {
        System.out.println("=== INFORMASI MATA KULIAH ===");
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Jumlah SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
        System.out.println();
    }

    void ubahSKS(int sksBaru) {
        System.out.println("=== Perubahan SKS ===");
        System.out.println("SKS: " + sks);
        System.out.println("SKS Baru: " + sksBaru);
        sks = sksBaru;
        System.out.println("SKS Terbaru: " + sks);
        System.out.println();
    }

    void tambahJam(int jam) {
        System.out.println("=== Penambahan Jam ===");
        System.out.println("Jam Awal: " + jumlahJam);
        System.out.println("Penambahan Jam: " + jam);
        jumlahJam += jam;
        System.out.println("Jam Baru: " + jumlahJam);
        System.out.println();
    }

    void kurangiJam(int jam) {
        System.out.println("=== Pengurangan Jam ===");
        if (jumlahJam > jam) {
            System.out.println("Jumlah Jam Awal: " + jumlahJam);
            System.out.println("Jumlah Pengurangan Jam : " + jam);
            jumlahJam -= jam;
            System.out.println("Hasil Kurangi Jam: " + jumlahJam);
        } else {
            System.out.println("Pengurangan Tidak Bisa Dilakukan, Coba Lagi!!!");
        }
        System.out.println();
    }
}