/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author can
 */
public class JenisKursi1841720070yayak {
    
    private int harga;
    private String jenisKursi;
    
    public void setJenis(String JenisKursi){
        this.jenisKursi = jenisKursi;
    }
    public String getJenisKursiyayak(){
        return jenisKursi;
    }
    
    public void setHargayayak(int harga){
        this.harga = harga;
    }
    public int getBayaryayak(){
        return harga;
    }
    
    public int hitungBayarKursi(int Kursi){
        return harga * Kursi;
    }
    public int Kursi1(int harga){
        return harga;
    }
    public int Kursi2(int harga){
        return harga;
    }
    public int Kursi3(int harga){
        return harga;
    }
    public int Kursi4(int harga){
        return harga;
    }
    public void tampil(){
        System.out.println("Jenis jenis dan harga kursi: ");
        System.out.println("Harga Kursi belajar 1 : "+Kursi1(150000));
        System.out.println("Harga Kursi Kerja   2 : "+Kursi2(160000));
        System.out.println("Harga Kursi Gaming  3 : "+Kursi3(200000));
        System.out.println("Harga Kursi balap   4 :  "+Kursi4(900000));
    }
}