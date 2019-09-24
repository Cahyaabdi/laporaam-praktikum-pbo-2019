/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan1;




public class Processor1841720070yayak {
    private String merk;
    private double cache;

    public Processor1841720070yayak(String merk, double cache) {
        this.merk = merk;
        this.cache = cache;
        
        
        }

    public Processor1841720070yayak() {
    }
    
    public String getMerkyayak() {
        return merk;
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
            System.out.printf("Merk Processor =%s\n", merk);
            System.out.printf("Cache Memory =%.2f\n", cache);
        }
}
    
    

