package net.hanbit.algorithm.calculator;

import java.util.Scanner;
public class Plus {
	public static void main(String[] args) {
		System.out.print("Plus Calculator\n");
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Please enter the first number:\n");
		int a = scan.nextInt();
		System.out.print("Please enter the second number:\n");
		int b = scan.nextInt();
		int c = a+b;
		System.out.print("a+b = "+c);
	}
}
