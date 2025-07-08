package com.practice.dsa.Streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee1 {
    String name;
    String dept;
    double salary;

    Employee1(String name, String dept, double salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public String getDept() { return dept; }
    public double getSalary() { return salary; }

   static List<Employee1> employees = List.of(
            new Employee1("Alice", "HR", 50000),
            new Employee1("Bob", "IT", 60000),
            new Employee1("Charlie", "HR", 55000),
            new Employee1("David", "IT", 65000)
    );

    @Override
    public  String toString(){
        return "Employee{name= '"+name+"',dept= '"+dept+"',salary= '"+ salary+"'}";
    }

    public static void main(String[] args) {
        Map<String, Double> empAvgSalary = employees.stream().collect(Collectors.groupingBy(Employee1::getDept,Collectors.averagingDouble(Employee1::getSalary)));
        System.out.println("Employees average salary"+" "+empAvgSalary);
        //Employees average salary {HR=52500.0, IT=62500.0}
    }
}

