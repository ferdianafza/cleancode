/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cleancode;

/**
 *
 * @author HP
 */
public class Employee {
    int _monthlySalary;
    int _commission;
    int _bonus;
    
    int payAmount() throws Exception {
        switch (getType()) {
            case EmployeeType.ENGINEER -> {
                return _monthlySalary;
            }

            case EmployeeType.SALESMAN -> {   
                return _monthlySalary + _commission;
            }

            case EmployeeType.MANAGER -> {
                
                return _monthlySalary + _bonus;
            }

            default -> throw new Exception("Incorrect Employee");
        }
    }

    private int getType() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
