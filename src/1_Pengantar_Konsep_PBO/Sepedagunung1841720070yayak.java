/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author can
 */
public class Sepedagunung1841720070yayak extends sepeda1841720070yayak {
    
    private String tipeSuspensi;
    
    public void setTipeSuspensiyayak (String newValue){
        tipeSuspensi = newValue;
    }
    public void cetakStatusyayak(){
        super.cetakStatusyayak();
        System.out.println("Tipe suspensi:"+ tipeSuspensi);
                
    }
}
