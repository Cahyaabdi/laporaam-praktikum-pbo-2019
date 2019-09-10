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

    public class T4BarangTugasMain1841720143yayak {
     public static void main(String[] args) {
        
        T4Barang_tgas1841720070yayak brg = new T4Barang_tgas1841720070yayak();
        
        brg.kode = "Go Pro";
        brg.namaBarang = "Action cam";
        brg.hargaDasar = 100000;
        brg.diskon = (float) 0.1;
        brg.tampilDatayayak();
        
        System.out.println("Harga Jual : "+brg.hitungHargaJualyayak(10000000, (float)0.1));
         
    }
}

