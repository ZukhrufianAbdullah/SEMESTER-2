public class Sorting26 {

    int[] data;
    int jumData;

    // Konstruktor
    Sorting26(int Data[], int jmlDat) {
        jumData = jmlDat;
        data = new int[jmlDat];
        for (int i = 0; i < jumData; i++) {
            data[i] = Data[i];
        }
    }

    // Method bubbleSort
    void bubbleSort() {
        int temp = 0;
        for (int i = 0; i < jumData - 1; i++) {
            for (int j = 1; j < jumData - i; j++) {
                if (data[j - 1] > data[j]) {
                    temp = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = temp;
                }
            }
        }
    }

    // Method tampil
    void tampil() {
        for (int i = 0; i < jumData; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    // Method SelectionSort
    void SelectionSort(){
        for(int i = 0; i < jumData-1; i++){
            int min=i; //elemen saat ini sebagai minimum
            for(int j=i+1; j < jumData; j++){
                if (data[j]<data[min]) {
                    min=j; // Perbarui indeks nilai minimum jika ditemukan yang lebih kecil
                }
            }
            // Setelah menemukan nilai minimum, lakukan pertukaran
            int temp=data[i];
            data[i]=data[min];
            data[min]=temp;
        }
    }

    // Method insertionSort
    void insertionSort(){
        for(int i = 0; i <= data.length-1; i++){
            int temp=data[i];
            int j=i-1;
            while (j>=0 && data[j]>temp) {
                data[j+1]=data[j];
                j--;
            }
            data[j+1]=temp;
        }
    }
}