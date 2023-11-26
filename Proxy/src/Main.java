//* https://medium.com/kodcular/proxy-design-pattern-nedir-a842de9605b6
//* Proxy Design Pattern
//* Proxy uses the same interface as the real object, so it can be passed to any client that expects a real object.
//* Proxy controls access to the real object, so it can be used to implement security, remote access, etc.

import models.ProxyEmployeeManager;
import models.employee.Employee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John", "Manager", "123456");
        Employee employee2 = new Employee("Jack", "Employee", "123453");

        ProxyEmployeeManager proxyEmployeeManager = new ProxyEmployeeManager();
        proxyEmployeeManager.assignTask(employee, "Task 1");
        proxyEmployeeManager.assignTask(employee2, "Task 2");


    }
}