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

   public class Leptop1841720070yayak extends Komputer1841720070yayak{
    public String jnsBaterai;
    
    public Leptop1841720070yayak(){
        
    }

    public Leptop1841720070yayak(String jnsBaterai, String merk, String jnsProsesor, int kecProsesor, int sizeMemory) {
        super(merk, jnsProsesor, kecProsesor, sizeMemory);
        this.jnsBaterai = jnsBaterai;
    }
    
    public void tampilLeptop(){
        super.tampilData();
        System.out.println("Jenis Baterai       ="+jnsBaterai);
    }
}
 

