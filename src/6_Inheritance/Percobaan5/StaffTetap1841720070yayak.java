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
public class StaffTetap1841720070yayak extends Staff1841720070yayak {
    public String golongan;
    public int asuransi;
    
    public StaffTetap1841720070yayak(){
        
    }
    public StaffTetap1841720070yayak(String nama,String alamat,String jk, int umur,int gaji, int lembur, int potongan, String golongan, int asuransi){
        super(nama,alamat,jk,umur,gaji,potongan,lembur);
    this.golongan=golongan;
    this.asuransi=asuransi;
    }
    public void tampilStaffTetap1841720070yayak(){
        System.out.println("=====================Data Staff Tetap=====================");    
        super.tampilDataStaffyayak();
        System.out.println("Golongan                ="+golongan);
        System.out.println("Jumlah Asuransi         ="+asuransi);
        System.out.println("Gaji Bersih             ="+(gaji+lembur-potongan-asuransi));
    }   
}
    

