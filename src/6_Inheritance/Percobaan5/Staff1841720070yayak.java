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
public class Staff1841720070yayak extends Karyawan1841720070yayak {
    public int lembur, potongan;
    
    public Staff1841720070yayak(){
        
    }
    public Staff1841720070yayak(String nama, String alamat, String jk,int umur, int gaji,int lembur,int potongan){
        super(nama,alamat,jk,umur,gaji);
        this.lembur=lembur;
        this.potongan=potongan;
    }
        public void tampilDataStaffyayak(){
            super.tampilDataKaryawanyayak();
            System.out.println("Lembur          ="+lembur);
            System.out.println("Potongan        ="+potongan);
            System.out.println("Total Gaji      ="+(gaji+lembur-potongan));
        }
    }

