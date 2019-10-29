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
 
    public class Pc1841720070yayak extends Komputer1841720070yayak{
    public int ukuranMonitor;

    public Pc1841720070yayak(){
        
    }
    public Pc1841720070yayak(int ukuranMonitor, String merk, String jnsProsesor, int kecProsesor, int sizeMemory) {
        super(merk, jnsProsesor, kecProsesor, sizeMemory);
        this.ukuranMonitor = ukuranMonitor;
    }
    
    public void tampilPcyayak(){
        super.tampilData();
        System.out.println("ukuran PC           ="+ukuranMonitor);
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
 
    public class Pc1841720070yayak extends Komputer1841720070yayak{
    public int ukuranMonitor;

    public Pc1841720070yayak(){
        
    }
    public Pc1841720070yayak(int ukuranMonitor, String merk, String jnsProsesor, int kecProsesor, int sizeMemory) {
        super(merk, jnsProsesor, kecProsesor, sizeMemory);
        this.ukuranMonitor = ukuranMonitor;
    }
    
    public void tampilPcyayak(){
        super.tampilData();
        System.out.println("ukuran PC           ="+ukuranMonitor);
    }
}


>>>>>>> 039777f585ae00e1a830a9a1fe783a0d451a4ecc
