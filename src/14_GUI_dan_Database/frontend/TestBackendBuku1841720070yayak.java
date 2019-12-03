
package frontend;

import backend.*;

public class TestBackendBuku1841720070yayak {
    public static void main(String[] args){
        Kategori1841720070yayak novel = new Kategori1841720070yayak().getById(27);
        Kategori1841720070yayak referensi = new Kategori1841720070yayak().getById(28);
        
        Buku1841720070yayak buku1 = new Buku1841720070yayak(novel, "Timun Mas", "Elex Media", "Bang Supit");
        Buku1841720070yayak buku2 = new Buku1841720070yayak(referensi, "Metode Linier", "Springer", "Alex Baldwin");
        Buku1841720070yayak buku3 = new Buku1841720070yayak(novel, "Bintang Terang", "Erlangga", "Mat Sewoot");
        
        buku1.save();
        buku2.save();
       
        buku2.setJudul("Aljabar Linier");
        buku2.save();
      
        buku3.delete();
        
        for(Buku1841720070yayak b : new Buku1841720070yayak().getAll()){
            System.out.println("Kategori: " + b.getKategori().getNama() + ", Judul: " + b.getJudul());
        }
        // test search
        for(Buku1841720070yayak b : new Buku1841720070yayak().search("timun")){
            System.out.println("Kategori: " + b.getKategori().getNama() + ", Judul: " + b.getJudul());
        }
    }
}
