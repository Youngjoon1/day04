package switch_;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("날짜를 입력해주세요: ");
		int date = sc.nextInt();
		
		if(date % 7 == 1) {
			System.out.println("월");
		}else if(date % 7 == 2) {
			System.out.println("화");
		}else if(date % 7 == 3) {
			System.out.println("수");
		}else if(date % 7 == 4) {
			System.out.println("목");
		}else if(date % 7 == 5) {
			System.out.println("금");
		}else if(date % 7 == 6) {
			System.out.println("토");
		}else if(date % 7 == 0) {
			System.out.println("일");
		}else {
			System.out.println("잘못입력");
		}
		
	
		
	}

}
