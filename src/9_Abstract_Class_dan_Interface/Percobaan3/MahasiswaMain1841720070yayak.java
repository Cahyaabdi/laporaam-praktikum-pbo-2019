/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P3;

/**
 *
 * @author can
 */


public class MahasiswaMain1841720070yayak {
    public static void main(String[] args){
        Rektor1841720070yayak pakRektor = new Rektor1841720070yayak();
        
        Mahasiswa1841720070yayak MahasiswaBiasa = new Mahasiswa1841720070yayak("Charlie");
        Sarjana1841720070yayak sarjanaCumlaude = new Sarjana1841720070yayak("Dini");
        PascaSarjana1841720070yayak masterCumlaude = new PascaSarjana1841720070yayak("Elok");
        
        //MahasiswaBiasa.kuliahDikampusyayak();
        //pakRektor.beriSertifikatCumlaude(masterCumlaude);
        //sarjanaCumlaude.kuliahDikampusyayak();
        //pakRektor.beriSertifikatCumlaude(MahasiswaBiasa);
        //masterCumlaude.kuliahDikampusyayak();
        //pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);
        
        pakRektor.beriSertifikatMawapres(masterCumlaude);
        pakRektor.beriSertifikatMawapres(sarjanaCumlaude);
    }
}


