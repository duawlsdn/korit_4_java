package ch06_condition;

import java.util.Scanner;

/*
    삼항 연산자
        정의 : 조건식을 평가하여 true / false 에 따라 두 가지 표현식 중 하나를 선택적으로 실행

        형식 :
        조건식 ? 표현식1 : 표현식2

        조건식 : true / false 로 평가 가능한 식
        표현식1 : 조건식이 true 일 때 실행되는 식
        표현식2 : 조건식이 false 일 때 실행되는 식
 */
public class Condition10 {
    public static void main(String[] args) {
//        int a = 5;
//        int b = 3;
//        int max1;
//        int max2;
        // a > b 라면 max에 a를 대입 / 아니라면 max에 b를 대입
//        max1 = (a>b) ? a : b;
//        System.out.println("max1에 저장된 값은? : "+max1);

        // 이상의 삼항 연산자를 if - else 문으로 풀어 쓴다면
//        if(a>b){
//            max2 = a;
//        }else {
//            max2 = b;
//        }
//        System.out.println("max2에 저장된 값은? : "+max2);

        // 이상의 삼항 연산자 개념을 윤년에 응용하도록 하겠습니다.
        Scanner scanner = new Scanner(System.in);
        System.out.print("년도를 입력 >>> ");
        int year = scanner.nextInt();

        // boolean 자료형의 변수명은 is로 시작하는 일이 많습니다.
//        boolean isLeapYear = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));

//        String result = isLeapYear ? "윤년" : "윤년X";
//        System.out.println(result);

        // 음수 연도를 걸러내기 위해서는 어떻게 해야 하나
//        String result2 = "";
//        if(year < 0) {
//            result2 = "불가능한 연도 입력입니다.";
//        }else { // 그러면 이 부분 부터는 0 이상으로 적용
//            // 여기에 삼항 연산자 적용
//            result2 = isLeapYear ? "윤년" : "윤년X";
//        }
//        System.out.println(result2);

        // 중첩 삼항 연산자
        String result3 = year <= 0 ? "불가능한 연도 입력입니다."
                : ((year % 4 == 0 && year % 100 == 0) || (year % 400 == 0)) ? "윤년 입니다." : "윤년이 아닙니다.";
        System.out.println(year + "년은 " +result3);
    }
}
