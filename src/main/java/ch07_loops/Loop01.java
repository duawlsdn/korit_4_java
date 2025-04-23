package ch07_loops;
/*
    while 반복문
    형식 :
    while(조건식) {
        반복실행문
    }
    while 뒤에 나오는 (조건식)을 봤을 때 if(조건식) 형태와 유사
    즉, while() 내의 조건식이 true 일때, {} 내의 실행문이 '반복적으로' 이루어짐

    그래서 주의할점이 있는데
    while 내부의 조건식이 특정 시점에 false가 되도록 미리 지정해둘 필요가 있음

    false가 되는 시점을 지정해주지 않는다면 무한히 반복실행문이 실행된다는 점에서 무한루프(infinite loops)라는 표현을 씀
 */
public class Loop01 {
    public static void main(String[] args) {
        int i = 0;
        while ( i < 100 ) {
            i++;
            System.out.println(i);
            System.out.println(++i);
        }

//        int j = 1;
//        while (j < 101){
//            System.out.println(j++);
//        }

        // while 문도 중첩이 일어날 수 있습니다.
        /*
            while(조건식1) {
                반복실행문1a
                while(조건식2){
                    반복실행문2
                }
                반복실행문 1b
            }

            그러다보니까 while 과 if를 섞어서도 쓸 수 있습니다.
         */

        int sum = 0;
        int k = 1;
        //예를 들어 1부터 100까지 더하도록 하겠습니다.
//        while (k < 101){
//            sum += k;
//            k++;
//        }
//        System.out.println(sum);

        //응용 -> 1부터 100까지 중 짝수만 구하는 while 반복문을 작성
        // # 1 if 문을 활용한 짝수 합 구하기
//        while (k < 101){
//            if(k % 2 == 0){
//                sum += k;
//            }
//            k++;
//        }
//        System.out.println(sum);

        // # 2 +=2 를 활용한 짝수합 구하기
        int q = 2;
        while (q < 101){
            sum += q;
            q += 2;
        }
        System.out.println(sum);
    }
}
