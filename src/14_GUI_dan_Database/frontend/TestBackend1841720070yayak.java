
package frontend;


import backend.*;

public class TestBackend1841720070yayak {
    public static void main(String[] args){
        Kategori1841720070yayak kat1 = new Kategori1841720070yayak("Novel", "Koleksi buku novel");
        Kategori1841720070yayak kat2 = new Kategori1841720070yayak("Referensi", "Buku referensi ilmiah");
        Kategori1841720070yayak kat3 = new Kategori1841720070yayak("Komik", "Komik anak-anak");
        
        kat1.save();
        kat2.save();
        kat3.save();

        kat2.setKeterangan("Koleksi buku referensi ilmiah");
        kat2.save();

        kat3.delete();

        for(Kategori1841720070yayak k : new Kategori1841720070yayak().getAll()){
            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
        }

        for(Kategori1841720070yayak k : new Kategori1841720070yayak().search("ilmiah")){
            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
        }
    }
}
