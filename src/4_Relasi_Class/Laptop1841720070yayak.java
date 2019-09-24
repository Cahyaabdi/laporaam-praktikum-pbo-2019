/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan1;

/**
 *
 * @author can
 */
public class Laptop1841720070yayak {
    private String merk;
    private Processor1841720070yayak proc;

    public Laptop1841720070yayak(String merk, Processor1841720070yayak proc) {
        this.merk = merk;
        this.proc = proc;
    }

    public Laptop1841720070yayak() {
    }
    
    
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public Processor1841720070yayak getProc() {
        return proc;
    }

    public void setProc(Processor1841720070yayak proc) {
        this.proc = proc;
    }
    public void infoyayak(){
        System.out.println("Merk Laptop ="+merk);
        proc.infoyayak();
    }
}

