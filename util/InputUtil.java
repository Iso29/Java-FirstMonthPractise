package util;

import java.util.Scanner;

public class InputUtil {
	public static String requiretext(String title) { 
		Scanner sc = new Scanner(System.in);
		System.out.println(title+ ":");
		String text = sc.nextLine();
		return text;
	}
	
	public static int requireNumber (String title) {
		Scanner sc = new Scanner(System.in);
		System.out.println(title+ ":");
		int number = sc.nextInt();
		return number;
	}
}
