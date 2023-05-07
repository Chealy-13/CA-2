/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.chris.ca2;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class CA2 {

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to the Appointment centre");
        displayMenu();
    }
    public static void displayMenu() throws Exception {

        System.out.println("press 1 to Add a new Patient to the pracice");
        System.out.println("press 2 to Delete a patient from the practice");
        System.out.println("press 3 to display all patients");
        System.out.println("press 4 to create a new appointment");
        //call the next patient in
        System.out.println("press 5 to exit the Menu");
        getMenuChoice();
    }
    
    public static void getMenuChoice() throws Exception {
        Scanner keyboard = new Scanner(System.in);
        int choice = keyboard.nextInt();
        while (choice < 1 || choice > 5) {
            System.out.println("please enter valid option");
            choice = keyboard.nextInt();
        }
        if (choice == 1) {
            
            displayMenu();
            
            
            
        } else if (choice == 2) {
            
            displayMenu();
            
        } else if (choice == 3) {
            
            displayMenu();
            
        } else if (choice == 4) {
            
            displayMenu();
            
        }
        else if (choice == 5) {
            System.out.println("You chose to exit menu");
            System.out.println("Are you sure?(y/n)");
            String answer = keyboard.next();

            yesNo(answer);
        }
    }

    private static void yesNo(String answer) throws Exception {
        String message;
        if (answer.equalsIgnoreCase("y")) {
            message = "goodbye";
            System.out.println(message);
        } else if (answer.equalsIgnoreCase("n")) {
            message = "ok! You will not exit the Menu";
            System.out.println(message);
            displayMenu();
        }
    }
}
