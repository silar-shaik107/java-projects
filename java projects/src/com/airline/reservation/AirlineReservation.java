package com.airline.reservation;

import java.util.Scanner;

public class AirlineReservation {

	// declaring static global variables
	static int seats[] = new int[11];
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to XYZ Airlines");

		while (true) {
			System.out.println("Please select an option");
			System.out.println("1. View avalibale seats");
			System.out.println("2. Reserve a seat");
			System.out.println("3. Exit");
			System.out.println();
			
			int choice = sc.nextInt();

			switch (choice) {
			case 1:// display seat
				displaySeats();
				break;
			case 2:// reserve a seat
				reserveseat();
				break;
			case 3:
				System.out.println("thank you for using XYZ Airlines");
				System.exit(0);
			}// end of switch case

		} // end of while loop

	}// end of main method

	private static void reserveseat() {
		System.out.println("Seats");
		for (int i = 1; i <= 10; i++) {
			System.out.println("Seats" + i + ":" + (seats[i] == 0 ? "Avalibale" : "Reserved"));
		}
	}// End of display seats

	private static void displaySeats() {
		System.out.println("Enter seat number to reserve");
		int seat = sc.nextInt();
		if (seats[seat] == 0) {
			seats[seat] = 1;
			System.out.println("seat" + seat + "Reserved successfully");
		} else {
			System.out.println("seat" + seat + "is Already reserved");
		}
	}
}// end of class
