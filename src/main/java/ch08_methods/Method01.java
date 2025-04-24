package ch08_methods;

import java.util.Scanner;

public class Method01 {
    // method를 정의하는 영역

    // 1. [ X | X ] [ 입력값 | 출력값 ]
    public static void call1(){
        System.out.println("[ X | X ]");
    }

    // 2. [ O | X ]
    public static void call2(String strExample){
        System.out.println("[ O | X ]");
        System.out.println("오늘의 다짐 : " + strExample);
    }

    // 3. [ X | O ]
    public static String call3() {
        System.out.println("[ X | O ]");
        String result = "";     // 지역 변수 - 메서드 내에 정의된 변수
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < i+1; j++){
                result += "🎁";
            }
            result += "\n"; // \n - 개행하라는 의미, \t -> 공백 두번 / 네번
        }
        return result;
    }

    // 4. [ O | O ]
    public static String call4(int year, int month, int date, String day){
        System.out.println("[ O | O ]");
        return year + "년 " + month + "월 " + date + "일 " + day + " 입니다. ✨";
    }

    // 자기 소개를 하는 메서드를 하나 정의할 예정
    public static String introduce(String name, int age){
        return "제 이름은 " + name + " 입니다. 나이는 " + age + " 살 입니다.\n내년에는 " + (age+1)+ " 살이 됩니다.";
    }

    public static void main(String[] args) {
        // method를 실행(호출)하는 영역
        call1();
        call2("메서드 이해하기!🎈");    // 호출 단계에서 ()내를 채우는 것은 argument
//        result = "대입불가";
//        call3();    // 실행 X
        System.out.println(call3());    // call3()는 출력하라는 명령문이 메서드 내에 정의되어있지 않음
                                        // 이상을 이유로 sout이 main단계에서 요구됨
        System.out.println(call4(2025, 4, 25, "목요일"));
        System.out.println(introduce("염진우",30));

        // Scanner를 활용한 예제
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요 >>> ");
        String name1 = scanner.nextLine();
        System.out.print("나이를 입력하세요 >>> ");
        int age1 = scanner.nextInt();
        String str = introduce(name1,age1);
        System.out.println(str);

        /*
            함수형 프로그래밍(function Programming) :
                메서드1의 return 값이 메서드2의 argument가 되고, 메서드2의 return 값이 메서드3의 argument가 되는 방식으로,
                첫번째 메서드로 부터 마지막 메서드까지의 흐름을 통해 프로그램이 이어지는 방식을 의미함.

            이상의 예시에서는 .nextLine()의 결과값과 .nextInt()의 결과값이 .introduce()의 argument1,argument2로 사용.
         */
    }
}
