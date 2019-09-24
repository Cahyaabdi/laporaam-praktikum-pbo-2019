/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan4;
import java.util.Scanner;
        
/**
 *
 * @author can
 */
public class Penumpang1841720070yayak {
    
    private String ktp ;
    private String nama;
    public String info() {
        String info = "";
        info += "Ktp: " + ktp + "\n";
        info += "Nama: " + nama + "\n";
        return info;
    } 

    public Penumpang1841720070yayak(String ktp, String nama) {
        this.ktp = ktp;
        this.nama = nama;
    }

    
   
    
    public String getKtpyayak() {
        return ktp;
    }

    public void setKtp(String ktp) {
        this.ktp = ktp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
}
