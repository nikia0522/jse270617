package net.hanbit.algorithm.calculator;

/* 세금 출력 프로그램

클라이언트에서 프로그램 개발 요청이 왔습니다.
이름과 연봉을 입력받아서
연봉 ***만원을 받으시는 xxx님께서 납부할 세금은 ???만원 입니다. 로 출력하는 프로그램을 만들어주세요.
현재는 세율이 9.7프로라고 합니다.*/

import java.util.Scanner;
public class Tax{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.print("이름을 입력하세요.\n");
		String name=s.next();
		System.out.print("연봉을 입력하세요. 단위: 만원\n");
		double Salary=s.nextDouble();
		
		
		System.out.print("**************************************\n");
		System.out.print("이름  |  연봉  |  세율  |  납부할 세금\n");
		System.out.print("--------------------------------------\n");
		System.out.print(name+"   "+Salary+"    0.098   "+(int)(Salary*0.098)+"만원\n");
		System.out.print("********************************\n");
	}
}