package net.hanbit.algorithm.sequence;
public class ArithmeticSequence1{
	public static void main(String[] args){
		
		for(int i=1;i<10;i++){
			for(int j=2; j<=5; j++){
				System.out.print(j+"*"+i+"="+(j*i)+"\t");
			}
		System.out.print("\n");
		}
		System.out.print("\n");
		for(int k=1;k<10;k++){
			for(int m=6; m<=9; m++){
				System.out.print(m+"*"+k+"="+(m*k)+"\t");
			}
		System.out.print("\n");
		}
	}
}