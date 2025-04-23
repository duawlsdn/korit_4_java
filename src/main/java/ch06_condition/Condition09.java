package ch06_condition;

import java.util.Scanner;

public class Condition09 {
    public static void main(String[] args) {
        // 논리 연산자 사용
        Scanner scanner = new Scanner(System.in);

        System.out.print("년도를 입력 >>> ");
        int year = scanner.nextInt();
        String leapYear = "";

        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            leapYear = "윤년";
        }else {             // 여기 조건이 달라짐. 4로 나누어 떨어지지 않거나 // 100으로 나누어지거나
            leapYear = "윤년X";
        }
        System.out.println(leapYear);

    }
}
