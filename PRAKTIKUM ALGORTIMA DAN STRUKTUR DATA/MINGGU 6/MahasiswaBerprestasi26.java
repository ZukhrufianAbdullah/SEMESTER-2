public class MahasiswaBerprestasi26 {

    Mahasiswa26[] listMhs;

    MahasiswaBerprestasi26(int jumlah) {
        listMhs = new Mahasiswa26[jumlah];
    }

    // Method Tambah
    void tambah(Mahasiswa26[] arr) {
        for (int i = 0; i < arr.length; i++) {
            listMhs[i] = arr[i];
        }
    }

    // Method Tampil
    void tampil() {
        for (Mahasiswa26 m : listMhs) {
            m.tampilInformasi();
            System.out.println("--------------------");
        }
    }

    // Method BubbleSort
    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    Mahasiswa26 tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }

    // Method SelectionSort
    void selectionSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            Mahasiswa26 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }
    // Method InsertionSort
    void insertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa26 temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j - 1].ipk < temp.ipk) {
            listMhs[j] = listMhs[j - 1];
            j--;
            } 
        listMhs[j] = temp;
        }
    }   
}