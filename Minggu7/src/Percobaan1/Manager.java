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
public class Manager extends Karyawan{
    private double tunjangan;
    private String bagian;
    private Staff st[];

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public void setBagian(String bagian) {
        this.bagian = bagian;
    }

    public String getBagian() {
        return bagian;
    }

    public void setSt(Staff[] st) {
        this.st = st;
    }
    
    public void viewStaff(){
        int i;
        System.out.println("--------------");
        for(i=0;i<st.length;i++){
         st[i].lihatinfo();
        }
        System.out.println("--------------");
    }
    public void lihatinfo(){
        System.out.println("Manager  :"+this.getBagian());
        System.out.println("NIP  :"+this.getNip());
        System.out.println("Nama  :"+this.getNama());
        System.out.println("Golongan  :"+this.getGolongan());
        System.out.println("Tunjangan :%.0f\n  :"+this.getTunjangan());
        System.out.println("Gaji :%.0f\n  :"+this.getGaji());
        System.out.println("Bagian  :"+this.getBagian());
        this.viewStaff();
    }

    @Override
    public double getGaji() {
        return super.getGaji()+tunjangan; //To change body of generated methods, choose Tools | Templates.
    }
    
}
