/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;
import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

 public static void main(String[] args) {
		// ToDo 5: Fix the error

		// ToDo 6: Fix the constructor of Student class

                // Todo 7: Create two classes for Freshman and Senior 

                // ToDo 8: The senior class should have a minimum of 85 credits  

		// ToDo 7: Add a toString method for Student class
		
                // ToDo 8: Set the gpa of the student using the scanner and use
                
                // ToDo 9: Add a toString method for Freshman class 
                // ToDo 10: Add a toString method for Senior class
		
                // ToDo 11: Set the gpa of the student using the scanner and user
		// 			input and then print the output.
                short studentAge = 20;
                Scanner inScanner = new Scanner(System.in);
                double studentGPA = inScanner.nextDouble();
                
                
                Student std1 = new Student("James", studentAge);
                std1.setAddress("2 Dawn Lane");
                std1.setGPA(studentGPA);
                
                
                double freshmanGPA = inScanner.nextDouble();
               
		Freshman std2 = new Freshman("James", studentAge, 12); // name, age, credits
                std2.setAddress("34 Yard Ave");
                std2.setGPA(freshmanGPA);

                double seniorGPA = inScanner.nextDouble();
             
                Short seniorAge = 30;
                Senior std3 = new Senior("John", seniorAge, 70);
                std3.setAddress("10 Forest Dr");
                std3.setGPA(seniorGPA);

		System.out.println(" " + std1);

                System.out.println(" " + std2);

                System.out.println(" " + std3);
                
                

		// ToDo 9: add comments and explain your code
		// ToDo 12: add comments and explain your code

		// ToDo 10: submit using a pull request.
		// ToDo 13: submit using a pull request.
	}

}

