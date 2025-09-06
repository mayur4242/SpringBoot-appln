package com.stream;

public class Employee {

    Integer id;
    String name;
    Integer age;
    String city;
    String department;
    Integer salary;

    public Employee(Integer id, String name, Integer age, String city, String department, Integer salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.city = city;
        this.department = department;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
