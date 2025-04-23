package ch07_loops;
/*
    while문을 사용하여
    1 2 3 4 5 6 7 8 9 10
    11 12 13 14 15 16 17 18 19 20
    ...
    91 92 93 94 95 96 97 98 99 100

    이 출력되도록 작성
 */
public class Loop03 {
    public static void main(String[] args) {
        // 1.
        int num = 0;
        while (num < 101){
            System.out.print(num + " ");
            if(num % 10 == 0){
                System.out.println();
            }
            num++;
        }
        System.out.println();
        // 2.
        int num1 = 1;
        int n = 0;
        while (num1 < 101){
            System.out.println(num1 + " " + (num1 + 1)+ " " + (num1 + 2)+ " " + (num1 + 3)+ " " + (num1 + 4)+ " " + (num1 + 5)
                    + " " + (num1 + 6)+ " " + (num1 + 7)+ " " + (num1 + 8)+ " " + (num1 + 9));
            num1 += 10;
        }
    }
}
