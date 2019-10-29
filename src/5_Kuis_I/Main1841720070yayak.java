/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author can
 */
public class Main1841720070yayak {
   
    
    public static void main(String[] args) {
   System.out.println("Mebel Kursi Internasional"); 
   System.out.println("----------------------------");   
    JenisKursi1841720070yayak JnsLk =new JenisKursi1841720070yayak();
    JnsLk.tampil();
    
    
     JenisKursi1841720070yayak lk = new JenisKursi1841720070yayak();
    lk.hitungBayarKursi(4);
    
    
   System.out.println("-----------------");
   
     Model1841720070yayak Mdl = new Model1841720070yayak();
    Mdl.setMerkyayak("olympik");
    Mdl.setWarna("Kuning");
    
    Mdl.infoyayak();
    System.out.println("------------------");  
   Totalan1841720070yayak Ttl = new Totalan1841720070yayak("Yayak", 5, 3);
   
    Ttl.setNama("Yayak");
    Ttl.setHarga(900000);
    Ttl.setJumlah(3);
    Ttl.info();
    System.out.println("Biaya Total = " + Ttl.hitungBayarKursi(3));
    System.out.println("Harga satuan = " + Ttl.sethargaKursi());
    System.out.println("--------------------");  
    }
}   
   

    

