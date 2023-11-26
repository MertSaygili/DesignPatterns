package models;

import models.employee.Employee;

public class ProxyEmployeeManager  implements IEmployeeManager{

    @Override
    public void assignTask(Employee attempter, String task) {
        if(attempter.getRole().equals("Manager")){
            EmployeeManager employeeManager = new EmployeeManager();
            employeeManager.assignTask(attempter, task);
        }else{
            System.out.println("You are not authorized to assign task");
            throw new RuntimeException("You are not authorized to assign task");
        }
    }
}
