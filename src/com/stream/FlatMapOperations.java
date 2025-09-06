package com.stream;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapOperations {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(101, "John Doe", 28, "Mumbai", "IT", 60000),
                new Employee(102, "Priya Sharma", 32, "Pune", "HR", 55000),
                new Employee(103, "Amit Patel", 26, "Delhi", "Finance", 50000),
                new Employee(104, "Sara Khan", 29, "Mumbai", "IT", 90000),
                new Employee(105, "Ravi Singh", 35, "Bangalore", "Marketing", 70000),
                new Employee(106, "Anjali Gupta", 30, "Pune", "Finance", 58000),
                new Employee(107, "Vikram Mehta", 27, "Delhi", "IT", 62000),
                new Employee(108, "Neha Verma", 31, "Kolkata", "HR", 57000)
        );

         /*List all unique cities from all employees
            (Each employee has one city, but we can generalize this for multiple cities per employee.)*/

        List<String> uniqueCities = employees.stream().flatMap(emp -> Stream.of(emp.getCity())).distinct().collect(Collectors.toList());
        System.out.println(uniqueCities);
    /*Get all characters from all employee names
            (Split each name into characters, flatten into one stream.)*/

    /*Split employee names into individual words and list them
            (Useful if some names have first + last names.)*/

    /*List all departments in uppercase letters with no duplicates
            (Not just map, but flatten if department data is stored in multiple lists.)*/

    /*Find all distinct letters used in employee names
            (Requires splitting each name into characters.)*/

    /*Combine multiple employee lists into one
            (Example: Two List<Employee> from different branches → merge into one list.)*/

   /* Extract all salary digits used across all employees
            (Split salaries into digits and flatten them.)*/
    }



}
