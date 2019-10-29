/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS;

/**
 *
 * @author can
 */
public class T11841720070yayak {
    private int sudut;
    
    public int totalSudut(int sudutA){
        return sudut = 180 - sudutA;
    }
    public int totalsudut(int sudutA,int sudutB){
        return sudut = 180 - (sudutA + sudutB);
    }
    public int keliling(int sisiA,int sisiB,int sisiC){
        int keliling;
        return keliling = sisiA + sisiB + sisiC;
    }
    
    public void info1841720070yayak(){
        System.out.println("total sudut "+this.totalSudut(sudut));
        System.out.println("total sudut "+this.totalsudut(sudut, sudut));
        System.out.println("keliling "+this.keliling(sudut, sudut, sudut));
    }
}
