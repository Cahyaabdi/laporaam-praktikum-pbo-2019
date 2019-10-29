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
public class T4ktp1841720070yayak {
    public String noktp;
    public String nama;
    public int jumlah;
    public int limit;
    
T4ktp1841720070yayak(String nama, String noktp,int limit){
 this.nama = nama;
 this.noktp = noktp;
 this.limit = limit;
 
}
    public String getNamayayak(){
        return  nama;
    }
    
    public int getlimitPinjamyayak(){
        return limit;
    }
    
    
    public void pinjamyayak(int pinjam){
        if(pinjam < limit){
            jumlah = pinjam;
        }else
        {
            System.out.println("Maaf pinjaman melebihi limit");
        }
    }
    public int getjumlahPinjamanyayak(){
        return jumlah;
    }
    public void angsuryayak(int angsur){
        if(angsur<jumlah*0.1){
            jumlah -=angsur;
    }else{
            System.out.println("maaf angsuran harus 10% dari jumlah pinjaman");
        }
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
public class T4ktp1841720070yayak {
    public String noktp;
    public String nama;
    public int jumlah;
    public int limit;
    
T4ktp1841720070yayak(String nama, String noktp,int limit){
 this.nama = nama;
 this.noktp = noktp;
 this.limit = limit;
 
}
    public String getNamayayak(){
        return  nama;
    }
    
    public int getlimitPinjamyayak(){
        return limit;
    }
    
    
    public void pinjamyayak(int pinjam){
        if(pinjam < limit){
            jumlah = pinjam;
        }else
        {
            System.out.println("Maaf pinjaman melebihi limit");
        }
    }
    public int getjumlahPinjamanyayak(){
        return jumlah;
    }
    public void angsuryayak(int angsur){
        if(angsur<jumlah*0.1){
            jumlah -=angsur;
    }else{
            System.out.println("maaf angsuran harus 10% dari jumlah pinjaman");
        }
    }
}

>>>>>>> 039777f585ae00e1a830a9a1fe783a0d451a4ecc
