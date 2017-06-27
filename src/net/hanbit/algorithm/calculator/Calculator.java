package net.hanbit.algorithm.calculator;

import java.util.Scanner;
public class Calculator{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.print("Plus: Enter 1.\nMinus: Enter 2.\nMultiply: Enter 3.\nDivide: Enter 4.\n");
int opcode=s.nextInt();
System.out.print("Enter a:\n");
int a=s.nextInt();
System.out.print("Enter b:\n");
int b=s.nextInt();
int result=0;
if(opcode==1){
result=a+b;
}else if(opcode==2){
result=a-b;
}else if(opcode==3){
result=a*b;
}else if(opcode==4){
result=a/b;
}System.out.print("Result:"+result);
System.out.print("\n");
}
}