package net.hanbit.algorithm.sequence;

public class WhileloopSeq{
	public static void main (String[] args){
		int sum=0, i=0;
		while(i<5){
			sum+=i+1;
			i++;
		}
		System.out.print(sum);
	}
}
//while loop = stream처리할 때 (infinte sequences) ie making engines
//for loop = finite sequences 

//collection of streams - an engine