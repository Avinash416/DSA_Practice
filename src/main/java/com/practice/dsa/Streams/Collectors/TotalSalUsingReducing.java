package com.practice.dsa.Streams.Collectors;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Employee2 {
        String name;
        double salary;

        Employee2(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        public double getSalary() { return salary; }

    static List<Employee2> employees = List.of(
            new Employee2("Alice", 50000),
            new Employee2("Bob", 60000),
            new Employee2("Charlie", 55000)
    );

    public static void main(String[] args) {
        Double totalSal=employees.stream().collect(Collectors.reducing(0.0, Employee2::getSalary, Double::sum));
        System.out.println("Total Salary:"+" "+totalSal);
        //Total Salary: 165000.0
    }

}


