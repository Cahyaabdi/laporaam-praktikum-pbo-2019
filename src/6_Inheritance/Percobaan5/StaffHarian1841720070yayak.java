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
public class StaffHarian1841720070yayak extends Staff1841720070yayak {
    public int jmlJamKerja;
    
    public StaffHarian1841720070yayak(String nama, String alamat, String jk, int umur, int gaji,int lembur,int potongan,int jmlJamKerja){
        super(nama,alamat,jk,umur,gaji,lembur,potongan);
        this.jmlJamKerja=jmlJamKerja;
        
        
    }
    public void tampil1StaffHarian(){
        System.out.println("=============================Data Staff Harian=================================");
        super.tampilDataStaffyayak();
        System.out.println("Jumlah Jam Kerja="+jmlJamKerja);
        System.out.println("Gaji Bersih     ="+(gaji*jmlJamKerja+lembur-potongan));
    }
}
