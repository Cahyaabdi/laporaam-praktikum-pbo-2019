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
public class Minuman1841720070yayak {
   
 private String Minuman;
 private int harga;
 private int jumlah;
    
     public void setMinuman(String Minuman){
        this.Minuman = Minuman;
    }
    public String getMinuman(){
        return Minuman;
    }
    
    public void sethargaMinuman(int harga){
        this.harga = harga;
    }
    public int gethargaMinuman(){
        return harga;
    }
    
    public void setJumlahMinuman(int jumlah){
        this.jumlah = jumlah;
    }
    public int getJumlahMinuman(){
        return jumlah;
    }
    
  
    public int hargaMinuman(int harga){
        return harga;
    }
    
     public void info(){
     System.out.println("Nama Minuman: " + Minuman);
     System.out.println("Jumlah : " + jumlah );
     System.out.println("Harga : " + harga );
     System.out.println("Total Harga : " + (harga*jumlah));
    }    
}

