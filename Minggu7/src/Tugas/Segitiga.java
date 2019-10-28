/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author WINDOWS 10
 */
public class Segitiga {
   private int sudut;
    
    public int totalSudut(int sudutA){
        int sudut= 90 - sudutA;
        return sudut;
    }
    public int totalSudut(int sudutA, int sudutB){
        int sudut= 90 - (sudutA+sudutB);
        return sudut;
    }
    public int keliling(int sisiA, int sisiB, int sisiC){
        int keliling = sisiA+sisiB+sisiC;
        return keliling;
    }
    public double keliling(int sisiA, int sisiB){
        double keliling= Math.sqrt(Math.pow(sisiA, 2)+ Math.pow(sisiB, 2));
    return keliling;
                }
} 

