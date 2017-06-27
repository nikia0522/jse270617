package net.hanbit.algorithm.calculator;
import java.util.Scanner;
public class Time{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.print("초를 입력해주세요.");
		int sec=s.nextInt(), hour=sec/3600, min=(sec-(hour*3600))/60;
		System.out.print(String.format("%d 초는 %d시간 %d 분입니다.", sec, hour, min));
	}
}
