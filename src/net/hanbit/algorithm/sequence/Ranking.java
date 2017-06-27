package net.hanbit.algorithm.sequence;

import java.util.Scanner;
public class Ranking{
	public static void main(String[] args){
		System.out.print("###### 성적 랭킹 ######\n");
		Scanner scan=new Scanner(System.in);
		int[] scores=new int[3];
		String[] names=new String[3];
		
		for(int i=0; i<3; i++){
			System.out.print("이름을 입력하세요.\n");
			names[i]=scan.next();
			System.out.print("점수를 입력하세요.\n");
			scores[i]=scan.nextInt();
			
		}
		/* 0
		System.out.print("A 학생 점수를 입력하세요.\n");
		int a=scan.nextInt();
		System.out.print("B 학생 점수를 입력하세요.\n");
		int b=scan.nextInt();
		System.out.print("C 학생 점수를 입력하세요.\n");
		int c=scan.nextInt();
		*/
	
		int[] scoreRanking=new int[3];
		String[] nameRanking=new String[3];
		if(scores[0]>scores[1] && scores[0]>scores[2]){ //a b c or a c b 
			nameRanking[0]=names[0];
			scoreRanking[0]=scores[0];
			if(scores[1]>scores[2]){
				nameRanking[1]=names[1];
				scoreRanking[1]=scores[1];
				nameRanking[2]=names[2];
				scoreRanking[2]=scores[2];
			}else{
				nameRanking[1]=names[2];
				scoreRanking[1]=scores[2];
				nameRanking[2]=names[1];
				scoreRanking[2]=scores[1];
			}
		}else if(scores[1]>scores[0] && scores[1]>scores[2]){
			nameRanking[0]=names[1];
			scoreRanking[0]=scores[1];
			if(scores[0]>scores[2]){
				nameRanking[1]=names[0];
				scoreRanking[1]=scores[0];
				nameRanking[2]=names[2];
				scoreRanking[2]=scores[2];
			}else{
				nameRanking[1]=names[2];
				scoreRanking[1]=scores[2];
				nameRanking[2]=names[0];
				scoreRanking[2]=scores[0];
			}
		}else if(scores[2]>scores[0] && scores[2]>scores[1]){
			nameRanking[0]=names[2];
			scoreRanking[0]=scores[2];
			if(scores[0]>scores[1]){
				nameRanking[1]=names[0];
				scoreRanking[1]=scores[0];
				nameRanking[2]=names[1];
				scoreRanking[2]=scores[1];
			}else{
				nameRanking[1]=names[1];
				scoreRanking[1]=scores[1];
				nameRanking[2]=names[0];
				scoreRanking[2]=scores[0];
			}
		}
	System.out.print("1등 [이름] "+nameRanking[0]+"\t [점수]"+scoreRanking[0]+"\n");
	System.out.print("2등 [이름] "+nameRanking[1]+"\t [점수]"+scoreRanking[1]+"\n");
	System.out.print("3등 [이름] "+nameRanking[2]+"\t [점수]"+scoreRanking[2]+"\n");
	}
}