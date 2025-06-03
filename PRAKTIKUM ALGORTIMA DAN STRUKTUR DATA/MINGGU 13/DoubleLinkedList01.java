public class DoubleLinkedList01 {
    Node01 head;
    Node01 tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa01 data) {
        Node01 newNode = new Node01(null, data, head);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa01 data) {
        Node01 newNode = new Node01(tail, data, null);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list kosong, tidak ada data yang dihapus.");
        } else {
            System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah:");
            head.data.tampil();
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
        } else {
            System.out.println("Data yang dihapus:");
            tail.data.tampil();
            if (head == tail) {
                head = tail = null;
            } else {
                tail = tail.prev;
                tail.next = null;
            }
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong.");
        } else {
            Node01 temp = head;
            while (temp != null) {
                temp.data.tampil();
                temp = temp.next;
            }
        }
    }

    public void insertAfter(String keyNim, Mahasiswa01 data) {
        Node01 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node01 newNode = new Node01(current, data, current.next);

        if (current.next != null) {
            current.next.prev = newNode;
        } else {
            tail = newNode;
        }

        current.next = newNode;
        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }

    public void search(String nim) {
        Node01 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                System.out.println("Data ditemukan:");
                current.data.tampil();
                return;
            }
            current = current.next;
        }
        System.out.println("Data dengan NIM " + nim + " tidak ditemukan.");
    }

    public void add(int index, Mahasiswa01 data) {
        if (index < 0) {
            System.out.println("Indeks tidak valid.");
            return;
        }

        if (isEmpty() || index == 0) {
            addFirst(data);
            return;
        }

        Node01 current = head;
        int i = 0;
        while (current != null && i < index) {
            current = current.next;
            i++;
        }

        if (current == null) {
            addLast(data);
        } else {
            Node01 newNode = new Node01(current.prev, data, current);
            current.prev.next = newNode;
            current.prev = newNode;
        }
    }

    public void removeAfter(String keyNim) {
        Node01 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            System.out.println("Tidak ada node setelah NIM tersebut.");
        } else {
            Node01 toDelete = current.next;
            System.out.println("Data setelah NIM " + keyNim + " berhasil dihapus:");
            toDelete.data.tampil();

            current.next = toDelete.next;
            if (toDelete.next != null) {
                toDelete.next.prev = current;
            } else {
                tail = current;
            }
        }
    }

    public void remove(int index) {
        if (isEmpty()) {
            System.out.println("List kosong.");
            return;
        }

        if (index == 0) {
            removeFirst();
            return;
        }

        Node01 current = head;
        int i = 0;
        while (current != null && i < index) {
            current = current.next;
            i++;
        }

        if (current == null) {
            System.out.println("Indeks tidak ditemukan.");
            return;
        }

        System.out.println("Data yang dihapus:");
        current.data.tampil();

        if (current == tail) {
            removeLast();
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }

    public void getFirst() {
        if (!isEmpty()) {
            System.out.println("Data pertama:");
            head.data.tampil();
        } else {
            System.out.println("Linked list kosong.");
        }
    }

    public void getLast() {
        if (!isEmpty()) {
            System.out.println("Data terakhir:");
            tail.data.tampil();
        } else {
            System.out.println("Linked list kosong.");
        }
    }

    public void get(int index) {
        Node01 current = head;
        int i = 0;
        while (current != null && i < index) {
            current = current.next;
            i++;
        }

        if (current != null) {
            System.out.println("Data pada indeks " + index + ":");
            current.data.tampil();
        } else {
            System.out.println("Indeks tidak ditemukan.");
        }
    }

    public int size() {
        int count = 0;
        Node01 current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}