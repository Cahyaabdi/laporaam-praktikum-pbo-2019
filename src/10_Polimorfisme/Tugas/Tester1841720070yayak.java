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

    
public class Tester1841720070yayak {
    public static void main(String[] args) {
        WalkingZombie1841720070yayak wz = new WalkingZombie1841720070yayak(100, 1);
        JumpingZombie1841720070yayak jz = new JumpingZombie1841720070yayak(100, 2);
        Barrier1841720070yayak b = new Barrier1841720070yayak(100);
        Plant1841720070yayak p = new Plant1841720070yayak();
        System.out.println(""+wz.getZombieInfoyayak());
        System.out.println(""+jz.getZombieInfoyayak());
        System.out.println(""+b.getBarrierInfoyayak());
        System.out.println("---------------------");
        for (int i = 0; i < 4; i++) {
            p.doDestroy1841720070yayak(wz);
            p.doDestroy1841720070yayak(jz);
            p.doDestroy1841720070yayak(b);
        }
        System.out.println(""+wz.getZombieInfoyayak());
        System.out.println(""+jz.getZombieInfoyayak());
        System.out.println(""+b.getBarrierInfoyayak());
    }
}


