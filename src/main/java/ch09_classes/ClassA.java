package ch09_classes;

import java.util.Scanner;

public class ClassA {
    int num;
    String name;
    double score;

    public void callName() {
        System.out.println(name + "을 부릅니다.");
    }

    public void displayProfile(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("이름을 입력하세여 >>> ");
//        String name = scanner.nextLine();
//        System.out.print("번호를 입력하세요 >>> ");
//        int num = scanner.nextInt();
//        System.out.print("점수를 입력하세요 >>> ");
//        double score = scanner.nextDouble();
        System.out.println("[ 실행 결과 ]");
        System.out.println(num+"학번의 학생의 이름은 "+name+"이고, "+score+"점 입니다.");
    }
}