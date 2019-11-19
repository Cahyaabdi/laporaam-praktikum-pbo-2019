/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package API;

/**
 *
 * @author can
 */

    import  java.util.ArrayList; 
public class InputData1841720070yayak {
    ArrayList<Mahasiswa1841720070yayak> ListMahasiswa;
    public InputData1841720070yayak(){
        ListMahasiswa=new ArrayList();
    }
    public void isiData(String Nim,String Nama, String Alamat){
        Mahasiswa1841720070yayak mhs = new Mahasiswa1841720070yayak (Nim, Nama, Alamat);
        ListMahasiswa.add(mhs);
    }
    public ArrayList<Mahasiswa1841720070yayak> getData(){
        return ListMahasiswa;
    }
}

