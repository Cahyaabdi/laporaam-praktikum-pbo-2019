/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan3;

/**
 *
 * @author can
 */
public class Tabung1841720070yayak extends Bangun1841720070yayak {

   protected int t;
   protected int r;
   protected double phi;
   public void setSuperPhiyayak (double phi){
   super.phi = phi;
    }
   public void setSuperRyayak(int r){
        super.r =r;
    }
    public void setTyayak(int t){
        this.t=t;
    }
    
    public void volume(){
        System.out.println("Volume tabung adalah "+(super.phi*super.r*super.r*this.t));
    }
}

