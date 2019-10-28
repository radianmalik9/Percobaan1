/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WINDOWS 10
 */
public class PermanentEmployee extends Employee implements Payable{
    private int salary;

    public PermanentEmployee(String name,int salary) {
        this.salary = salary;
        this.name=name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int getPaymentAmount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getEmployeeInfo() {
        return super.getEmployeeInfo(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
