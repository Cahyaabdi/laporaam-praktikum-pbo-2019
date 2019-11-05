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

   public class Barrier1841720070yayak implements Destroyable1841720070yayak{
    private int strength;

    public Barrier1841720070yayak(int strength) {
        this.strength = strength;
    }

    public void setStrengthyayak(int strength) {
        this.strength = strength;
    }

    public int getStrengthyayak() {
        return strength;
    }

    @Override
    public void destroyedyayak() {
        this.strength -= (0.1 * this.strength);
    }
    
    public String getBarrierInfoyayak() {
        return "Barrier Strength = " + this.strength;
    }
}
 

