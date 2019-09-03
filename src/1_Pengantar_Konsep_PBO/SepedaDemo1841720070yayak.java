/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author can
 */
public class SepedaDemo1841720070yayak {
    public static void main(String[] args){
        
        sepeda1841720070yayak spd1 = new sepeda1841720070yayak();
        sepeda1841720070yayak spd2 = new sepeda1841720070yayak();
        Sepedagunung1841720070yayak spd3 = new Sepedagunung1841720070yayak();
        
        spd1.setMerekyayak("polygone");
        spd1.tambahKecepatanyayak(10);
        spd1.gantiGearyayak(2);
        spd1.warnayayak("merah");
        spd1.cetakStatusyayak();
        
        spd2.setMerekyayak("wim Cycle");
        spd2.tambahKecepatanyayak(10);
        spd2.gantiGearyayak(2);
        spd2.tambahKecepatanyayak(3);
        spd2.gantiGearyayak(3);
        spd2.warnayayak("Kuning");
        spd2.cetakStatusyayak();
        
        spd3.setMerekyayak("Klinee");
        spd3.tambahKecepatanyayak(5);
        spd3.gantiGearyayak(7);
        spd3.warnayayak("hijau");
        spd3.setTipeSuspensiyayak("Gas suspensi");
        spd3.cetakStatusyayak();
        
                
    }
}
