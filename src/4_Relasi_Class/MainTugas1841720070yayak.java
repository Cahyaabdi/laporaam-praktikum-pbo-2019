/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author can
 */
public class MainTugas1841720070yayak {
    
    public static void main(String[] args) {
   System.out.println("Warunk Perbatasan yayak"); 
   System.out.println("##--##--##--##--##--##--##");   
    JenisLauk1841720070yayak JnsLk =new JenisLauk1841720070yayak();
    JnsLk.tampil();
    
    
     JenisLauk1841720070yayak lk = new JenisLauk1841720070yayak();
    lk.hitungBayarLauk(5);
    
    
   System.out.println("----##--##--##----");
   
     Minuman1841720070yayak Mnm = new Minuman1841720070yayak();
    Mnm.setMinuman("Yoyok");
    Mnm.sethargaMinuman(5000);
    Mnm.setJumlahMinuman(2);
    Mnm.info();
    System.out.println("----##--##--##----");  
   Totalan1841720070yayak Ttl = new Totalan1841720070yayak("Yayak", 5, 3);
   
    Ttl.setNama("Yayak");
    Ttl.setHarga(5000);
    Ttl.setJumlah(3);
    Ttl.info();
    System.out.println("Biaya Total = " + Ttl.hitungBayarLauk(1));
    System.out.println("Harga  = " + Ttl.sethargaMinuman());
    System.out.println("--##--##--##--##--##--");  
    }
}   
   

    


