package ch07_loops;
/*
        *
       **
      ***
     ****
    *****
    이상의 별찍기를 위해서 고려해야 할 사항
     1. 개행관련
     2. 별찍기 관련
     3. 공백 관련
 */
public class Loop08 {
    public static void main(String[] args) {
        System.out.println("===j++적용===");
        // # 1 풀이 -> j-- 적용
        // 개행 관련 1차 for 문(증가)
            for(int i = 1; i < 6; i++){
                // 공백 관련 2차a for 문
                for(int j = 5; j > i; j--){
                    System.out.print(" ");
                }
                // 별 찍기 관련 2차b for 문
                for(int k = 0; k < i; k++){
                    System.out.print("*");
                }
                // 개행 명령어
                System.out.println();
            }

        System.out.println("\n===j--적용===");
        // # 2 풀이 -> j++ 적용(차감)
        for(int i = 5; i > 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int k = 6; k > i; k--){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 0; i < 6; i ++){
            // 공백 j ++
            for(int j = 0; j < 6 - i; j++){
                System.out.print(" ");
            }
            // 별 찍기
            for(int k = 0; k < i; k++){
                System.out.print("*");
            }
            // 개행
            System.out.println();
        }
    }
}
