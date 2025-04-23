package ch06_condition;

import java.util.Scanner;

/*
    if - else if문 : if - else문과 달리 else if 에는 별도의 조건식이 요구됨 그리고 else if는 여러 개 나올 수 있음

        형식 :
        if(조건식1){
            실행문1
        } else if(조건식2){
            실행문2
        } else if(조건식3){
            실행문3
        }
 */
public class Condition03 {
    public static void main(String[] args) {
        // Scanner import
        Scanner scanner = new Scanner(System.in);

        // 변수/상수의 선언 및 초기화
        int point;
        final int VIP_POINT = 80;       // final 키워드가 붙으면 재대입 불가능
        final int GOLD_POINT = 60;      // 즉 변함없는 데이터를 사용하고 싶을 때
        final int SILVER_POINT = 40;    // 사용하는데, 얘가 변함없는 데이터라는 것을
        final int BRONZE_POINT = 20;    // 개발자들이 알아보기 위해 대문자로만 작성

//        System.out.print("등급 포인트를 입력하세요 >>> ");
//        point = scanner.nextInt();
//        if(point > 80) System.out.println("회원 등급 : VIP");
//        else if(point > 60) System.out.println("회원 등급 : GOLD");
//        else if(point > 40) System.out.println("회원 등급 : SILVER");
//        else if(point > 20) System.out.println("회원 등급 : BRONZE");
//        else if(point <= 20) System.out.println("회원 등급 : NORMAL");

        // 반복되는 부분이 너무 많아서 리팩토링
        // 등급을 저장하는 변수를 하나 선언
        String userGrande = "";
        System.out.print("등급 포인트를 입력하세요 >>> ");
        point = scanner.nextInt();

        if(point > 80) {
            userGrande = "VIP";
        }else if(point > 60) {
            userGrande = "GOLD";
        }else if(point > 40) {
            userGrande = "SILVER";
        }else if(point > 20) {
            userGrande = "BRONZE";
        }else if(point <= 20) {
            userGrande = "NORMAL";
        }
        System.out.println("회원 등급 : " + userGrande);

        //if - else / if - else if 문의 경우 전체가 한 세트의 조건문으로 볼 필요가 있습니다.
    }
}
