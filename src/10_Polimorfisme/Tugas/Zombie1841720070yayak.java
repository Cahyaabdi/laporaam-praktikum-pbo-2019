/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

import javax.security.auth.Destroyable;

/**
 *
 * @author can
 */

    abstract public class Zombie1841720070yayak implements Destroyable1841720070yayak{
    protected int health, level;
    
    abstract public void healyayak();
    @Override
    abstract public void destroyedyayak();
    public String getZombieInfoyayak() {
        return "Health = " + this.health + "\n"
        + "Level = " + this.level + "\n";
    };
}


