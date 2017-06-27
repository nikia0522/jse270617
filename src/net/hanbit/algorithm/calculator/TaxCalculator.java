package net.hanbit.algorithm.calculator;

/*@file : Tax.java
*@author : pakjkwan@gmail.com
*@date : 2016.2.13.
*@story : 세금 출력 프로그램

클라이언트에서 프로그램 개발요청이 왔습니다.
이름과 연봉을 입력 받아서
연봉 ***만원을 받으시는 xxx님께서 납부할 세금은 ???만원입니다.
로 출력하는 프로그램을 만들어주세요.
단)세율이 정책이 바뀔 때 마다 변하니,
관리자가 쉽게 적용가능하도록 만들어 주세요.
현재는세율이 9.7프로라고 합니다.*/
import java.util.Scanner;
public class TaxCalculator{
	public static void main(String[]args){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Name\n");
		String name=s.next();
		System.out.print("Enter Salary\n");
		int salary=s.nextInt();
		double taxrate=0;
		int paytax=(int)(salary*taxrate);
		if(salary<=1200){
			taxrate=0.08;
		}else if(salary<=4600){
			taxrate=0.17;
		}else if(salary<=8800){
			taxrate=0.26;
		}else{
			taxrate=0.35;
		}
		System.out.print("*******************\n");
		System.out.print("이름  |  연봉  |세율  |납부할 세금\n");
		System.out.print("--------------------\n");
		System.out.print(String.format("&s  |  &d   |  %f  |  %d  만원", name,salary,taxrate,paytax));
		System.out.print("***************");
	}
}
