package ch07_loops;

import java.util.Scanner;

/*
    for 반복문(for loop)
    : 대부분의 경우에 명확한 횟수가 고정되어 있을 때 사용하는 반복문

    형식 :
    for(시작값; 종료값; 증감값) {
        반복문
    }
 */
public class Loop04 {
    public static void main(String[] args) {
        // 1부터 100까지의 합을 구하는 for 문
//        int sum = 0;
//        for(int i = 0; i < 101; i++){
//            sum += i;
//        }
//        System.out.println(sum);

        // 1부터 100까지 중 홀 수 합을 구하는 for문을 작성(즉, for문 내에 if가 중첩 가능)
//        int sum2 = 0;
//        for(int i = 0; i < 101; i++){
//            if(i % 2 != 0){
//                sum2 += i;
//            }
//        }
//        System.out.println(sum2);
//
//        int sum3 = 0;
//        for(int i = 1; i < 101; i+=2){
//            sum3 += i;
//        }
//        System.out.println(sum3);

        /*
            숫자를 입력 받아서 1부터 n까지 더하는 반복문을 작성할 겁니다.

            실행 예
            1부터 몇까지 더하시겠습니까? >>> 10
            1부터 10까지의 합은 55입니다.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("1부터 몇까지 더하시겠습니까? >>> ");
        int len = scanner.nextInt();
        int sum = 0;
        for(int i = 1; i < len+1; i++){
            sum += i;
        }
        System.out.println("1부터 "+len+"까지의 합은 "+sum+"입니다.");


    }
}
