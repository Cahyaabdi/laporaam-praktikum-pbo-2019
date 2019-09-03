/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author can
 */

    public class sepeda1841720070yayak{
    
    private String merek;
    private int kecepatan;
    private int gear;
    private String warna;
    
    public void setMerekyayak(String newValue){
        merek = newValue;
        
    }
    public void gantiGearyayak(int newValue){
        gear = newValue;
    }
    public void tambahKecepatanyayak(int increment){
        kecepatan = kecepatan + increment;
    }
    public void remyayak(int decrement){
        kecepatan = kecepatan - decrement;
    }
    public void warnayayak(String newValue){
        warna = newValue;
    }
    public void cetakStatusyayak(){
        System.out.println("merek: "+merek);
        System.out.println("kecepatan: "+kecepatan);
        System.out.println("Gear: "+ gear);
        System.out.println("warna:"+ warna);        
    }

  
}

 