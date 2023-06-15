package switch_;

import java.util.Scanner;

public class Quiz0304 {

	public static void main(String args[]) {
        String cmd = "";
        int cnt = -1;
        String[][] student = {};
        int[][] grade = {};
        boolean flag = true;
        Scanner sc = new Scanner(System.in);

        while (flag) {
            System.out.print("명령어를 입력하세요 > ");
            cmd = sc.next();

            switch (cmd) {
                case "count" :
                    System.out.print("학생 수를 입력하세요 > ");
                    cnt = sc.nextInt();
                    student = new String[cnt][2];
                    grade = new int[cnt][3];
                    break;
                case "member" :
                    if (cnt == -1) {
                        System.out.println("학생 수를 입력하세요!");
                        break;
                    }
                    for (int i = 0; i < cnt; i++) {
                        System.out.print("학생 이름 : ");
                        student[i][0] = sc.next();
                        System.out.print("학생 주소 : ");
                        student[i][1] = sc.next();
                    }
                    break;
                case "grade" :
                    if (cnt == -1) {
                        System.out.println("학생 수를 입력하세요!");
                        break;
                    }
                    for (int i = 0; i < cnt; i++) {
                        System.out.print("국어 점수 : ");
                        grade[i][0] = sc.nextInt();
                        System.out.print("수학 점수 : ");
                        grade[i][1] = sc.nextInt();
                        System.out.print("영어 점수 : ");
                        grade[i][2] = sc.nextInt();
                    }
                    break;
                case "print" :
                    if (cnt == -1) {
                        System.out.println("학생 수를 입력하세요!");
                        break;
                    }
                    for (int i = 0; i < cnt; i++) {
                        System.out.println("이름 : " + student[i][0]);
                        System.out.println("주소 : " + student[i][1]);
                        System.out.println("국어 : " + grade[i][0]);
                        System.out.println("수학 : " + grade[i][1]);
                        System.out.println("영어 : " + grade[i][2]);
                        System.out.println("총점 : " + (grade[i][0] + grade[i][1] + grade[i][2]));
                        System.out.println("평균 : " + (grade[i][0] + grade[i][1] + grade[i][2]) / 3);
                    }
                    cnt = -1;
                    break;
                case "exit" : flag = false; break;
            }
        }

    }
	
}
