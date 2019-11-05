/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author can
 */
public class Tester41841720070yayak {
    
    public static void main(String[] args) {
        Owner1841720070yayak ow = new Owner1841720070yayak();
        
        ElectricityBill1841720070yayak eBill = new ElectricityBill1841720070yayak(5, "R-1");
        ow.pay(eBill);
        System.out.println("-------------------------");
        
        PermanentEmployee1841720070yayak pEmp = new PermanentEmployee1841720070yayak("Dedik", 500);
        ow.pay(pEmp);
        System.out.println("-------------------------");
        
        InternshipEmployee1841720070yayak iEmp = new InternshipEmployee1841720070yayak("Sunarto", 5);
        ow.showMyEmployee1841720070yayak(pEmp);
        System.out.println("-------------------------");
        ow.showMyEmployee1841720070yayak(iEmp);
        

//        ow.pay(iEmp);
    }
}


