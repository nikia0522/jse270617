package net.hanbit.algorithm.application;

import java.util.Scanner;
public class Bmi2{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("나의 체질량지수(BMI)는?\n");
		System.out.print("Height?\n");
		double height=scan.nextDouble();
		System.out.print("Weight?\n");
		double weight=scan.nextDouble();
		double bmi=weight/(height*height);
		String state="";
		System.out.print("####bmi 값"+bmi);
		if(30<bmi){
			state="과체중";
		}else if (25<bmi){
			state="정상";
		}else if(18.5<bmi){
			state="저체중";
		}else{
			state="비만";
		}
		
		System.out.print("나의 체질량지수(BMI):"+state+"입니다");
	}
}