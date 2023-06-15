package switch_;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("1 . 우리집 등록: ");
		String home = sc.next();
		System.out.print("2 . 회사 등록: ");
		String company = sc.next();
		
		System.out.print("");
		int num = sc.nextInt();
		switch(num) {
		case 3 : System.out.println("우리집 : " + home);
		System.out.println("회사 : " + company);
		}
		
	}

}
