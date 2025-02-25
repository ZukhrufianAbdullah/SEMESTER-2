public class DosenMain26 {
    public static void main(String[] args) {

        //Object dengan konstraktor default
        Dosen26 dosen1 = new Dosen26();

        //Atribut
        dosen1.nama = "Vivi";
        dosen1.idDosen = "465";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2005;
        dosen1.bidangKeahlian = "Matematika";

        //Method
        dosen1.tampilkanInformasi();
        dosen1.setStatusAktif(true);
        System.out.println("Lama bekerja: " + dosen1.hitungMasaKerja(2025) + " thn");
        dosen1.ubahKeahlian("RPL");
        dosen1.tampilkanInformasi();

        //Object dengan konstraktor berparameter
        Dosen26 dosenFian = new Dosen26("456", "Fian", true, 2007, "Basis Data");

        //Method
        dosenFian.tampilkanInformasi();
        dosenFian.setStatusAktif(false);
        System.out.println("Lama bekerja: " + dosen1.hitungMasaKerja(2025) + " thn");
        dosenFian.ubahKeahlian("UI UX");
        dosenFian.tampilkanInformasi();
    }
}
