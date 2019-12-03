
package frontend;

import backend.Anggota1841720070yayak;


public class TestBackendAnggota1841720070yayak {
    public static void main(String[] args) {
        Anggota1841720070yayak agt1 = new Anggota1841720070yayak("Hunayn", "Sidaorjo", "123");
        Anggota1841720070yayak agt2 = new Anggota1841720070yayak("Ardan", "Bojonegoro", "456");
        Anggota1841720070yayak agt3 = new Anggota1841720070yayak("Dina", "Malang", "789");
        
        //test insert
        agt1.save();
        agt2.save();
        agt3.save();
        
        //test update
        agt2.setAlamat("Jawa Timur");
        agt2.save();
        
        //test delete
        agt3.delete();
        
        //tes select all
        for(Anggota1841720070yayak k : new Anggota1841720070yayak().getAll()){
            System.out.println("Nama: " + k.getNama() + ", Alamat : " + k.getAlamat() + ", Telepon : " + k.getTelepon());
        }
        
        //test search
        for(Anggota1841720070yayak a : new Anggota1841720070yayak().search("Timur")){
            System.out.println("Nama: " + a.getNama() + ", Alamat : " + a.getAlamat() + ", Telepon : " + a.getTelepon());
        }
    }
}
