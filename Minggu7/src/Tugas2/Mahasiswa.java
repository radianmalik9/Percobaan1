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
public class Mahasiswa extends Manusia{
    public void Makan(){
        super.Makan();
        System.out.println("Mahasiswa adalah manusia makan nasi dan laukpauk");
    }
     
    public void Tidur(){
        System.out.println("Mahasiswa juga manusia dan juga butuh tidur yang cukup");
    }
}
