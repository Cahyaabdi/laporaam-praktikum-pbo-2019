package P3;


import P3.IBerprestasi1841720070yayak;
import interfacelatihan.ICumlaude;
import interfacelatihan.Mahasiswa1841720070yayak;



/**
 *
 * @author ROG SERIES
 */
public class PascaSarjana1841720070yayak extends Mahasiswa1841720070yayak implements ICumlaude,IBerprestasi1841720070yayak{

    public PascaSarjana1841720070yayak(String nama) {
        super(nama);
    }


    
    
    @Override
    public void menjuaraiKompetisiyayak() {
        System.out.println("Saya telah menjuarai kompetisi INTERNASIONAL");
    }

    @Override
    public void membuatPublikasiIlmiahyayak() {
        System.out.println("Saya telah menerbitkan artikel di jurnal INTERNASIONAL");
    }    

    @Override
    public void lulusyayak() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void meraihIPKTinggiyayak() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
