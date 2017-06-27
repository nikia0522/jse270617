package net.hanbit.algorithm.hello;
import java.util.Scanner;
public class Hello{
public static void main(String[] args){
System.out.print("What's your name?");
Scanner Scanner=new Scanner(System.in);
String name=Scanner.next();
System.out.print("Hello !!"+name);
}
}