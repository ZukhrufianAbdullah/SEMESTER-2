package Pertemuan12; 
 
public class SingleLinkedList26 { 
    Node26 head; 
    Node26 tail; 
 
    boolean isEmpty() { 
        return (head == null); 
    } 
    public void print() { 
        if (!isEmpty()) { 
            Node26 tmp = head; 
            System.out.println("Isi Linked List:\t"); 
            while (tmp != null) { 
                tmp.data.tampilInformasi(); 
                tmp = tmp.next; 
            } 
            System.out.println(); 
        } else { 
            System.out.println("Linked list kosong"); 
        } 
    } 
    public void addFirst(Mahasiswa26 input) { 
        Node26 ndInput = new Node26(input, null); 
        if (isEmpty()) { 
            head = ndInput; 
            tail = ndInput; 
        } else { 
            ndInput.next = head; 
            head = ndInput; 
        } 
    } 
    public void addLast(Mahasiswa26 input) { 
        Node26 ndInput = new Node26(input, null); 
        if (isEmpty()) { 
            head = ndInput; 
            tail = ndInput; 
        } else { 
            tail.next = ndInput; 
            tail = ndInput; 
        } 
    } 
    public void insertAfter(String key, Mahasiswa26 input) { 
     Node26 ndInput = new Node26(input, null); 
     Node26 temp = head; 
        do { 
            if (temp.data.nama.equalsIgnoreCase(key)) { 
                ndInput.next = temp.next; 
                temp.next = ndInput; 
                if (ndInput.next == null) { 
                    tail = ndInput; 
                } 
                break; 
            } 
            temp = temp.next; 
        } while (temp != null); 
    } 
    public void insertAt(int index, Mahasiswa26 input) { 
        if (index < 0) { 
            System.out.println("indeks salah"); 
        } else if (index == 0) { 
            addFirst(input); 
        } else { 
            Node26 temp = head; 
            for (int i = 0; i < index - 1; i++) { 
                temp = temp.next; 
            } 
            temp.next = new Node26(input, temp.next); 
            if (temp.next.next == null) { 
                tail = temp.next; 
            } 
        } 
    }
    public void getData(int index) { 
        Node26 tmp = head; 
        for (int i = 0; i < index; i++) { 
            tmp = tmp.next; 
        } 
        tmp.data.tampilInformasi(); 
    } 
    public int indexOf(String key) { 
        Node26 tmp = head; 
        int index = 0; 
        while (tmp != null && !tmp.data.nama.equalsIgnoreCase(key)) { 
            tmp = tmp.next; 
            index++; 
        } 
     
        if (tmp == null) { 
            return -1; 
        } else { 
            return index; 
        } 
    } 
    public void removeFirst() { 
        if (isEmpty()) { 
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!"); 
        } else if (head == tail) { 
            head = tail = null; 
        } else { 
            head = head.next; 
        } 
    } 
    public void removeLast() { 
        if (isEmpty()) { 
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!"); 
        } else if (head == tail) { 
            head = tail = null; 
        } else { 
            Node26 temp = head; 
            while (temp.next != tail) { 
                temp = temp.next; 
            } 
            temp.next = null; 
            tail = temp; 
        } 
    } 
    public void remove(String key) { 
        if (isEmpty()) { 
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!"); 
        } else { 
            Node26 temp = head; 
            while (temp != null) { 
                if ((temp.data.nama.equalsIgnoreCase(key)) && (temp == head)) { 
                    this.removeFirst(); 
                    break; 
                } else if (temp.next.data.nama.equalsIgnoreCase(key)) { 
                    temp.next = temp.next.next; 
                    if (temp.next == null) { 
                        tail = temp; 
                    } 
                    break; 
                } 
                temp = temp.next; 
            } 
        } 
    }
    public void removeAt(int index) { 
        if (index == 0) { 
            removeFirst(); 
        } else { 
            Node26 temp = head; 
            for (int i = 0; i < index - 1; i++) { 
                temp = temp.next; 
            } 
            temp.next = temp.next.next; 
            if (temp.next == null) { 
                tail = temp; 
            } 
        } 
    } 
}