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

    public class Windows1841720070yayak extends Komputer1841720070yayak{
    public String fitur;
    
    public Windows1841720070yayak(){
        
    }

    public Windows1841720070yayak(String fitur, String merk, String jnsProsesor, int kecProsesor, int sizeMemory) {
        super(merk, jnsProsesor, kecProsesor, sizeMemory);
        this.fitur = fitur;
    }
    
    public void tampilWindows(){
        super.tampilData();
        System.out.println("Fitur               ="+fitur);
    }
    
}

