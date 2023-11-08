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

    int getMonthlySalary() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    int getCommission() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    int getBonus() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}

abstract class EmployeeType {
    abstract int payAmount(Employee emp);
}
class Salesman {
    int payAmount(Employee emp) {
        return emp.getMonthlySalary() + emp.getCommission();
    }
}

class Manager {
    int payAmount(Employee emp) {
        return emp.getMonthlySalary() + emp.getBonus();
    }
}

