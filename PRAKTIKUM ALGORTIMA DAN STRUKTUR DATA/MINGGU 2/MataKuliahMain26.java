public class MataKuliahMain26 {
    public static void main(String[] args) {
        
        //Object dengan konstraktor default
        MataKuliah26 matkul1 = new MataKuliah26();
        
        //Atribut
        matkul1.nama = "Rekaya Perangkat Lunak";
        matkul1.kodeMK = "RPL123";
        matkul1.sks = 2;
        matkul1.jumlahJam = 3;
       
        //Method
        matkul1.tampilkanInformasi();
        matkul1.ubahSKS(3);
        matkul1.tambahJam(4);
        matkul1.kurangiJam(1);
        matkul1.tampilkanInformasi();
        
        //Object dengan konstraktor berparameter
        MataKuliah26 matkulFian = new MataKuliah26("Dasar Pemrograman", "DP123", 1, 5);
        
        //Method
        matkulFian.tampilkanInformasi();
        matkulFian.ubahSKS(3);
        matkulFian.tambahJam(4);
        matkulFian.kurangiJam(1);
        matkulFian.tampilkanInformasi();
    }
}
