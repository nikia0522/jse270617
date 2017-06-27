package net.hanbit.algorithm.member;
import java.util.Scanner;
public class Login{
	public static final String USER_ID="kim";
	public static final String USER_PASS="1";
	public static void main(String[]args){
		Scanner s=new Scanner(System.in);
		System.out.print("로그인\n");
		// if(!id.equals(USER_ID)){}
		System.out.print("Enter ID");
		String id=s.next();
		System.out.print("Enter PASS");
		String pass=s.next();
		String result="";
		if(!id.equals(USER_ID)){
			result="id가 존재하지않습니다.";			
		}else if(!pass.equals(USER_PASS)){
			result="pass가 올바르지 않습니다.";
		}else{
			result="Welcome";
		}
		System.out.print(result);
	}
}