/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu2;

import java.util.Scanner;





public class T3TestLingkaran181720070yayak {
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
            T3Lingkaran1841720070yayak lg1 = new T3Lingkaran1841720070yayak();
            
            System.out.println("Nilai phi : "+lg1.phi);
            System.out.println("Nilai jari-jari : ");
            lg1.r= sc.nextDouble();
      
            
            System.out.println("\nLuas Lingkaran : "+lg1.hitungLuasIrgy(3.14));
            System.out.println("Luas Keliling : "+lg1.hitungKelilingIrgy(3.14));
    }
}

