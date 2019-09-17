/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author can
 */
public class KoperasiDemo1841720070yayak {
    public static void main(String[] args){
        Anggota1841720070yayak anggota1 = new Anggota1841720070yayak("Cahya Abdillah","Jalan campurdarat-bandung");
        System.out.println("Simpanan"+anggota1.getnama1841720070yayak()+": Rp"+anggota1.getSimpanan1841720070yayak());
        anggota1.setNama1841720070yayak("Cahya Abdillah");
        anggota1.setAlamat1841720070yayak("Jalan campurdarat-bandung");
        anggota1.setor1841720070yayak(100000);
        System.out.println("Simpanan"+anggota1.getnama1841720070yayak()+":Rp"+anggota1.getSimpanan1841720070yayak());
      
        anggota1.pinjam1841720070yayak(5000);
        System.out.println("Simpanan"+anggota1.getnama1841720070yayak()+":Rp"+anggota1.getSimpanan1841720070yayak());
    }   
    
    
    
}
