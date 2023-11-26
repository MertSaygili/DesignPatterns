package models;

import models.employee.Employee;

public class EmployeeManager implements IEmployeeManager{
    @Override
    public void assignTask(Employee attempter, String task) {
        System.out.println(attempter.getName() + " is assigned to " + task);
    }
}
