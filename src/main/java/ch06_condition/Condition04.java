package ch06_condition;

import java.util.Scanner;
/*
    if - else if - else 문

    형식 :
        if(조건식 1){
            실행문 1
        } else if(조건식 2){
            실행문 2
        } else if(조건식 3){
            실행문 3
        } else {
            실행문 4
        }
 */
public class Condition04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int point;
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
        }else {
            userGrande = "NORMAL";
        }

        System.out.println("회원 등급 : " + userGrande);
    }
}
