package net.hanbit.algorithm.calculator;

import java.util.Scanner;
public class MulCal{
public static void main(String[] args){
System.out.print("multiplication calculator\n");
Scanner scan=new Scanner(System.in);

System.out.print("a?\n");
int a=scan.nextInt();
System.out.print("b?\n");
int b=scan.nextInt();
int c=a*b;
System.out.print("a*b="+c);
}
}
