package Jobsheet9;

public class StackSurat26 {
    int top;
    int size;
    Surat26[] data;

    public StackSurat26(int size) {
        this.size = size;
        data = new Surat26[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Surat26 s) {
        if (!isFull()) {
            data[++top] = s;
            System.out.println("Surat berhasil ditambahkan.");
        } else {
            System.out.println("Stack penuh! Tidak dapat menambahkan surat.");
        }
    }

    public Surat26 pop() {
        if (!isEmpty()) {
            System.out.println("Surat berhasil diproses dan dihapus dari stack.");
            return data[top--];
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat26 peek() {
        if (!isEmpty()) {
            return data[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk dilihat.");
            return null;
        }
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (data[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan:");
                data[i].tampilkan();
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat dari \"" + nama + "\" tidak ditemukan.");
        }
    }
}