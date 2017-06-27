package net.hanbit.algorithm.calculator;

import java.util.Scanner;
public class Tax1{
	public static void main (String[] args){
		Scanner s=new Scanner(System.in);
		System.out.print("이름을 입력하세요.\n");
		String name=s.next();
		System.out.print("연봉을 입력하세요. 단위: 만원\n");
		double salary=s.nextDouble(), taxRate=0;
		
		if(salary<=1200){
			taxRate=0.08;
		}else if(salary<=4600){
			taxRate=0.17;
		}else if(salary<=8800){
			taxRate=0.26;
		}else{
			taxRate=0.35;
		}
		
		System.out.print("**************************************\n");
		System.out.print("이름  |  연봉  |  세율  |  납부할 세금\n");
		System.out.print("--------------------------------------\n");
		System.out.print(name+"\t"+salary+"\t"+taxRate+"\t"+(int)(salary*taxRate)+"만원\n");
		System.out.print("**************************************\n");
	}
}