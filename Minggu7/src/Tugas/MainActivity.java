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
public class MainActivity {
    public static void main(String[] args) {
       
        Segitiga sg= new Segitiga();
        sg.totalSudut(120);
        sg.totalSudut(45, 30);
        sg.keliling(2, 3, 4);
        sg.keliling(4, 6);
        System.out.println("Total sudut :"+sg.totalSudut(120));
        System.out.println("Total sudut :"+sg.totalSudut(45, 30));
        System.out.println("keliling :"+sg.keliling(3, 4, 5));
        System.out.println("c :"+sg.keliling(4, 5));
        System.out.println("Hello")
    }   
    
}

