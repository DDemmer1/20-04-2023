package de.demmer.dennis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		
		String s5 = "Test";
		System.out.println(s5.equals("Test"));
		Date date = new Date();
		
		

		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);

//		try {
//		  String s = br.readLine();
//		  System.out.println("BufferedReader: " + s);
//		} catch(IOException ioe) {
//			ioe.printStackTrace();
//		}

		// ------------------------------

//		
//		Scanner scanner = new Scanner(System.in);
//
//		while (true) {
//
//			String s1 = scanner.nextLine();
//			System.out.println("Scanner: " + s1);
//
//		}

	}

}
