/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacelatihan;

/**
 *
 * @author can
 */
public class Program {
    
    
    
    public static void main(String[] args){
        Rektor1841720070yayak pakRektor = new Rektor1841720070yayak();
        
        Mahasiswa1841720070yayak MahasiswaBiasa = new Mahasiswa1841720070yayak("Charlie");
        Sarjana1841720070yayak sarjanaCumlaude = new Sarjana1841720070yayak("Dini");
        PascaSarjana1841720070yayak masterCumlaude = new PascaSarjana1841720070yayak("Elok");
        
        MahasiswaBiasa.kuliahDiKampusyayak();
        pakRektor.berSertifikatCumlaude(masterCumlaude);
        sarjanaCumlaude.kuliahDiKampusyayak();
        pakRektor.berSertifikatCumlaude(masterCumlaude);
        masterCumlaude.kuliahDiKampusyayak();
        pakRektor.berSertifikatCumlaude(sarjanaCumlaude);
    }
}
