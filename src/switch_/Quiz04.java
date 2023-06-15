package switch_;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String home = null;
		String company = null;
		
		while(true) {
			System.out.println("1. 우리집 등록");
			System.out.println("2. 회사 등록");
			System.out.println("3. 등록 보기");
			int num = sc.nextInt();
			switch(num) {
			case 1: System.out.print("1. 우리집 등록: ");
			home = sc.next();
			break;
			case 2: System.out.print("2. 회사 등록: ");
			company = sc.next();
			break;
			case 3: System.out.println("우리집: " + home);
			System.out.println("회사: " + company);
			
			}
			
		}
		
		
	}

}
