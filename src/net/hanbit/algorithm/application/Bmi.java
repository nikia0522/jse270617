package net.hanbit.algorithm.application;
import java.util.Scanner;
public class Bmi{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.print("나의 체질량지수(BMI)는?\n");
		System.out.print("Height?\n");
		double height=s.nextDouble();
		System.out.print("Weight?\n");
		double weight=s.nextDouble();
		double bmi=weight/(height*height);
		String state="";
		if(30<bmi){
			state="저체중";
		}else if (18.5<bmi&&bmi<=24.9){
			state="정상";
		}else if(25.0<bmi&&bmi<=30){
			state="과체중";
		}else{
			state="비만";
		}
		
		System.out.print("나의 체질량지수(BMI):"+state+"입니다");
	}
}