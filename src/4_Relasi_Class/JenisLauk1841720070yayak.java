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
public class JenisLauk1841720070yayak {
    
    private int harga;
    private String jenisLauk;
    
    public void setJenis(String JenisLauk){
        this.jenisLauk = jenisLauk;
    }
    public String getJenisLaukyayak(){
        return jenisLauk;
    }
    
    public void setHargayayak(int harga){
        this.harga = harga;
    }
    public int getBayaryayak(){
        return harga;
    }
    
    public int hitungBayarLauk(int lauk){
        return harga * lauk;
    }
    public int lauk1(int harga){
        return harga;
    }
    public int lauk2(int harga){
        return harga;
    }
    public int lauk3(int harga){
        return harga;
    }
    public int lauk4(int harga){
        return harga;
    }
    public void tampil(){
        System.out.println("Jenis jenis harga Lauk: ");
        System.out.println("Harga Paket 1  Kuah: "+lauk1(15000));
        System.out.println("Harga Paket 2 Kering : "+lauk2(16000));
        System.out.println("Harga Paket 3 Plus plus : "+lauk3(20000));
        System.out.println("Harga Paket 4  All you can eat: "+lauk4(90000));
    }
}
 

