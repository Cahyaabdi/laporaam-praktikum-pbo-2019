/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu3;

/**
 *
 * @author can
 */
public class Motor1841720070yayak {
    private int kecepatan = 0;
    private boolean kontak0n=false;
    public void nyalakanMesin1841720070yayak(){
         kontak0n =true;
    }
    public void matikanMesin1841720070yayak(){
        kontak0n= false;
        kecepatan = 0;
    }
    public void tambahKecepatan1841720070yayak(){
        if (kontak0n == true){
            kecepatan+=25;
            if (kecepatan>=100){
                System.out.println("Kecepatan Maksimal");
                kecepatan =100;
            }
        }
        else{
            System.out.println("Kecepatan tidak bisa bertambah karena mesin 0ff!\n");
        }
    }
    public void kurangikecepatan1841720070yayak(){
        if(kontak0n == true){
            kecepatan-=5;
        }
        else{
            System.out.println("Keceptan tidak bisa berkurang karena Mesin 0ff!\n");
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public void printStatus1841720070yayak() {
      if(kontak0n == true){
          System.out.println("Kontak On");
      }  
      else{
          System.out.println("kontak 0ff");
      } 
        System.out.println("kecepatan"+kecepatan+"\n");
    }
    
}
