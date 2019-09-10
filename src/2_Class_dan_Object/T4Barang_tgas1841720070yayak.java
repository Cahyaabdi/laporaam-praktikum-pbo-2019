/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu2;

/**
 *
 * @author can
 */

    public class T4Barang_tgas1841720070yayak {
    String kode;
    String namaBarang;
    int hargaDasar;
    float diskon;
    
    int hitungHargaJualyayak(int hargaDasar, float diskon){
        this.hargaDasar = hargaDasar;
        this.diskon = diskon;
        int hargaJual =(int) (hargaDasar - (diskon*hargaDasar));
      return hargaJual;
    }
    void tampilDatayayak(){
        System.out.println("Kode        : "+kode);
        System.out.println("Nama Barang :"+namaBarang);
        System.out.println("harga Dasar :"+hargaDasar);
        System.out.println("Diskon      :"+diskon);
    }
}

