package net.hanbit.algorithm.calculator;

import java.util.Scanner;
public class DivCal{
	public static void main(String[] args){
		System.out.print("Division Calculator:\n");
		Scanner s=new Scanner(System.in);
		System.out.print("a?\n");
		int a = s.nextInt();
		System.out.print("b?\n");
		int b = s.nextInt();
		int c = a/b;
		System.out.print("a/b="+c);
	}
}
