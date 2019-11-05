/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author can
 */
public class Tester31841720070yayak {
    public static void main(String[] args) {
        PermanentEmployee1841720070yayak pEmp = new PermanentEmployee1841720070yayak("Dedik", 500);
        InternshipEmployee1841720070yayak iEmp = new InternshipEmployee1841720070yayak("Sunarto", 5);
        ElectricityBill1841720070yayak eBill = new ElectricityBill1841720070yayak(5, "R-1");
        
        Employee1841720070yayak e[] = {pEmp, iEmp};
        Payable1841720070yayak p[] = {pEmp, eBill};
     Employee1841720070yayak e2[] = {pEmp, iEmp};
    }
}
