package models;

import models.employee.Employee;

public interface IEmployeeManager {
    void assignTask(Employee attempter, String task);
}
