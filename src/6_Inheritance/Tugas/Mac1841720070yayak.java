<<<<<<< HEAD
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

    public class Mac1841720070yayak extends Leptop1841720070yayak{
    public String security;
    
    public Mac1841720070yayak(){
        
    }

    public Mac1841720070yayak(String security, String jnsBaterai, String merk, String jnsProsesor, int kecProsesor, int sizeMemory) {
        super(jnsBaterai, merk, jnsProsesor, kecProsesor, sizeMemory);
        this.security = security;
    }
    
    public void tampilMac(){
        super.tampilData();
        System.out.println("Security            ="+security);
    }
}


=======
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

    public class Mac1841720070yayak extends Leptop1841720070yayak{
    public String security;
    
    public Mac1841720070yayak(){
        
    }

    public Mac1841720070yayak(String security, String jnsBaterai, String merk, String jnsProsesor, int kecProsesor, int sizeMemory) {
        super(jnsBaterai, merk, jnsProsesor, kecProsesor, sizeMemory);
        this.security = security;
    }
    
    public void tampilMac(){
        super.tampilData();
        System.out.println("Security            ="+security);
    }
}


>>>>>>> 039777f585ae00e1a830a9a1fe783a0d451a4ecc
