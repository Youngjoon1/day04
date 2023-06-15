package for_;

import java.util.Scanner;

public class QuizQuiz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int total1 = 0;
		int total2 = 0;
		
		System.out.print("입력: ");
		
		int n1 = sc.nextInt();
		
		for(int i = 1; i <= n1; i++ ) {
			if(i % 2 == 0) {
				total1 += i;
				
			}else {
				total2 += i;
			}
			
			
		}
		System.out.println(total1);
		System.out.println(total2);
		
	}

}
