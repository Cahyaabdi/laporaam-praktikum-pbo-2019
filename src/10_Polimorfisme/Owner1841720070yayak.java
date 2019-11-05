/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author can
 */
public class Owner1841720070yayak {
    public void pay(Payable1841720070yayak p){
        System.out.println("Total payment = "+ p.getPaymentAmount());
        if (p instanceof ElectricityBill1841720070yayak) {
            ElectricityBill1841720070yayak eb = (ElectricityBill1841720070yayak)p;
            System.out.println(""+eb.getBillInfo());
        } else if (p instanceof PermanentEmployee1841720070yayak) {
            PermanentEmployee1841720070yayak pe = (PermanentEmployee1841720070yayak)p;
            pe.getEmployeeInfo();
            System.out.println(""+pe.getEmployeeInfo());
        }
    }
    public void showMyEmployee1841720070yayak(Employee1841720070yayak e) {
        System.out.println(""+e.getEmployeeInfo());
        if (e instanceof PermanentEmployee1841720070yayak) {
            System.out.println("You have to pay her/him monthly!!!");
        } else {
            System.out.println("No need to pay him/her :)");
        }
    }
}
