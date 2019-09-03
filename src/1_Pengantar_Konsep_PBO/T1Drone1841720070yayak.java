/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author can
 */
public class T1Drone1841720070yayak {
   private String Merek;
    private int naik;
    private int turun;
    
    public void setMerekyayak(String newValue){
        Merek = newValue;
        
    }
    public void kecepatanNaikyayak(int newValue){
        naik = newValue;
    }
    public void tambahKecepatanyayak(int increment){
        naik = naik + increment;
    }
    public void kurangiKecepatanyayak(int decrement){
        turun = turun - decrement;
    }
    public void cetakStatusyayak(){
        System.out.println("Merek: "+Merek);
        System.out.println("Kecepatan naik: "+naik);
        System.out.println("Kecepatan turun: "+ turun);
                 
    }

    

}