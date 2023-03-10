/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human {
    // ToDo 1: Make this class a child of Person
    // ToDo 1: Make this class a child of Human

    /**
     * Constructor
     * 
     * @param name
     * @param age 
     */
    public Student(String name, short age) {
        super(name, age);
    }
    
    // ToDo 2: Fix the resulting errors
    private String address;
    
    @Override
    public void setAddress(String address) {
       this.address = address;
    }
    
    @Override
    public String getAddress() {
        
        return address;
        
    }

    // ToDo 3: Add a field for GPA and create setter and getter
    protected double GPA;

    /**
     * Method to set the GPA from user input
     * @param GPA 
     */
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    /**
     * Method to return the GPA
     * @return 
     */
    public double getGPA() {
        return GPA;
    }

    // ToDo 4: Add comments to your code

    @Override
    public String toString() {
        return "Student: " + "Name: " + getName() + "\nAge: " +  getAge() + "\naddress: " + 
                address  + "\nGPA" + GPA; 
               
    }
}