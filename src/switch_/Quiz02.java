package switch_;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num;
		String home;
		String company;
		
		while (true) {
			System.out.print("1. 우리집 등록 : ");
			home = sc.next();
			System.out.print("2. 회사 등록 : ");
			company = sc.next();
			
			System.out.print("");
			num = sc.nextInt();
			if(num == 3) {
				System.out.println("우리집 :" + home);
				System.out.println("회사 : " + company);	
			}else {
				
			}
			
			}
		
		
		
		
	}

}
