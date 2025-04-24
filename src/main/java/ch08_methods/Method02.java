package ch08_methods;

import java.util.Scanner;

public class Method02 {
    // 한 방에 자기 소개하는 메서드 정의
    // call1()
//    public static void introduce() {
//        // 내부에서 Scanner import
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("이름을 입력하세여 >>> ");
//        String name = scanner.nextLine();
//        System.out.print("주소를 입력하세요 >>> ");
//        String address = scanner.nextLine();
//        System.out.println("제 이름은 " + name + "입니다.");
//        System.out.println(address + " 에 살고 있습니다.");
//    }
    /*
        출석부 생성
        메서드 명 : registerStudent()
        return : void

        실행 예
        학번을 입력하세요 >>> ???
        이름을 입력하세요 >>> ???
        학번 : ???
        이름 : ???

        main 단계에서 학생 수를 입력 받을 예정

        몇 명의 학생을 등록하시겠습니까? >>> 3
        학번을 입력하세요 >>> 20250001
        이름을 입력하세요 >>> 김일
        학번 : 20250001
        이름 : 김일
        학번을 입력하세요 >>> 20250002
        이름을 입력하세요 >>> 김이
        학번 : 20250002
        이름 : 김이
        학번을 입력하세요 >>> 20250003
        이름을 입력하세요 >>> 김삼
        학번 : 20250003
        이름 : 김삼
        학번을 입력하세요 >>> 20250004
        이름을 입력하세요 >>> 김사
        학번 : 20250004
        이름 : 김사
     */
    // call1()
    public static void registerStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("학번을 입력하세요 >>> ");
        int stdNum = scanner.nextInt();
        scanner.nextLine();
        System.out.print("이름을 입력하세요 >>> ");
        String stdNa = scanner.nextLine();
        System.out.println("학번 : " + stdNum);
        System.out.println("이름 : " + stdNa);
    }

    // call2()
    public static void registerStudent2(int studentNum){
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < studentNum; i++){
            System.out.print("학번을 입력하세요 >>> ");
            int stdNum = scanner.nextInt();
            scanner.nextLine();
            System.out.print("이름을 입력하세요 >>> ");
            String stdNa = scanner.nextLine();
            System.out.println("학번 : " + stdNum);
            System.out.println("이름 : " + stdNa);
        }
    }

    // call2() - 메서드 안에 메서드 호출
    public static void registerStudent3(int count){
        for(int i = 0; i < count; i++){
            registerStudent();
        }
    }

    public static void main(String[] args) {
        // 여기서는 호출만
//        introduce();
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 명의 학생을 등록하시겠습니까? >>> ");
        int studentNum = scanner.nextInt();

        // call1()
        // for를 사용한다면
//        for(int i = 0; i < studentNum; i++){
//            registerStudent();
//        }

        // while
//        int num = 0;
//        while(num < studentNum) {
//            registerStudent();
//            num++;
//        }

        //call2()
        registerStudent2(3);





    }
}
