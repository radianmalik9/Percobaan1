/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO07;

/**
 *
 * @author WINDOWS 10
 */
public class KelasB extends KelasA{
    public int nilaiB;
    
    public void setNilaiB(int nilaiB){
        this.nilaiB = nilaiB;
    }
    public void setNilaiB(){
        System.out.print("Sedang menggunakan method overloading");
    }

    public int getNilaiB() {
        return nilaiB;
    }

    public int getNilaiA() {
        return nilaiA;
    }
    
}
