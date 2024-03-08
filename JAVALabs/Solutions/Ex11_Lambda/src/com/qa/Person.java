package com.qa;
// Ex1 Task1-2
public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private double salary;
    private boolean dueForRetirement;

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
    public boolean isDueForRetirement() {
        return dueForRetirement;
    }
    public void setDueForRetirement(boolean dueForRetirement) {
        this.dueForRetirement = dueForRetirement;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public Person(String name, int age, double salary, boolean dueForRetirement) {
        super();
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.dueForRetirement = dueForRetirement;
    }

    @Override
    public String toString() {
        return "Person [name = " + name + ", age = " + age + ", salary = " + salary
                + ", dueToRetire = " + dueForRetirement + "]";
    }

    @Override
    public int compareTo(Person p) {
        return name.compareTo(p.getName());
    }



}
