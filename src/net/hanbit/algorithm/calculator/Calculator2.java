package net.hanbit.algorithm.calculator;

import java.util.Scanner;
public class Calculator2{
public static void main(String[] args){
System.out.print("Enter integer a:\n");
Scanner s=new Scanner(System.in);
int a=s.nextInt();
System.out.print("Enter opcode +,-,*,/:\n");
String opcode=s.next();
System.out.print("Enter integer b:\n");
int b=s.nextInt();
int result;
result=0;
if(opcode.equals("+")){
	result=a+b;
}else if(opcode.equals("-")){
	result=a-b;
}else if(opcode.equals("*")){
	result=a*b;
}else if(opcode.equals("/")){
	result=a/b;
}//System.out.print(a+ opcode+ b+ "="+result);
System.out.print(String.format("%d %s %d = %d", a, opcode, b, result));
}
}