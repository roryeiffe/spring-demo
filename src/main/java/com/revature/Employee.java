package com.revature;

public class Employee {
    private String name;


    public Employee() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }

    public void init() {
        System.out.println("init employee is called");
    }

    public void destroy() {
        System.out.println("destroy employee is called");
    }
}
