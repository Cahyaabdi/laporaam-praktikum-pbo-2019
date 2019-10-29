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
public class Inheritance1 {
    public static void main(String[] args){
        
        Manager1841720070yayak M = new Manager1841720070yayak();
        M.nama="Cahyo";
        M.alamat="Jln. Kenanganmantan";
        M.umur=19;
        M.jk="Laki-laki";
        M.gaji=3000000;
        M.tunjangan=1000000;
        M.tampilDataManageryayak();
        
        Staff1841720070yayak S = new Staff1841720070yayak();
        S.nama="Loli";
        S.alamat="Malang";
        S.umur=25;
        S.jk="Perempuan";
        S.gaji=2000000;
        S.lembur=500000;
        S.potongan=250000;
        S.tampilDataStaffyayak();
    }
}
