/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author WINDOWS 10
 */
public class MainManusia {
    public static void main(String[] args) {
        Manusia m = new Manusia();
        Dosen d = new Dosen();
        Mahasiswa mh = new Mahasiswa();
        
        System.out.println("-------------Manusia----------------");
        System.out.println("------------------------------------");
        m.bernafas();
        m.Makan();
        System.out.println("------------Dosen-------------------");
        System.out.println("------------------------------------");
        d.Makan();
        d.Lembur();
        System.out.println("--------------Mahasiswa-------------");
        System.out.println("------------------------------------");
        mh.Makan();
        mh.Tidur();
    }
}
