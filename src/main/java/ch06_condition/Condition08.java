package ch06_condition;

import java.util.Scanner;

/*
    과제 :
    윤년 계산기 작성
    윤년(leap year) 특정 조건을 만족하는 년을 의미

    윤녀을 판단하는 규칙
    1. 연도가 4로 나뉘어 떨어지는 해는 윤년에 해당할 '수도 있음'
    2. 그러나 100으로 나누어 떨어지는 해는 윤년이 아님
    3. 근데 100으로 나누어 떨어지긴 하는데 400으로 나누어 떨어지면 윤년에 해당

    예를 들어,
    2020년은 4로 나누어 떨어지므로 윤년(100으로 나누어떨어지지 않음)
    1900년은 100으로 나누어 떨어지기 때문에 윤년이 아님(400으로 나누어 떨어지지 않음)
    2000년은 100으로 나누어 떨어지지만 400으로도 나누어 떨어지기 때문에 윤년에 해당.
 */
public class Condition08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year;

        System.out.print("년도를 입력해 주세요 >>> ");
        year = scanner.nextInt();

//        if(year % 400 == 0) System.out.println("윤년");
//        else if(year % 100 == 0) System.out.println("윤년 X");
//        else if(year % 4 == 0) System.out.println("윤년");
//        else System.out.println("윤년 X");

        // sout 이 반복
        // 음수값 처리
        // 반복을 줄이기 위한 leapYear 변수를 선언
        String leapYear = "";

//        if(year % 400 == 0) leapYear = "윤년";
//        else if(year % 100 == 0) leapYear = "윤년X";
//        else if(year % 4 == 0) leapYear = "윤년";
//        else leapYear = "윤년";
//        System.out.println(leapYear);

        String str = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? "윤" : "윤X";
        System.out.println(str);
    }
}
