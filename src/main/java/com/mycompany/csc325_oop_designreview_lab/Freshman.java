/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author sam
 */
public class Freshman extends Student {
    
    private int credits;

    /**
     * Constructor
     * @param name
     * @param age 
     * @param credits 
     */
    public Freshman(String name, short age, int credits) {
        super(name, age);
        this.credits = credits;
    }
    /**
     * Method to return information about a freshman student.
     * @return 
     */
    @Override
    public String toString() {
        return "Freshman Student " + "Name: " + getName() + "\nAge: " +  getAge() + "\nAddress: " + 
                getAddress()  + "\nGPA: " + GPA; 
}
    
}

    