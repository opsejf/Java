package com.qa;
// Ex12-1 Task2-1
public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private double salary;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public Person(String name, int age, double salary) {
        super();
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", salary=" + salary
                + "]";
    }

    @Override
    public int compareTo(Person p) {
        return name.compareTo(p.getName());
    }


}
