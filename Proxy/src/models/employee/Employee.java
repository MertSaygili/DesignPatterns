package models.employee;

public class Employee {
    private final String name;
    private String role;
    private String task;

    public Employee(String name, String role, String task) {
        this.name = name;
        this.role = role;
        this.task = task;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        if (this.task == null) {
            this.task = task;
        } else {
            System.out.println("This employee already has a task.");
        }
    }

    public void completeTask() {
        if (this.task != null) {
            System.out.println("Employee " + this.name + " has completed the task: " + this.task);
            this.task = null;
        } else {
            System.out.println("This employee has no task to complete.");
        }
    }

    public void setRole(String role) {
        this.role = role;
    }
}
