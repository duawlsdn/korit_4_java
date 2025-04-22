package ch04_scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        // 변수 선언
//        String name;
//        name = "염진우";

        Scanner scanner = new Scanner(System.in);
//        System.out.print("이름을 입력해 주세요!>>>");
//        String name = scanner.nextLine();
//        System.out.println("나의 이름은 " + name);
        /*
            System.out.println()의 경우 실행하고 나서 개행(enter키 누른거 / 줄바꿈)이 이루어짐
            ln : line new
            System.out.print()로 쓰면 개행 안이루어짐
         */

        System.out.print("올해는 몇 년도 인가요? >>>");
        int year = scanner.nextInt();
//        scanner.nextLine();                 // 엔터키를 대신 받아주는 배리어 역할
        System.out.print("당신의 이름은? >>>");
        String name = scanner.nextLine();
        System.out.println("년도 : "+year);
        System.out.println("이름 : "+name);

        /*
            nextLine() vs next...() (Int, Double, ... etc)
            newLine()은 띄어쓰기를 허용하고 enter키를 누른것을 기준으로(즉, 개행을 기준으로) 데이터를 대입함
            반면 나머지는 띄어쓰기를 허용하지 않고 사용됨

            이상을 이유로 next..() 를 먼저 쓰고, 그 다음에 nextLine()을 사용했다고 가정하면 생기는 문제가 있습니다.

            next... 다음에 여러분이 엔터티를 때려버리면 그 다음 줄에 있는 nextLine()이 enter 키가 입력된걸 보고
            아무런 값도 집어넣지 않고 바로 넘겨버리는 현상이 생김

            해당 문제 상황을 해결하기 위한 방법 :
            nextLine()이 미리 enter 키를 받아들여서 name에 아무런 값도 입력하지 않고(대입하지 않고) 씹고 지나가는 상황이라고 할 수 있음

            -> enter키를 한 번 받아주는 애가 있으면 됩니다.

            자 그런데, 아까 전에 정리한거 기준으로
            선언된 변수의 자료형에 따라 scanner.next..()가 자동으로 생성됩니다.
         */
//        System.out.print("대학을 입력하세요>>>");
//        String univ = scanner.next();
//        System.out.println(univ);
        // String 데이터를 입력할 때는 .next()와 .nextLine() 두 가지 사용 가능
        // 차이점은 여러분이 .md 파일에 정리하시기 바랍니다.
        // 배리어 관련 정도는 블로그에 올라가도 괜찮습니다.
//        System.out.print("키를 입력하세요>>>>");
//        double height = scanner.nextDouble();
//        System.out.println(height);

        /*
            1. 다음과 같이 콘솔에 출력될 수 있도록 코드를 작성하시오
            나이를 입력하세여 >>> 19
            저는 올해 19살 입니다.
            내년에는 20살이 됩니다.

            2. 다음과 같이 콘솔에 출력될 수 있도록 코드를 작성하시오
            점수를 입력하세요 >>> 4.5
            이름을 입력하세요 >>> 김일
            김일 학생의 점수는 4.5입니다.
         */
        // 1. 풀이
//        System.out.print("나이를 입력하세요 >>> ");
//        int age = scanner.nextInt();
//        System.out.println("저는 올해 " + age + "살 입니다.\n내년에는 " + ++age + "살이 됩니다.");

        // 2. 풀이
//        System.out.print("점수를 입력하세요 >>> ");
//        double score = scanner.nextDouble();
//        scanner.nextLine();
//        System.out.print("이름을 입력하세요 >>> ");
//        String name = scanner.nextLine();       // -> 배리어 부분(76번 라인) 지우고 String name = scanner.next(); 로도 가능!
//        System.out.println(name + " 학생의 점수는 " + score + "입니다.");

        // Scanner02 -> main
    }
}
