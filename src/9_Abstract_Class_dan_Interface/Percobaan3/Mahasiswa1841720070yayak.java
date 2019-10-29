/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P3;

/**
 *
 * @author can
 */

    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class Mahasiswa1841720070yayak implements ICumlaude {
    protected String nama;

    public Mahasiswa1841720070yayak(String nama) {
        this.nama = nama;
    }
    
    @Override
    public void lulusyayak() {
        System.out.println("BISMILLAH TERBAIK"); 
    }

    @Override
    public void meraihIPKTinggiyayak() {
        System.out.println("LEBIH DARI 3,5"); 
    }
    
    public void kuliahDikampusyayak(){
        System.out.println("Aku mahasiswa, namaku "+this.nama);
        System.out.println("Aku berkuliah di kampus.");
    }

}
    