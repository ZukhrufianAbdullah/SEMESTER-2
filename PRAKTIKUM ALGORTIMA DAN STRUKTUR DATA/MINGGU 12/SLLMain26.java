package Pertemuan12; 
 
public class SLLMain26 { 
        public static void main(String[] args) { 
            SingleLinkedList26 sll = new SingleLinkedList26(); 
     
            Mahasiswa26 mhs1 = new Mahasiswa26("24212200", "Alvaro", "1A", 4.0); 
            Mahasiswa26 mhs2 = new Mahasiswa26("23212201", "Bimon", "2B", 3.8); 
            Mahasiswa26 mhs3 = new Mahasiswa26("22212202", "Cintia", "3C", 3.5); 
            Mahasiswa26 mhs4 = new Mahasiswa26("21212203", "Dirga", "4D", 3.6); 
     
            sll.print(); 
            sll.addFirst(mhs4); 
            sll.print(); 
            sll.addLast(mhs1); 
            sll.print(); 
            sll.insertAfter("Dirga", mhs3);  
            sll.insertAt(2, mhs2); 
            sll.print(); 
 
            System.out.println("data index 1 : "); 
            sll.getData(1); 
 
            System.out.println("data mahasiswa Bimon berada pada index : " + sll.indexOf("bimon")); 
            System.out.println(); 
 
            sll.removeFirst(); 
            sll.removeLast(); 
            sll.print(); 
            sll.removeAt(0); 
            sll.print(); 
 
        } 
    }