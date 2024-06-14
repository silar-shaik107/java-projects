package com.atm.project;

import java.util.Scanner;

public class ATMExample {

	// main method starts
	public static void main(String[] args) {
		int balance = 100000;
		int withdraw;
		int deposit;
		// create scanner class object to get choice from user
		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.println("Automated Teller Machine");
			System.out.println("Choose 1 for Withdraw");
			System.out.println("Choose 2 for Deposit");
			System.out.println("Choose 3 for Check Balnce");
			System.out.println("Choose 4 for EXIT");
			System.out.println("Choose the Operation you want to perform");

			// get choice from the user
			int choice = s.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter money to be withdraw");

				// get the withdrawn money from user
				withdraw = s.nextInt();

				// checking if the balance is greater than or equal to withdrawn amount
				if (balance >= withdraw) {

					// remove the withdraw amount from total balance
					balance = balance - withdraw;
					System.out.println("Please collect your money");
				} else {
					System.out.println("Insufficient Balnce");
				}
				System.out.println("");
				break;

			case 2:
				System.out.println("Enter Money to be Deposited");

				// get deposit amount from the user
				deposit = s.nextInt();

				// add the deposited money to total balance
				balance = balance + deposit;
				System.out.println("Your Money has been succesfully Deposited");
				System.out.println("");
				break;

			case 3:

				// displaying the total balance of the user
				System.out.println("Balance" + balance);
				System.out.println();
				break;

			case 4:
				// exit from the menu
				System.exit(0);
			}

		}

	}

}
