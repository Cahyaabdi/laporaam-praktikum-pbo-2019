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
public class Barang1841720070yayak {
    public String namabrg;
    public String jenisBrg;
    public int stok;
    
    public void tampilBarang1841720070yayak(){
        System.out.println("Hoodie"+namabrg);
        System.out.println("Pakaian"+jenisBrg);
        System.out.println("Stok"+stok);
    }        
        //method dengan argumen dan nilai balik (return)
 public  int tambahStok1841720070(int brgMasuk){
     int stokBaru=brgMasuk+stok;
     return stokBaru;
 }      
}

