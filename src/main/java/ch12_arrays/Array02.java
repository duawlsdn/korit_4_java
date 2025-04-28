package ch12_arrays;

public class Array02 {
    public static void main(String[] args) {
        // int 배열 선언 및 초기화
        int[] intArr01 = {1,2,3,4,5,6,7,8,9,10};
        // Array01에서 배열의 element를 출력하는 방법
        int sum = 0;
        // 이상의 변수를 사용하여 배열 element의 합을 구하는 반복문을 작성
        for(int i = 0; i < intArr01.length; i++){
            sum += intArr01[i];
        }
        System.out.println("배열의 합 : "+sum);

        // intArr01에서 짝수만 뽑아서 더하기
        int sumEven = 0;
        // if문
        for(int i = 0; i < intArr01.length; i++){
            if(intArr01[i] % 2 == 0){
                sumEven += intArr01[i];
            }
        }
        System.out.println("짝수의 합 : "+sumEven);

        // 비어있는 배열에(혹은 기존에 값이 있는 배열에) 값을 재대입하는 방법
        int[] intArr02 = new int[100];
//        intArr02[0] = 100;
//        intArr02[1] = 100;
//        intArr02[2] = 100;
//        for(int i = 0; i < intArr02.length; i++){
//            intArr02[i] = 100;
//        }
//        System.out.println(intArr02[99]);

        // intArr02에 다시 값을 재대입
        // 1 ~ 100 까지
        int total = 0;
//        for(int i = 0; i < intArr02.length; i++){
//            intArr02[i] = i+1;
//            total += intArr02[i];
//        }
//        System.out.println("1~100까지의 합 : "+total);
        // 이상의 변수를 사용하여 int arr02의 모든 element의 합을 구하시오.
        int total3 = 0;
        // 이상의 변수를 사용하여 intArr02에서 3으로 나누어 떨어지는 element의 합을 구하시오.
//        for(int i = 0; i < intArr02.length; i++){
//            if(intArr02[i] % 3 == 0){
//                total3 += intArr02[i];
//            }
//        }
//        System.out.println("3의 배수의 합 : "+total3);

        // 이상의 코드 구조를 확인시 동일한 반복문이 3번 쓰였다는 점
        // 이를 축약시키면
//        total = 0;
//        total3 = 0;
        for(int i = 0; i < intArr02.length; i++){
            // 값 대입 영역
            intArr02[i] = i+2;
            // 합 영역
            total += intArr02[i];
            // 3의 배수 합 구하는 조건문 영역
            if(intArr02[i] % 3 == 0){
                total3 += intArr02[i];
            }
        }
        System.out.println("전체 합 : " + total);
        System.out.println("3의 배수의 합 : " + total3);

    }
}
