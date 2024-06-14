package com.password.generator;

import java.security.SecureRandom;

public class PasswordGenerator {

	public static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
	public static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static final String DIGITS = "0123456789";
	public static final String SPECIAL = "!@#$%^&*()_+";

	public static void main(String[] args) {
		int length = 12;
		System.out.println(generatePassword(length));
	}

	public static String generatePassword(int length) {

		StringBuilder password = new StringBuilder(length);
		SecureRandom ramdom = new SecureRandom();
		String chars = LOWER + UPPER + DIGITS + SPECIAL;

		for (int i = 0; i < length; i++) {
			int ramdomIndex = ramdom.nextInt(chars.length());
			password.append(chars.charAt(ramdomIndex));
		}
		return password.toString();
	}

}
