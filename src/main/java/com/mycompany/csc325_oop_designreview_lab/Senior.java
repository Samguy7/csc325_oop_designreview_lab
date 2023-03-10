/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author sam
 */
public class Senior extends Student {
    
     private int credits;

     /**
      * Constructor
      * @param name
      * @param age
      * @param credits 
      */
    public Senior(String name, short age, int credits) {
        super(name, age);
        this.credits = credits;
    }

    /**
     * Method to set the credits for the Senior class
     *
     * @param credits
     */
    public void setCredits(int credits) {
        if (credits < 85) {
            System.out.println("The minimum amount of credits for seniors is 85.");
        } else {
            this.credits = credits;
        }
    }
        /**
         * Method to return the credits
         *
         * @return
         */
    public int getCredits() {
        return credits;
    }

    /**
     * Method to return information about a senior student.
     * @return 
     */
     @Override
    public String toString() {
        return "Senior Student " + "Name: " + getName() + "\nAge: " +  getAge() + "\nAddress: " + 
                getAddress()  + "\nGPA: " + GPA + "\nCredits: " + getCredits(); 
}
}
