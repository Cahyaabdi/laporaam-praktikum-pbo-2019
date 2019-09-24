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
public class Kursi1841720070yayak {
     private String info;
    private String nomor ;
    private Penumpang1841720070yayak penumpang;

    public Kursi1841720070yayak(String nomor) {
        this.nomor = nomor;
    }
 
    
    
    
    public  String infoyayak(){
        String info ="";
        info+="Nomor :"+ nomor + "\n";
        if (this.penumpang != null){
            info +="penumpang :" + penumpang.info() +"\n";
        }
        return info;
    }

    public Kursi1841720070yayak(String info, String nomor, Penumpang1841720070yayak penumpang) {
        this.info = info;
        this.nomor = nomor;
        this.penumpang = penumpang;
    }

    public String getInfoyayak() {
        return info;
    }

    public void setInfoyayak(String info) {
        this.info = info;
    }

    public String getNomoryayak() {
        return nomor;
    }

    public void setNomoryayak(String nomor) {
        this.nomor = nomor;
    }

    public Penumpang1841720070yayak getPenumpangyayak() {
        return penumpang;
    }

    public void setPenumpangyayak(Penumpang1841720070yayak penumpang) {
        this.penumpang = penumpang;
    }
    
}
