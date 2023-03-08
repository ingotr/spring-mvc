package com.example.spring.mvc;

import java.util.HashMap;
import java.util.Map;

public class Employee {
    private String name;
    private String surname;
    private int salary;
    private String department;
    private Map<String, String> departments;
    private String carBrend;
    private Map<String, String> carBrends;
    private String[] languages;
    private Map<String, String> languagesList;

    public Employee() {
        departments = new HashMap<>();
        departments.put("IT", "Information Technology");
        departments.put("HR", "Human Resources");
        departments.put("Sales", "Sales");

        carBrends = new HashMap<>();
        carBrends.put("Audi", "Audi");
        carBrends.put("BMW", "BMW");
        carBrends.put("Mercedes-Benz", "MB");

        languagesList = new HashMap<>();
        languagesList.put("English", "EN");
        languagesList.put("French", "FR");
        languagesList.put("Deutch", "DE");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getCarBrend() {
        return carBrend;
    }

    public void setCarBrend(String carBrend) {
        this.carBrend = carBrend;
    }

    public Map<String, String> getCarBrends() {
        return carBrends;
    }

    public void setCarBrends(Map<String, String> carBrends) {
        this.carBrends = carBrends;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getLanguagesList() {
        return languagesList;
    }

    public void setLanguagesList(Map<String, String> languagesList) {
        this.languagesList = languagesList;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
