/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author can
 */

public class Tester21841720070yayak {
    public static void main(String[] args) {
        PermanentEmployee1841720070yayak pEmp = new PermanentEmployee1841720070yayak("Dedik", 500);
        
        Employee1841720070yayak e;
        
        e = pEmp;
        
        System.out.println("" + e.getEmployeeInfo());
        System.out.println("=====================");
        System.out.println(""+ pEmp.getEmployeeInfo());
    }
}

