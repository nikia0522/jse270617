package net.hanbit.algorithm.calendar;

/*To 개발자님
연도를 4로 나눈 값이 0이라면 윤년일 수 있다
그러나 해당 연수가100으로 나누어 떨어지면 평년이다.
2000년은 4로 나눈값이 0이라서 윤년일 수 있는데..
다시 이 값이  100으로 나눠 떨어지면 평년이다.
평년이라 해도 다시 400으로 나눠 떨어지는 연도는 윤년이다.
*/

import java.util.Scanner;
public class LeapYear{
public static void main(String[]args){
		Scanner s=new Scanner(System.in);
		System.out.print("연도를 입력하세요");
		int year=s.nextInt();
		String result="";
		if(year%400==0){
			result="윤년입니다.";
		}else if(year%100==0){
			result="평년입니다.";
		}else if(year%4==0){
			result="윤년입니다.";
		}
		System.out.print(result);
}
}
