public class MahasiswaMain26 {
    public static void main(String[] args) {
        Mahasiswa26 mhs1 = new Mahasiswa26();
        mhs1.nama = "Zukhrufian Abdullah";
        mhs1.nim = "244107020236";
        mhs1.kelas = "TI 1F";
        mhs1.ipk = 3.81;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("TI 1C");
        mhs1.updateIpk(4.0);
        mhs1.tampilkanInformasi();

        Mahasiswa26 mhs2 = new Mahasiswa26("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa26 mhsFian = new Mahasiswa26("Zukhruf", "244107020236", 4.0, " TI-1F");
        mhsFian.tampilkanInformasi();
    }
}
