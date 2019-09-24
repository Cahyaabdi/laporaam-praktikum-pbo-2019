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
public class Totalan1841720070yayak{

    private String Nama;
   private int harga;
   private int jumlah;
    
    
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    public String getNama(){
        return Nama;
    }

    public Totalan1841720070yayak(String Nama, int harga, int jumlah) {
        this.Nama = Nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
   public int hitungBayarLauk(int lauk){
        return harga * lauk;
   }
   
    public int sethargaMinuman(){
        this.harga = 2000;
        return harga;
    }
   
     public void info(){
     System.out.println("Nama Pemesan            : " + Nama);
     System.out.println("Jumlah yang anda pilih    : " + harga);
    }
}