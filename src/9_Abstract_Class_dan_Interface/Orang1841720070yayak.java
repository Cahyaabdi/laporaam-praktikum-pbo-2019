/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbominggu9.abstractclass;

/**
 *
 * @author can
 */
public class Orang1841720070yayak {
private String nama;
private Hewan1841720070yayak hewanPeliharaan;

public Orang1841720070yayak(String nama){
this.nama = nama;    
}
public void peliharaHewan1841720070yayak(Hewan1841720070yayak hewanPeliharaan){
    this.hewanPeliharaan = hewanPeliharaan;
}
public void ajakPeliharaanJalanJalan(){
    System.out.println("Namaku" +this.nama);
    System.out.println("Hewan peliharaanku berjalan dengan cara: ");
    this.hewanPeliharaan.bergerak1841720070yayak();
    System.out.println("----------------------------------------------");
}
}
