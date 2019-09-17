/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author can
 */
public class T4Testktp1841720070yayak {
  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        T4ktp1841720070yayak cahyo = new T4ktp1841720070yayak("0856789", "cahyo", 5000000);
        System.out.println("Nama Anggota: " + cahyo.getNamayayak());
        System.out.println("Limit Pinjaman: " + cahyo.getlimitPinjamyayak());
        
        System.out.println("50000000...: " );
        System.out.print("Meminjam : ");
        int pinjam1 = sc.nextInt();
        cahyo.pinjamyayak(pinjam1);
        System.out.println("Jumlah pinjaman saat ini: " + cahyo.getjumlahPinjamanyayak());
        System.out.print("Angsur : ");
        int angsur = sc.nextInt();
        cahyo.angsuryayak(angsur);
        System.out.println("Jumlah pinjaman saat ini: " + cahyo.getjumlahPinjamanyayak());
        System.out.print("Angsur : ");
        int angsur1 = sc.nextInt();
        cahyo.angsuryayak(angsur1);
        System.out.println("Jumlah pinjaman saat ini: " + cahyo.getjumlahPinjamanyayak());
    }
}  

