package interfacelatihan;


import interfacelatihan.ICumlaude;
import interfacelatihan.Mahasiswa1841720070yayak;

public class PascaSarjana1841720070yayak extends Mahasiswa1841720070yayak implements ICumlaude {
    
    public PascaSarjana1841720070yayak(String nama){
        super(nama);
    }
    @Override
    public void lulusyayak(){
        System.out.println("Aku sudah menyelesaikan TESIS");
    }
    @Override
    public void meraihIPKTinggiyayak(){
        System.out.println("IPK-ku lebih dari 3,71");
    }   
}
