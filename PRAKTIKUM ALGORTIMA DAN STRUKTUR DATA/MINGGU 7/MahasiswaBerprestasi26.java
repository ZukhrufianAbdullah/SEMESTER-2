public class MahasiswaBerprestasi26 {

    Mahasiswa26[] listMhs;
    int idx;

    MahasiswaBerprestasi26(int jumlah) {
        listMhs = new Mahasiswa26[jumlah];
        idx = 0;
    }

    // Method Tambah
    void tambah(Mahasiswa26 mhs) {
        if (idx < listMhs.length) {
            listMhs[idx] = mhs;
            idx++;
        } else {
            System.out.println("List mahasiswa sudah penuh!");
        }
    }
    
    // Method Tampil
    void tampil() {
        for (Mahasiswa26 m : listMhs) {
            m.tampilInformasi();
            System.out.println("-------------------------");
        }
    } 

    // Method SequentialSearching
    int sequentialSearching(double cari){
        int posisi = -1;
        for (int j=0; j<listMhs.length; j++){
            if (listMhs[j].ipk==cari) {
                posisi=j;
                break;
            }
        }
        return posisi;
    }

    // Method TampilPosisi
    void tampilPosisi(double x, int pos){
        if (pos!=-1) {
            System.out.println("data mahasiswa dengan IPK : " +x+ " ditemukan pada indeks " +pos);
        }
        else {
            System.out.println("data " +x+ " tidak ditemukan");
        }
    }

    // Method TampilDataSearch
    void tampilDataSearch(double x, int pos){
        if (pos !=-1) {
            System.out.println("nim\t : " + listMhs[pos].nim);
            System.out.println("nama\t : " + listMhs[pos].nama);
            System.out.println("kelas\t : " + listMhs[pos].kelas);
            System.out.println("ipk\t : " +x);
        }
        else {
            System.out.println("Data mahasiswa dengan IPK " +x+ " tidak ditamukan");
        }
    }

    // Method FindBinarySearch
    int findBinarySearch(double cari, int left, int right){
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            
            if (listMhs[mid].ipk == cari) {
                return mid;
            } 
            else if (listMhs[mid].ipk < cari) {  
                return findBinarySearch(cari, left, mid - 1);
            } 
            else {  
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
}