/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author can
 */

    public class Staff1841720070yayak extends Karyawan1841720070yayak{
        private int lembur;
        private double gajiLembur;
    
        public void setLembur1841720070yayak(int lembur) {
            this.lembur = lembur;
        }
        public int getLembur1841720070yayak() {
            return lembur;
        }        
        public double getGajiLembur1841720070yayak() {
            return gajiLembur;
        }

        public void setGajiLembur1841720070yayak(double gajiLembur) {
            this.gajiLembur = gajiLembur;
        
        }
   public double getGaji1841720070yayak(int lembur,double gajiLembur){      
     return super.getGaji1841720070yayak()+lembur*gajiLembur;
     }
   public double getGaji1841720070yayak(){
       return super.getGaji1841720070yayak()+lembur*gajiLembur;
   }
   public void lihatInfo(){
       System.out.println("NIP  :"+this.getNip1841720070yayak());
       System.out.println("Nama :"+this.getNama1841720070yayak());
       System.out.println("Golongan"+this.getGolongan1841720070yayak());
       System.out.printf("Jml Lembur:%.0f\n",this.getGajiLembur1841720070yayak());
       System.out.printf("Gaji      :%.0f\n",this.getGaji1841720070yayak());
   
        }
    }

  

