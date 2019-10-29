/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author can
 */

    public class Pelanggan1841720070yayak {
   private String nama;
    private Model1841720070yayak Model;
    private JenisKursi1841720070yayak jeniskursi;
    private Totalan1841720070yayak total;
    private int harga;
    private int pilihan;

    public String getNama() {
        return nama;
    }

    public int getPilihan() {
        return pilihan;
    }

    public void setPilihan(int pilihan) {
        this.pilihan = pilihan;
    }

    

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Model1841720070yayak getModel() {
        return Model;
    }

    public void setModel(Model1841720070yayak Model) {
        this.Model = Model;
    }

    public JenisKursi1841720070yayak getJeniskursi() {
        return jeniskursi;
    }

    public void setJeniskursi(JenisKursi1841720070yayak jeniskursi) {
        this.jeniskursi = jeniskursi;
    }

    public Totalan1841720070yayak getTotal() {
        return total;
    }

    public void setTotal(Totalan1841720070yayak total) {
        this.total = total;
    }

    public Pelanggan1841720070yayak(String nama, Model1841720070yayak Model, JenisKursi1841720070yayak jeniskursi, Totalan1841720070yayak total ) {
        this.nama = nama;
        this.Model = Model;
        this.jeniskursi = jeniskursi;
        this.total = total;
        this.harga = harga;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
            }
        }
   
    
