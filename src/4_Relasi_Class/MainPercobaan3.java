/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan3;

/**
 *
 * @author can
 */
public class MainPercobaan3 {
    public static void main(String[] args) { 
      Pegawai1841720070yayak masinis = new Pegawai1841720070yayak("1234", "SpongebobSqurepants");
      Pegawai1841720070yayak asisten = new Pegawai1841720070yayak("4567","Patrick Star");
      KeretaApi1841720070yayak keretaApi = new KeretaApi1841720070yayak("Gaya Baru","Bisnis",masinis, asisten);
      
        System.out.println(keretaApi.info());
        
    }
}
