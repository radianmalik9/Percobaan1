/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WINDOWS 10
 */
public class InternshipEmployee extends Employee{
    private int length;
    
    public InternshipEmployee(String name, int length){
        this.length=length;
        this.name=name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String getEmployeeInfo() {
        return super.getEmployeeInfo(); //To change body of generated methods, choose Tools | Templates.
    }
   
    

}

