package com.coderscampus.assignment2;

import java.util.Random;
import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {


		// TODO Auto-generated method stub
		//java.lang is by default imported for us
		//System.out.println("Hello World");
		//System.out.println("Type in any input: ");
		
		
		//Initialize program variables
		int valid_attempts = 0;
		int userInput = -1;
		
		//Create necessary objects
		UserInput newInput = new UserInput();
		Random random = new Random();
		//Scanner object will be created in main an passed via userInput method
        Scanner scanner = new Scanner(System.in);
		
        //Ramdon number between 1 and 100 (both inclusive)
		int random_int = random.nextInt(99)+1;

		while (valid_attempts < 5 && userInput != random_int) {	
			userInput = newInput.readInput(random_int,valid_attempts,scanner);		
			valid_attempts++;
			if (userInput != random_int && valid_attempts < 5) {
			System.out.println("Attempt: " + valid_attempts);
			}
			if(valid_attempts==4 && userInput != random_int ) {
				System.out.println("This is your last chance!");
			}
		}
		
        scanner.close();
        if (userInput == random_int) {
        	System.out.println("You are very lucky! You won the game after " + valid_attempts +" attempts.");
        	System.out.println("Random number positive match: " + random_int);	
        }
        else {
        	System.out.println("Sorry, try again! You have tried "+ valid_attempts + " times." );
        	System.out.println("Random number was: "+ random_int );
        	
        }
        	
	}

}
