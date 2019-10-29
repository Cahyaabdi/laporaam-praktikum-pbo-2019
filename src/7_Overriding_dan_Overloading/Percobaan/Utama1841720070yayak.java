<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author can
 */
public class Utama1841720070yayak  {
    public static void main(String[] args){
        System.out.println("Program Testing Class Manager & Staff");
        Manager1841720070yayak man[]= new Manager1841720070yayak[2];
        Staff1841720070yayak staff1[]= new Staff1841720070yayak[2];
        Staff1841720070yayak staff2[]= new Staff1841720070yayak[3];
        
        //PEMBUATAN MANAGER
        
        man[0]= new Manager1841720070yayak();
        man[0].setNama1841720070yayak("Tedjo");
        man[0].setNip("101");
        man[0].setGolongan1841720070yayak("1");
        man[0].setTunjangan1841720070yayak(5000000);
        man[0].setBagian1841720070yayak("Administrasi");
        
         man[1]= new Manager1841720070yayak();
        man[1].setNama1841720070yayak("Atika");
        man[1].setNip("102");
        man[1].setGolongan1841720070yayak("1");
        man[1].setTunjangan1841720070yayak(2500000);
        man[1].setBagian1841720070yayak("Pemasaran");
        
        staff1[0]= new Staff1841720070yayak();
        staff1[0].setNama1841720070yayak("Usman");
        staff1[0].setNip("0003");
        staff1[0].setGolongan1841720070yayak("2");
        staff1[0].setLembur1841720070yayak(10);
        staff1[0].setGajiLembur1841720070yayak(10000);
        
        
        staff1[1]= new Staff1841720070yayak();
        staff1[1].setNama1841720070yayak("Anugrah");
        staff1[1].setNip("0005");
        staff1[1].setGolongan1841720070yayak("2");
        staff1[1].setLembur1841720070yayak(10);
        staff1[1].setGajiLembur1841720070yayak(55000);
        man[0].setStaff(staff1);                       
        
        staff2[0]= new Staff1841720070yayak();
        staff2[0].setNama1841720070yayak("Hendra");
        staff2[0].setNip("0004");
        staff2[0].setGolongan1841720070yayak("3");
        staff2[0].setLembur1841720070yayak(15);
        staff2[0].setGajiLembur1841720070yayak(5500);
        
        staff2[1]= new Staff1841720070yayak();
        staff2[1].setNama1841720070yayak("Arie");
        staff2[1].setNip("0006");
        staff2[1].setGolongan1841720070yayak("4");
        staff2[1].setLembur1841720070yayak(5);
        staff2[1].setGajiLembur1841720070yayak(10000);
        
        
        
        staff2[2]= new Staff1841720070yayak();
        staff2[2].setNama1841720070yayak("Mentari");
        staff2[2].setNip("0006");
        staff2[2].setGolongan1841720070yayak("4");
        staff2[2].setLembur1841720070yayak(5);
        staff2[2].setGajiLembur1841720070yayak(20000);
        man[1].setStaff(staff2);
        
        //cetak informasi dari manager dari manager + staffnya
        man[0].lihatInfo();
        man[1].lihatInfo();
    
    }
    
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author can
 */
public class Utama1841720070yayak  {
    public static void main(String[] args){
        System.out.println("Program Testing Class Manager & Staff");
        Manager1841720070yayak man[]= new Manager1841720070yayak[2];
        Staff1841720070yayak staff1[]= new Staff1841720070yayak[2];
        Staff1841720070yayak staff2[]= new Staff1841720070yayak[3];
        
        //PEMBUATAN MANAGER
        
        man[0]= new Manager1841720070yayak();
        man[0].setNama1841720070yayak("Tedjo");
        man[0].setNip("101");
        man[0].setGolongan1841720070yayak("1");
        man[0].setTunjangan1841720070yayak(5000000);
        man[0].setBagian1841720070yayak("Administrasi");
        
         man[1]= new Manager1841720070yayak();
        man[1].setNama1841720070yayak("Atika");
        man[1].setNip("102");
        man[1].setGolongan1841720070yayak("1");
        man[1].setTunjangan1841720070yayak(2500000);
        man[1].setBagian1841720070yayak("Pemasaran");
        
        staff1[0]= new Staff1841720070yayak();
        staff1[0].setNama1841720070yayak("Usman");
        staff1[0].setNip("0003");
        staff1[0].setGolongan1841720070yayak("2");
        staff1[0].setLembur1841720070yayak(10);
        staff1[0].setGajiLembur1841720070yayak(10000);
        
        
        staff1[1]= new Staff1841720070yayak();
        staff1[1].setNama1841720070yayak("Anugrah");
        staff1[1].setNip("0005");
        staff1[1].setGolongan1841720070yayak("2");
        staff1[1].setLembur1841720070yayak(10);
        staff1[1].setGajiLembur1841720070yayak(55000);
        man[0].setStaff(staff1);                       
        
        staff2[0]= new Staff1841720070yayak();
        staff2[0].setNama1841720070yayak("Hendra");
        staff2[0].setNip("0004");
        staff2[0].setGolongan1841720070yayak("3");
        staff2[0].setLembur1841720070yayak(15);
        staff2[0].setGajiLembur1841720070yayak(5500);
        
        staff2[1]= new Staff1841720070yayak();
        staff2[1].setNama1841720070yayak("Arie");
        staff2[1].setNip("0006");
        staff2[1].setGolongan1841720070yayak("4");
        staff2[1].setLembur1841720070yayak(5);
        staff2[1].setGajiLembur1841720070yayak(10000);
        
        
        
        staff2[2]= new Staff1841720070yayak();
        staff2[2].setNama1841720070yayak("Mentari");
        staff2[2].setNip("0006");
        staff2[2].setGolongan1841720070yayak("4");
        staff2[2].setLembur1841720070yayak(5);
        staff2[2].setGajiLembur1841720070yayak(20000);
        man[1].setStaff(staff2);
        
        //cetak informasi dari manager dari manager + staffnya
        man[0].lihatInfo();
        man[1].lihatInfo();
    
    }
    
}
>>>>>>> 039777f585ae00e1a830a9a1fe783a0d451a4ecc
