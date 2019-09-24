/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan1;

/**
 *
 * @author can
 */
public class MainPercobaan1841720070yayak {
    public static void main(String[] args) {
    Processor1841720070yayak p = new Processor1841720070yayak("intel i5", 3);
    Laptop1841720070yayak L = new Laptop1841720070yayak("Thinkpad", p);
    
    L.infoyayak();
    
    
        Processor1841720070yayak p1 = new Processor1841720070yayak();
        p1.setMerkyayak("Intel i5");
        p1.setCacheyayak(4);
        Laptop1841720070yayak L1 = new Laptop1841720070yayak();
        L1.setMerk("Thinkpad");
        L1.setProc(p1);
        L1.infoyayak(); 
    }
}
    

 