/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author can
 */
public class Warung1841720070yayak {
    
    private JenisLauk1841720070yayak jenis;
    private int bayar;
    
  
    
    public void setJenisLauk(String jenisLauk){
        this.jenis = jenis;
    }
    public JenisLauk1841720070yayak getJenis(){
        return jenis;
    }
    
    public void setBayar(int bayar){
        this.bayar = bayar;
    }
    public int getBayar(){
        return bayar;
    }
    
    public int hitungBayarLauk(int lauk){
        return bayar + lauk;
    }
    
    public void info(){
     System.out.println("Yang anda pilih : " + jenis);
     System.out.println("Jumlah yang harus dibayar : " + "RP." + bayar);
        }
    }

