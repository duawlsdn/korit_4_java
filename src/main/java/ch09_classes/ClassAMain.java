package ch09_classes;

import java.util.Scanner;

public class ClassAMain {
    public static void main(String[] args) {
        // 객체 생성
        ClassA classA1 = new ClassA();

        // 이상에서 볼 수 있듯이
        // 사실 여태까지 저희는 Scanner 클래스를 import 한다고 했지만
        // Scanner 클래스의 인스턴스를 생성하고 있었습니다.

        // 객체 생성 방법
        // 클래스명 객체명 = new 클래스명();

        // 객체의 속성 접근 방법
        // 객체명.속성명
//        classA1.num = 100;
//        classA1.name = "김일";

        // A2 객체를 생성하고 num = 200, name = 김이
        // sout 적용해서 김이의 번호는 200번 입니다를 출력
        // 클래스명.속성명은 변수처럼 사용된다는점
//        ClassA classA2 = new ClassA();
//        classA2.num = 200;
//        classA2.name = "김이";
//        System.out.println(classA2.name +"의 번호는 " + classA2.num +" 번 입니다.");

        // 메서드 호출 방법
        // 객체명.메서드명()
//        classA1.callName();
//        classA2.callName();
        // 이상의 두 method 호출 결과는 서로 '다르다'고 봅니다.

        /*
            지시 사항
            Scanner의 인스턴스를 생성하고
            ClassA의 인스턴스인 classA3를 생성한 다음,
            다음과 같이 실행될 수 있도록 작성

            이름을 입력하세여 >>> 김삼
            번호를 입력하세요 >>> 20250003
            점수를 입력하세요 >>> 4.5   -> Field 정의 필요

            그리고 call1() 유형으로
            displayProfile()을 ClassA에 정의하신 후에
            classA3.displayProfile()을 호출했을 때
            [ 실행 결과 ]
            20250003 학번의 학생의 이름은 김삼이고, 4.5점 입니다.
            가 출력 될 수 있도록 작성
         */
        Scanner scanner = new Scanner(System.in);
        ClassA classA3 = new ClassA();

        System.out.print("이름을 입력하세여 >>> ");
        classA3.name = scanner.nextLine();
        System.out.print("번호를 입력하세요 >>> ");
        classA3.num = scanner.nextInt();
        System.out.print("점수를 입력하세요 >>> ");
        classA3.score = scanner.nextDouble();

        classA3.displayProfile();
    }
}
