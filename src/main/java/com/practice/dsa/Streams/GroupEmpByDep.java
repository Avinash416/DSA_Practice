package com.practice.dsa.Streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    String name;
    String dept;

    Employee(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }

    public String getName() { return name; }
    public String getDept() { return dept; }

    static List<Employee> employees = List.of(
            new Employee("Alice", "HR"),
            new Employee("Bob", "IT"),
            new Employee("Charlie", "HR"),
            new Employee("David", "IT")
    );

    @Override
    public String toString(){
        return "Employee{name='"+ name +"', dept='"+ dept +"'}";
    }

    public static void main(String[] args) {
//        System.out.println("List"+" "+ employees);
        Map<String,List<Employee>> empMap= employees.stream().collect(Collectors.groupingBy(Employee::getDept));
        System.out.println("Grouped emp"+" "+empMap);

        empMap.forEach((dept, emp)->
                        System.out.println(dept+ " :" + emp.stream().map(Employee::getName).collect(Collectors.joining(", ")))
        );

//        o/p:
//        Grouped emp {HR=[Employee{name='Alice', dept='HR'}, Employee{name='Charlie', dept='HR'}], IT=[Employee{name='Bob', dept='IT'}, Employee{name='David', dept='IT'}]}
//        HR :Alice, Charlie
//        IT :Bob, David

    }

}
