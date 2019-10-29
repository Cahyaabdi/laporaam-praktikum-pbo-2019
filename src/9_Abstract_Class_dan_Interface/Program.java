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
public class Program {
 
    
    public static void main(String[] args){
        
        Kucing1841720070yayak kucingKampung = new Kucing1841720070yayak();
        Ikan1841720070yayak lumbaLumba = new Ikan1841720070yayak();
        
        
        Orang1841720070yayak ani = new Orang1841720070yayak("Ani");
        Orang1841720070yayak budi = new Orang1841720070yayak("Budi");
        
        ani.peliharaHewan1841720070yayak(kucingKampung);
        budi.peliharaHewan1841720070yayak(lumbaLumba);
        
        ani.ajakPeliharaanJalanJalan();
        budi.ajakPeliharaanJalanJalan();
    }
}
