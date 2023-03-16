package com.bridgelabz.fileio;

public class EmployeePayRollData {
    private int id;
    private String name;
    private double salary;




    public EmployeePayRollData(int id, String name, double salary){
        this.id=id;
        this.name = name;
        this.salary=salary;

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EmployeePayRollData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
