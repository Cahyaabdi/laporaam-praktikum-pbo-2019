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

    public class JumpingZombie1841720070yayak extends Zombie1841720070yayak {
    
    public JumpingZombie1841720070yayak(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void healyayak() {
        switch(this.level){
            case 1: this.health += (30/100 * this.health);break;
            case 2: this.health += (40/100 * this.health);break;
            case 3: this.health += (50/100 * this.health);break;
        }
    }

    @Override
    public void destroyedyayak() {
        this.health -= (10 * this.health / 100);
    }

    @Override
    public String getZombieInfoyayak() {
        String info = super.getZombieInfoyayak();
        return "Jumping Zombie Data = \n"
        + info;
    }
}


