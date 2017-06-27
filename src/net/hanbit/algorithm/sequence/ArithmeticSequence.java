package net.hanbit.algorithm.sequence;

import java.util.Scanner;
public class ArithmeticSequence{
	public static void main (String[] args){
		Scanner s=new Scanner(System.in);
		System.out.print("단을 입력하세요.\n");
		int j=s.nextInt();
		int i=1;
		for(;i<10;){			
			System.out.print(j+"*"+i+"="+(j*i)+"\n");
			i++;
		}
	}
}