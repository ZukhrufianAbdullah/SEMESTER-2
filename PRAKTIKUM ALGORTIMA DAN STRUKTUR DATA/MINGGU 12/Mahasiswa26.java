package Pertemuan12; 
 
public class Mahasiswa26 { 
    String nim; 
    String nama; 
    String kelas; 
    double ipk; 
 
    Mahasiswa26(){ 
 
    } 
    Mahasiswa26(String nm, String name, String kls, double ip) { 
        this.nim= nm; 
        this.nama=name; 
        this.kelas= kls; 
        this.ipk= ip; 
    } 
 
    void tampilInformasi() { 
        System.out.println(nama + "\t" + nim + "\t" + kelas + "\t" + ipk ); 
    } 
} 