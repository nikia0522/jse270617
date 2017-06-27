package net.hanbit.algorithm.calculator;

import java.util.Scanner;
public class MinusCal {
public static void main(String[] args){
	System.out.print("Minus Calculator\n");
	Scanner scan=new Scanner(System.in);

	System.out.print("1st number: \n");
	int a = scan.nextInt();
	System.out.print("2nd number: \n");
	int b = scan.nextInt();
	int c = a-b;
	System.out.print("a - b = "+c);
	}
}