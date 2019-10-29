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

 
public class Sarjana1841720070yayak extends Mahasiswa1841720070yayak implements ICumlaude,IBerprestasi1841720070yayak{

    public Sarjana1841720070yayak(String nama) {
        super(nama);
    }

   

    
    @Override
    public void lulusyayak() {
        System.out.println("Aku sudah menyelesaikan SKRIPSI");  
    }

    @Override
    public void meraihIPKTinggiyayak() {
        System.out.println("IPK-ku lebih dari 3,51");  
    }

    @Override
    public void menjuaraiKompetisiyayak() {
        System.out.println("AUTO JUARA DUNIA DONGGG");    }

    @Override
    public void membuatPublikasiIlmiahyayak() {
        System.out.println("Saya telah menerbitkan Jurnalisa Kelas INTERNASIONAL");
    }   
}

