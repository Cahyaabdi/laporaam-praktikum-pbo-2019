<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan2;

/**
 *
 * @author can
 */
public class Pelanggan1841720070yayak {
   private String nama;
    private Mobil1841720070yayak mobil;
    private Sopir1841720070yayak Sopir;
    private int hari;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Mobil1841720070yayak getMobil() {
        return mobil;
    }

    public void setMobil(Mobil1841720070yayak mobil) {
        this.mobil = mobil;
    }

    public Sopir1841720070yayak getSopir() {
        return Sopir;
    }

    public void setSopir(Sopir1841720070yayak Sopir) {
        this.Sopir = Sopir;
    }

    public int getHari() {
        return hari;
    }

    public void setHari(int hari) {
        this.hari = hari;
    }
    public int hitungBiayaTotal(){
        return mobil.hitungBiayaMobilyayak(hari)+Sopir.hitungBiayaSopiryayak(hari);
    }
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan2;

/**
 *
 * @author can
 */
public class Pelanggan1841720070yayak {
   private String nama;
    private Mobil1841720070yayak mobil;
    private Sopir1841720070yayak Sopir;
    private int hari;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Mobil1841720070yayak getMobil() {
        return mobil;
    }

    public void setMobil(Mobil1841720070yayak mobil) {
        this.mobil = mobil;
    }

    public Sopir1841720070yayak getSopir() {
        return Sopir;
    }

    public void setSopir(Sopir1841720070yayak Sopir) {
        this.Sopir = Sopir;
    }

    public int getHari() {
        return hari;
    }

    public void setHari(int hari) {
        this.hari = hari;
    }
    public int hitungBiayaTotal(){
        return mobil.hitungBiayaMobilyayak(hari)+Sopir.hitungBiayaSopiryayak(hari);
    }
}
>>>>>>> 039777f585ae00e1a830a9a1fe783a0d451a4ecc
