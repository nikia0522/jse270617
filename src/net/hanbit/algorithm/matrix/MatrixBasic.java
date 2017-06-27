package net.hanbit.algorithm.matrix;

public class MatrixBasic{
	public static void main(String[]args){
		int[][]mtx=new int[5][6];
		for(int i=0;i<mtx.length;i++){		
			System.out.print("\n");
			for(int j=0; j<mtx[i].length; j++){ //like inception(dream within a dream), or a clock's hour/min gear
				System.out.print(String.format("[%d %d]",i,j));
			}
		}
	}
}