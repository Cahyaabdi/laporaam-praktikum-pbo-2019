/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan4;

/**
 *
 * @author can
 */
    
    
    public class Gerbong1841720070yayak {
    private String kode;
    private Kursi1841720070yayak[] arrayKursi;

    public Gerbong1841720070yayak(String kode, Kursi1841720070yayak[] arrayKursi) {
        this.kode = kode;
        this.arrayKursi = arrayKursi;
    }

    
    
    
    
    private void initKursi(){
        for(int i = 0; i < arrayKursi.length; i++){
            this.arrayKursi[i] = new Kursi1841720070yayak(String.valueOf(i + 1));
        }
    }
    
    public Gerbong1841720070yayak(String kode, int jumlah){
        this.kode = kode;
        this.arrayKursi = new Kursi1841720070yayak[jumlah];
        this.initKursi();
    }
    
    public String infoyayak(){
        String info = "";    
        info += "Kode: " + kode + "\n";
        for(Kursi1841720070yayak kursi : arrayKursi){
            info += kursi.infoyayak();
        }    
        return info;
    }
    
    public void setPenumpang(Penumpang1841720070yayak penumpang, int nomor){
        this.arrayKursi[nomor - 1].setPenumpangyayak(penumpang);
    }
}

