/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan5;

/**
 *
 * @author can
 */
public class Manager1841720070yayak extends Karyawan1841720070yayak {
public int tunjangan;

public Manager1841720070yayak(){
    
}
    public void tampilDataManageryayak(){
        super.tampilDataKaryawanyayak();
        System.out.println("Tunjangan       ="+tunjangan);
        System.out.println("Total Gaji      ="+(super.gaji+tunjangan));
    }
}
