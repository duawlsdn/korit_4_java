package ch06_condition;

import java.util.Scanner;

/*
    switch 문
    형식 :
    switch(변수명)
        case 조건 1:
            실행문1
            break;
        case 조건 2:
            실행문2
            break;
        case 조건 3:
            실행문3
            break;
        case 조건 4:
            실행문4
            break;
        default:
            실행문5
 */
public class Condition11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int selectedNum;
        String selectedChar = "";
        System.out.println(" [ 메뉴선택 ] ");
        System.out.println("a. 1번 메뉴");
        System.out.println("b. 2번 메뉴");
        System.out.println("c. 3번 메뉴");
        System.out.println("d. 4번 메뉴");
        System.out.println("e. 5번 메뉴");
        System.out.print("메뉴를 선택하세요 >>> ");
//        selectedNum = scanner.nextInt();
        selectedChar = scanner.next();

        // if 문으로 메뉴를 선택한다고 가정했을 겨우
//        if(selectedNum < 1 || selectedNum > 5){
//            System.out.println("불가능한 메뉴 번호 입니다.");
//        }else {
//            if(selectedNum == 1){
//                System.out.println("메뉴 1을 선택하셨습니다.");
//            }else if(selectedNum == 2){
//                System.out.println("메뉴 2를 선택하셨습니다.");
//            }else{
//                System.out.println("메뉴 5를 선택하셨습니다.");
//            }
//        }
        // 방금까지 배운 조건문이긴 하지만 보기에 편하지는 않습니다. 이상의 코드를 switch 문으로 작성한다고 하면

        switch (selectedChar){
            case "a":
                System.out.println("메뉴 1을 선택하셨습니다.");
                break;      // 조건문을 탈출한다는 의미
            case "b":
                System.out.println("메뉴 2을 선택하셨습니다.");
                break;
            case "c":
                System.out.println("메뉴 3을 선택하셨습니다.");
                break;
            case "d":
                System.out.println("메뉴 4을 선택하셨습니다.");
                break;
            case "e":
                System.out.println("메뉴 5를 선택하셨습니다.");
                break;
            default:        // selectedNum 이 case 에 속하지 않을 때 실행
                System.out.println("잘못된 선택입니다.");
        }
    }
}
