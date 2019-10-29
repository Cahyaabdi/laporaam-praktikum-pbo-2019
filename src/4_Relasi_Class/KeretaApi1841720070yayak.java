<<<<<<< HEAD
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
public class KeretaApi1841720070yayak {
    private String nama;
    private String kelas;
    private Pegawai1841720070yayak masinis;
    private Pegawai1841720070yayak asisten;



    public KeretaApi1841720070yayak(String nama, String kelas, Pegawai1841720070yayak masinis, Pegawai1841720070yayak asisten) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = asisten;
    }

    public String getNamayayak() {
        return nama;
    }

    public void setNamayayak(String nama) {
        this.nama = nama;
    }

    public String getKelasyayak() {
        return kelas;
    }

    public void setKelasyayak(String kelas) {
        this.kelas = kelas;
    }

    public Pegawai1841720070yayak getMasinisyayak() {
        return masinis;
    }

    public void setMasinisyayak(Pegawai1841720070yayak masinis) {
        this.masinis = masinis;
    }

    public Pegawai1841720070yayak getAsistenyayak() {
        return asisten;
    }

    public void setAsistenyayak(Pegawai1841720070yayak asisten) {
        this.asisten = asisten;
    }
    
    public String info(){
        String info ="";
        info +="nama:"+this.nama+"\n";
        info +="Kelas:"+this.kelas+"\n";
        info +="Masinis"+this.masinis.info()+"\n";
        info +="Asisten"+this.asisten.info()+"\n";
        return info;
        }
    }

    

    
=======
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
public class KeretaApi1841720070yayak {
    private String nama;
    private String kelas;
    private Pegawai1841720070yayak masinis;
    private Pegawai1841720070yayak asisten;



    public KeretaApi1841720070yayak(String nama, String kelas, Pegawai1841720070yayak masinis, Pegawai1841720070yayak asisten) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = asisten;
    }

    public String getNamayayak() {
        return nama;
    }

    public void setNamayayak(String nama) {
        this.nama = nama;
    }

    public String getKelasyayak() {
        return kelas;
    }

    public void setKelasyayak(String kelas) {
        this.kelas = kelas;
    }

    public Pegawai1841720070yayak getMasinisyayak() {
        return masinis;
    }

    public void setMasinisyayak(Pegawai1841720070yayak masinis) {
        this.masinis = masinis;
    }

    public Pegawai1841720070yayak getAsistenyayak() {
        return asisten;
    }

    public void setAsistenyayak(Pegawai1841720070yayak asisten) {
        this.asisten = asisten;
    }
    
    public String info(){
        String info ="";
        info +="nama:"+this.nama+"\n";
        info +="Kelas:"+this.kelas+"\n";
        info +="Masinis"+this.masinis.info()+"\n";
        info +="Asisten"+this.asisten.info()+"\n";
        return info;
        }
    }

    

    
>>>>>>> 039777f585ae00e1a830a9a1fe783a0d451a4ecc
