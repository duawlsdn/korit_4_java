package ch06_condition;

import java.util.Scanner;

/*
    조건문
    1. if : if 다음에 () 내의 조건식이 true 일 때 {} 내의 실행문이 실행됨
        false면 실행 X

      형식 :
      if(조건식){      조건식 : true / false 로 결론이 날 수 있는 식 또는 문장
        실행문
      }
 */
public class Condition01 {
    public static void main(String[] args) {
        // 변수 선언 및 초기화
        int num1 = 10;

        // 조건문 적용
        // 실행 성공 사례
        if(num1 > 0) System.out.println("양수 입니다.");
        else System.out.println("짝수 입니다.");

        // 실행 실패 사례
        if(num1 > 15) System.out.println("num1은 15 초과입니다.");

        // Scanner import
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 >>> ");
        int num2 = scanner.nextInt();
        if(num2 > 0) System.out.println("num2는 양수 입니다.");
    }
}
