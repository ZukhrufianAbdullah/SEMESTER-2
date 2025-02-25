public class Fungsi {
    public static void main(String[] args) {
        int stok[][] = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };
        int harga[] = {75000, 50000, 60000, 10000};

        // Menampilkan pendapatan setiap cabang
        int[] penghasilan = hasilPendapatan(stok, harga);
        tampilHasil(penghasilan);

        // Menampilkan stok awal sebelum pengurangan
        System.out.println("\nStok Awal Semua Cabang:");
        tampilStok(stok);

        // Mengurangi stok karena bunga mati (tanpa mengubah data asli)
        int[][] stokSetelahPengurangan = penguranganStok(stok);

        // Menampilkan stok setelah pengurangan
        System.out.println("\nStok Setelah Pengurangan Karena Bunga Mati:");
        tampilStok(stokSetelahPengurangan);
    }

    // Fungsi untuk menghitung pendapatan setiap cabang
    private static int[] hasilPendapatan(int stok[][], int harga[]) {
        int hasil[] = new int[stok.length];

        for (int i = 0; i < stok.length; i++) {
            for (int j = 0; j < stok[i].length; j++) {
                hasil[i] += stok[i][j] * harga[j];
            }
        }
        return hasil;
    }

    // Fungsi untuk mengurangi stok berdasarkan bunga yang mati
    private static int[][] penguranganStok(int stok[][]) {
        int stokMati[] = {1, 2, 0, 5};
        
        // Salin array agar tidak mengubah data asli
        int[][] stokBaru = new int[stok.length][stok[0].length];
        for (int i = 0; i < stok.length; i++) {
            System.arraycopy(stok[i], 0, stokBaru[i], 0, stok[i].length);
        }

        // Kurangi stok hanya untuk cabang Royal Garden 4 (indeks ke-3)
        for (int j = 0; j < stokBaru[3].length; j++) {
            stokBaru[3][j] -= stokMati[j];
        }
        return stokBaru;
    }

    // Fungsi untuk menampilkan stok semua cabang
    private static void tampilStok(int[][] stok) {
        String[] namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};

        System.out.println("-----------------------------------------");
        System.out.printf("%-15s %-10s %-10s %-10s %-10s%n", "Cabang", namaBunga[0], namaBunga[1], namaBunga[2], namaBunga[3]);
        System.out.println("-----------------------------------------");

        for (int i = 0; i < stok.length; i++) {
            System.out.printf("Royal Garden %-2d ", (i + 1));
            for (int j = 0; j < stok[i].length; j++) {
                System.out.printf("%-10d ", stok[i][j]);
            }
            System.out.println();
        }
    }

    // Fungsi untuk menampilkan pendapatan setiap cabang
    private static void tampilHasil(int[] pendapatan) {
        System.out.println("-----------------------------");
        System.out.println("Keuntungan Setiap Store");
        System.out.println("-----------------------------");
        for (int i = 0; i < pendapatan.length; i++) {
            System.out.printf("Royal Garden %d: Rp.%d %n", (i + 1), pendapatan[i]);
        }
    }
}
