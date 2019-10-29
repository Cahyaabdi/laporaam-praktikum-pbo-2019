/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author can
 */
public class Model1841720070yayak {
    
    private String merk;
    private String warna;
    private double cache;

    public Model1841720070yayak(String merk, double cache, String warna) {
        this.merk = merk;
        this.cache = cache;
        this.warna = warna;
        
        }

    public Model1841720070yayak() {
    }
    
    public String getMerkyayak() {
        return merk;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    
    public void setMerkyayak(String merk) {
        this.merk = merk;
    }

    public Double getCache() {
        return cache;
    }

    public void setCacheyayak(double cache) {
        this.cache = cache;
    }
        public void infoyayak() {
            System.out.printf("Model Kursi =%s\n", merk);
            System.out.printf("Warna kursi = %s\n",warna);
            
        }
}

