/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan1;

/**
 *
 * @author WINDOWS 10
 */
public class Staff extends Karyawan{
     private int lembur;
     private double gajiLembur;

    public void setLembur(int lembur) {
        this.lembur = lembur;
    }

    public int getLembur() {
        return lembur;
    }

    public void setGajiLembur(double gajiLembur) {
        this.gajiLembur = gajiLembur;
    }

    public double getGajiLembur() {
        return gajiLembur;
    }
    public double getGaji(int lembur,double gajiLembur) {
        return super.getGaji()+lembur*gajiLembur; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getGaji() {
        return super.getGaji()+lembur*gajiLembur; //To change body of generated methods, choose Tools | Templates.
    }
    public void lihatinfo(){
        System.out.println("NiP  :"+this.getNip());
        System.out.println("Nama  :"+this.getNama());
        System.out.println("Golongan :"+this.getGolongan());
        System.out.println("Jml Lembur  :"+this.getLembur());
        System.out.println("Gaji lembur :%.0f\n  :"+this.getGajiLembur());
        System.out.println("Gaji :%.0f\n  :"+this.getGaji());
    }
     
      
    
}
