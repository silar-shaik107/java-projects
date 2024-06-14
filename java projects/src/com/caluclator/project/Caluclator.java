package com.caluclator.project;

import java.util.Scanner;

public class Caluclator {

	public static void main(String[] args) {
    
		//to read the input from the user through console
		Scanner sc= new Scanner(System.in);
		
		//this line prints the welcome message indicating that its a simple calculator
		System.out.println("Simple Caluclator");
		
		while(true) {
			System.out.println("Choose an operation");
			System.out.println("1.Addition(+)");
			System.out.println("2.Subtraction(-)");
			System.out.println("3.Multiplication(*)");
			System.out.println("4.Division");
			System.out.println("5.Exit");
			
			System.out.print("Enter your choice(1-5):");
			int choice=sc.nextInt();
			
			if(choice==5) {
				System.out.println("Exit the caluclator and Goodbye!");
				break;
			}
			
			System.out.println("Enter the first operand: ");
			double operand1=sc.nextDouble();
			
			System.out.println("Enter Second Operand");
			double operand2=sc.nextDouble();
			
			double result=0;
			
			switch(choice) {
			case 1:
				result=operand1+operand2;
				break;
			case 2:
				result=operand1-operand2;
				break;
			case 3:
				result=operand1 * operand2;
				break;
			case 4:
				if(operand2!=0) {
					result=operand1/operand2;
				}
				else {
					System.out.println("Error:Division by Zero");
					continue;
				}
				break;
				default:
					System.out.println("Invalid choice.please choose a valid operation");
					continue;
			}
			System.out.println("Result:"+result);
		}
		sc.close();
	}

}
