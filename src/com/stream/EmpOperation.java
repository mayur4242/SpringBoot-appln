package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class EmpOperation {

    public static void main(String[] args) {

        List<Employee> empList = Arrays.asList(
                new Employee(101, "John Doe", 28, "Mumbai", "IT", 60000),
                new Employee(102, "Priya Sharma", 32, "Pune", "HR", 55000),
                new Employee(103, "Amit Patel", 26, "Delhi", "Finance", 50000),
                new Employee(104, "Sara Khan", 29, "Mumbai", "IT", 90000),
                new Employee(105, "Ravi Singh", 35, "Bangalore", "Marketing", 70000),
                new Employee(106, "Anjali Gupta", 30, "Pune", "Finance", 58000)
        );

       // Get all employee names
        //Return a list of just the names.
     /* List<String>empNames = empList.stream().map(Employee::getName).collect(Collectors.toList());
      System.out.println(empNames);*/

             //   Count total employees
        //Count how many employees are in the list.
       /*Long countEmp = empList.stream().count();
       System.out.println(countEmp);*/


        //Find employee with highest salary
        //Get the Employee who has the maximum salary.
        /*Integer maxSal =  empList.stream().map(sal ->sal.getSalary()).max((s1,s2)-> s1.compareTo(s2)).orElse(null);
        System.out.println(maxSal);*/

        //Find employee with lowest salary
        //Get the Employee with the minimum salary.
       /* Integer minSalary = empList.stream().map(sal ->sal.getSalary()).min((s1,s2)-> s1.compareTo(s2)).orElse(null);
        System.out.println(minSalary);*/

        /*Employees in a specific city
        Get all employees from "Mumbai".*/
      /* List<String> empCity = empList.stream().filter(emp -> "Mumbai".equals(emp.getCity())).map(emp -> emp.getName()).collect(Collectors.toList());
       System.out.println(empCity);*/

               /* Employees earning more than 60,000
        Return names of employees whose salary is above 60,000.*/
       List<String>  salMore60K = empList.stream().filter(sal -> sal.salary >60000).map(Employee::getName).collect(Collectors.toList());
        System.out.println(salMore60K);

       /* Average salary of all employees
        Calculate the average salary.*/
          /* Double avgSalary = empList.stream().mapToDouble(sal ->sal.getSalary()).average().getAsDouble();
           System.out.println(avgSalary);*/

       /* Group employees by department
        Return a Map<String, List<Employee>> where key = department.*/
    /*    Map<String,List<Employee>> empBydept =  empList.stream().collect(Collectors.groupingBy(emp->emp.getDepartment()));
        System.out.println(empBydept);*/


               /* Group employees by city
        Same as above, but group by city.*/
     /*   Map<String,List<Employee>> empByCity=  empList.stream().collect(Collectors.groupingBy(Employee::getCity));
        System.out.println(empByCity);*/

    }

}
