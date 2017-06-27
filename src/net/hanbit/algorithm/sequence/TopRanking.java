package net.hanbit.algorithm.sequence;

import java.util.Scanner;
public class TopRanking{
	public static void main (String[] args){
		Scanner scan=new Scanner(System.in);
		
		System.out.print("1반의 총 학생수는 몇명?");
		int num=scan.nextInt();
		int[] scores = new int[num];
		for(int i=0;i<num;i++){
			System.out.print("학생의 점수를 입력하세요(100점 만점)?");
			scores[i]=scan.nextInt();
		}
		
		int sum=0;
		for(int i=0; i<scores.length;i++){
			sum+=scores[i];
		}
		int avg=sum/num;
		System.out.println("1반의 평균점수는?\n"+avg);
		
		
		int max=scores[0];
		for(int i=0; i<num; i++){
			if(scores[i]>max){
				max=scores[i];
			}
		}
		System.out.println("최대 점수는 \n"+max);
		
		int min=scores[0];
		for(int i=0; i<num; i++){
			if(scores[i]<min){
				min=scores[i];
			}
		}
		System.out.println("최소 점수는 \n"+min);
	}
}