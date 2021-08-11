package com.at.example.basic;

import java.io.IOException;
import java.util.Scanner;

public class loop {

	static char ch;
	public static void main(String[] args) {
				
		while (true) {
			Scanner sc=new Scanner(System.in);
		    System.out.println("enter character");
		    String input = sc.nextLine();
		    if (ch=='c') {
		        break;
		    }

		    System.out.println("print char");
		}

		System.out.println("print"+ch);


	}
}


