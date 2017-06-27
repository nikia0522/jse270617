package net.hanbit.algorithm.member;
import java.util.Scanner;
public class SSN{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.print("이름을 입력하세요\n");
		String name=s.next();
		System.out.print("주민등록번호를 입력하세요\n");
		String ssn=s.next();
		String sYear=ssn.substring(0,2);
		int year=Integer.parseInt(sYear);

		/*int age=0;
		int gap=17-year;
		if(gap>=0){
			age=18-year;
		}else{
			age=(101-year)+17;
		}
		
		 */
		
		char ch=ssn.charAt(7);
		String gender="";
		String result="";
		switch(ch){
			case '1': case '3':
				gender="남";
				break;
			case '2': case '4':
				gender="여";
				break;
			case 5: case 6:
				gender="외국인";
				break;
			default:
				gender="틀림";
				break;
		}
		System.out.print("****************\n");
		System.out.print("이름   나이    성별\n");
		System.out.print("-----------------\\n");
		System.out.print(String.format("&s   %d세    &s",name, (17-year>=0)?18-year:(101-year)+17,gender));
	}
}