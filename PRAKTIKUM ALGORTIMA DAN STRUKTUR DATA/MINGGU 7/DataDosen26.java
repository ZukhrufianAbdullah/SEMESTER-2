public class DataDosen26 {
    Dosen26[] dataDosen = new Dosen26[10];
    int idx = 0;

    // Method Tambah
    public void tambah(Dosen26 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data penuh!");
        }
    }
    
    // Method Tampil
    public void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
    }
    
    // Method BubbleSort (ASC)
    public void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen26 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }
    
    // Method InsertionSort (DSC)
    public void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Dosen26 key = dataDosen[i];
            int j = i - 1;
            while (j >= 0 && dataDosen[j].usia < key.usia) {
                dataDosen[j + 1] = dataDosen[j];
                j--;
            }
            dataDosen[j + 1] = key;
        }
    }
    
    // Pencarian Sequential Search berdasarkan Nama
    public void pencarianDataSequential(String nama) {
        boolean ditemukan = false;
        int jumlahHasil = 0;
        for (int i = 0; i < idx; i++) {
            if (dataDosen[i].nama.equalsIgnoreCase(nama)) {
                dataDosen[i].tampil();
                ditemukan = true;
                jumlahHasil++;
            }
        }
        if (!ditemukan) {
            System.out.println("Data tidak ditemukan!");
        } else if (jumlahHasil > 1) {
            System.out.println("Peringatan: Terdapat lebih dari satu hasil yang cocok!");
        }
    }
    
    // Pencarian Binary Search berdasarkan Usia
    public void pencarianDataBinary(int usia) {
        bubbleSort(); 
        int left = 0, right = idx - 1, jumlahHasil = 0;
        boolean ditemukan = false;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (dataDosen[mid].usia == usia) {
                // Cari semua yang memiliki usia yang sama (karena mungkin lebih dari satu)
                int i = mid;
                while (i >= 0 && dataDosen[i].usia == usia) {
                    dataDosen[i].tampil();
                    ditemukan = true;
                    jumlahHasil++;
                    i--;
                }
                i = mid + 1;
                while (i < idx && dataDosen[i].usia == usia) {
                    dataDosen[i].tampil();
                    ditemukan = true;
                    jumlahHasil++;
                    i++;
                }
                break;
            } else if (dataDosen[mid].usia < usia) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        if (!ditemukan) {
            System.out.println("Data tidak ditemukan!");
        } else if (jumlahHasil > 1) {
            System.out.println("Peringatan: Terdapat lebih dari satu hasil yang cocok!");
        }
    }
}