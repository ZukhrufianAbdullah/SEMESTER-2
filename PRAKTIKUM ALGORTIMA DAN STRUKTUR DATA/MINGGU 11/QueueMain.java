import java.util.Scanner;

public class QueueMain {

    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int n = sc.nextInt();
        Queue Q = new Queue(n);

        int pilih;
        do {
            menu();
            pilih = sc.nextInt();

            try {
                switch (pilih) {
                    case 1:
                        System.out.print("Masukkan data baru: ");
                        int dataMasuk = sc.nextInt();
                        Q.Enqueue(dataMasuk);
                        break;

                    case 2:
                        int dataKeluar = Q.Dequeue();
                        System.out.println("Data yang dikeluarkan: " + dataKeluar);
                        break;

                    case 3:
                        Q.print();
                        break;

                    case 4:
                        Q.peek();
                        break;

                    case 5:
                        Q.clear();
                        break;
                }
            } catch (IllegalStateException e) {
                System.out.println(e.getMessage());
                System.out.println("Program dihentikan.");
                System.exit(1);
            }

        } while (pilih >= 1 && pilih <= 5);
    }
}