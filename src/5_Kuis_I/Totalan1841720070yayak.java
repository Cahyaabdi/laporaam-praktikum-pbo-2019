public class Totalan1841720070yayak{

    private String Nama;
   private int harga;
   private int jumlah;
   private int beli;
   
    
    
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    public String getNama(){
        return Nama;
    }

    public Totalan1841720070yayak(String Nama, int harga, int jumlah) {
        this.Nama = Nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public int getHarga() {
        return harga;
    }


    public int getBeli() {
        return beli;
    }

    public void setBeli(int beli) {
        this.beli = beli;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
   public int hitungBayarKursi(int Jumlah){
        return harga * Jumlah;
   }
   
    public int sethargaKursi(){
        this.harga = 900000;
        return harga;
        
    }
   
     public void info(){
     System.out.println("Nama Pemesan            : " + Nama);
     System.out.println("Jumlah yang anda pilih    : " + jumlah);
    }
}