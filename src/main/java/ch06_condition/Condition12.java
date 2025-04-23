package ch06_condition;

import java.util.Scanner;

/*
    Condition07 파일을 확인하시면
    점수를 입력 받아서 등급을 산출을 했습니다.
    이를 응용하여 중첩 if문 + switch 문 형태로 프로그램을 작성

    지시사항
    사용자에게 score를 입력받아서 다음과 같은 조건을 만족시키도록 작성
    score가 0미만이거나 100초과라면 grade = x

    changeScore = 9 ~ 10, grade = A
    changeScore = 8, grade = B
    changeScore = 7, grade = C
    changeScore = 6, grade = D
    changeScore = 5,4,3,2,1이면, grade = F

    실행 예
    점수를 입력하세요 >>> 100
    점수는 100점이고, 학점은 A학점 입니다.
    changeScore = score / 10;
 */
public class Condition12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하세요 >>> ");
        int score = scanner.nextInt();
        int changeScore = score / 10;
        String grade = "";

        // switch 문
        if(score < 0 || score > 100){
            grade = "x";
        }else {
            switch (changeScore) {
                case 10:
                case 9:
                    grade = "A";
                    break;
                case 8:
                    grade = "B";
                    break;
                case 7:
                    grade = "C";
                    break;
                case 6:
                    grade = "D";
                    break;
                default:
                    grade = "F";
                    break;
            }
        }
        System.out.println("점수는 " + score + ", 학점은 " + grade + "학점 입니다.");
    }
}
