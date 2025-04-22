package ch04_scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        /*
            .next() : String 데이터를 받을 때 띄어쓰기를 인정하지 않음
            .nextLine() : String 데이터를 받을 때 띄어쓰기를 인정하고 enter 키 기준으로 데이터가 입력됨

            실행 예
            이름을 입력하세요 >>>
            나이를 입력하세요 >>>
            주소를 입력하세요 >>> (시 / 구)

            안녕하세요, 제 이름은 ???입니다. ???에 살고 있습니다.
            10년 후 나이는 ???+10 살 입니다.
         */
        // 1. 변수 선언 초기화 같이
        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("이름을 입력하세요 >>> ");
//        String name = scanner.next();
//        System.out.print("나이를 입력하세요 >>> ");
//        int age = scanner.nextInt();
//        scanner.nextLine();
//        System.out.print("주소를 입력하세요 >>> ");
//        String address = scanner.nextLine();
//        int age10 = age + 10;
//        System.out.println("안녕하세요, 제 이름은 " + name + "입니다. " + address + "에 살고 있습니다.\n10년 후 나이는 " + age10 + "살 입니다." );

        // 2. 변수 선언 따로 초기화 따로
//        Scanner scanner = new Scanner(System.in);
//        String name;
//        int age;
//        String address;
//        int age10;
//
//        System.out.print("이름을 입력하세요 >>> ");
//        name = scanner.next();
//        System.out.print("나이를 입력하세요 >>> ");
//        age = scanner.nextInt();
//        scanner.nextLine();
//        System.out.print("주소를 입력하세요 >>> ");
//        address = scanner.nextLine();
//        age10 = age + 10;
//        System.out.println("안녕하세요, 제 이름은 " + name + "입니다. " + address + "에 살고 있습니다.\n10년 후 나이는 " + age10 + "살 입니다." );


    }
}
