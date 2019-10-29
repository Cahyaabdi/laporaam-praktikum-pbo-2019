/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacelatihan;

/**
 *
 * @author can
 */
public class Sarjana1841720070yayak extends Mahasiswa1841720070yayak implements ICumlaude {
    
    public Sarjana1841720070yayak(String nama){
        super(nama);
    }
    @Override
    public void lulusyayak(){
        System.out.println("Aku sudah menyelesaikan SKRIPSI");
    }
    @Override
    public void meraihIPKTinggiyayak(){
        System.out.println("IPK-ku lebih dari 3,51");
    }

   }
    
