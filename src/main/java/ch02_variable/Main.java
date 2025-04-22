package ch02_variable;
/*
    주석(comment) : Java 프로그램의 경우 폴더 및 파일의 전체 코드를 컴파일링하는데,
        거기서 오류가 하나라도 발생하면 전체 프로그램이 실행 X
        하지만 주석 처리를 한 부분에 대해서는 컴퓨터가 코드로 인지하지 않기 때문에 오류가 발생하지 않음

        즉, 주석이란 컴퓨터가 읽어서 처리하는 부분이 아니라 사람이 읽어서 정보를 얻을 수 있는데에 의의

        1) 한 줄 주석 : //
        2) 다중 주석 : / + shift 8 + enter
        3) 사후 주석 : 주석 처리할 부분의 코드라인에 ctrl + /(Mac : command + /)
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("안녕하세요. 제 이름은 염진우입니다.");
//        System.out.println(안녕하세요. 제 이름은 염진우입니다.); -> 오류 발생
        System.out.println(1);              // 1
        System.out.println("1");            // 1
        System.out.println(1 + 2);          // 3
        System.out.println("1 + 2");        // 1 + 2
        System.out.println("1" + "2");      // 12
        System.out.println("1" + 2);        // 12

        // 이상과 같은 방식의 코드 대입을 하드 코딩이라는 표현을 씁니다.
        // 명령문에 데이터(변수에 대입되지 않은 데이터를 리터럴(literal))를 바로 집어넣는 것
        // 데이터를 변수에 대입하고, 변수를 통해서 명령을 내리는 것이 권장됨

        /*
            변수(variable) : 데이터를 담는 바구니 -> 이름표를 달아줘야 함.
            변수 선언 방법 :
                자료형 변수명 = 데이터;
         */

        int scoreEnglish = 100;
        System.out.println(scoreEnglish);

        String introduction = "안녕하세요.가나다라마바사아자차카타파하";
        System.out.println(introduction + " 한글 입니다.");

        // 변수의 의미에 주목해보면 데이터 값이 바뀔 수 있음을 뜻합니다.
        scoreEnglish = 90;
        System.out.println(scoreEnglish);
        // 1. 논리 자료형(boolean) 변수 : 참 / 거짓 (true / false)
        // 자료형 변수명 = 데이터;       변수의 선언 및 초기화
        boolean checkFlag1 = false;
        // 변수에 데이터 재대입
        checkFlag1 = true;

        boolean checkFlag2;         // 변수의 선언
        checkFlag2 = true;          // 변수의 초기화
        checkFlag2 = false;         // 변수의 재대입

        // 2. 문자 자료형 변수 char
        char name1 = '염';
        char name2 = '진';
        char name3 = '우';
        // char -> 문자 , String -> 문자열

        System.out.println(name1 + name2 + name3);
        System.out.println("" + name1 + name2 + name3);
        /*
            이상의 코드에서 알 수 있는 점은 컴퓨터는 생각보다 멍청해서 개발자인 저희가 하나하나 지정을 해줘야 한다는 점입니다.
            문자와 문자열은 서로 다른 개념인데, 문자(하나짜리)를 세 번  더했을 경우에 더이상 문자가 아니라 문자열로 인식되기 때문에
            원하는 방식으로 출력되지 않습니다.

            그렇기 때문에 저희는 에서 sout() 의 () 안에 "" 를 넣어줌으로써, () 내부가 전체적으로 문자"열"로 인식되도록 꼼수를 부림

            여기서 알 수 있는 점은 sout() 에서 가장 먼저 나온 데이터의 자료형을 따라 간다는 점
         */
        System.out.println("123"+ 1);   // 1231
        System.out.println(123+"1");    // 1231 -> 근데 얘가 예외

        // 3. 정수 자료형 변수 (int)
        int width1 = 100;
        int width2 = 200;
        System.out.println(width1 + width2);    // 300 숫자끼리 연산이 가능
        System.out.println(width2 + width1);    // 300
        String width3 = "300";
        String width4 = "400";
        System.out.println(width3 + width4);    // 300400 문자열끼리는 연산이 아니라 나"열"
        System.out.println(width4 + width3);    // 400300

        // 4. 실수 자료형 double
        double pi = 3.1415926;
//        int pi2 = 3.14;
        // + - * /
        // pi 변수를 이용하여 원의 반지름이 43인
        // 원의 둘레 및 넓이를 구하시오. ->
        // 원의 둘레 공식 : 지름 X pi
        // 원의 넓이 공식 : 반지름 제곱 X pi

        // 원의 둘레
        int r1 = 86;
        double answer1 = (double) r1 * pi;
        System.out.println(answer1);

        // 원의 넓이
        int r2 = 43 * 43;
        double answer2 = (double) r2 * pi;
        System.out.println(answer2);

        /*
            Java 에서의 변수 표기 방식 :
                1. 카멜 표기법(Camel case)를 사용
                    : 첫 문자는 소문자로 시작 / 복수의 단어로 이루어졌을 경우
                    두 번째 단어의 첫 번째 문자만 대문자
                    ex) 한 단어 짜리 : result
                    ex) 복수 단어 : myTestResult
                2. 특수 문자 지양

                cf) 파이썬 학습하신 분들은 파이썬의 변수 표기 방식은 snake case 라고 해서 my_test_result 와 같은 방식으로 작성
         */
        // 5. 문자열 자료형 변수 String
        // 주의해야 할 점 : 얘는 대문자인데 나중에 머리 아픈 일들이 생기게 됩니다.
        String name = "염진우";
        String major = "기계공";
        String currentJob = "코리아 IT 아카데미 국비 수강생";
        String previousJop = "술집사장";

        System.out.println(name);
        System.out.println(major);
        System.out.println(currentJob);
        System.out.println(previousJop);
        // 이상과 같이 변수에 대입하고 그 변수를 그대로 출력하는 방법이 가능합니다.
        // 하지만 아까 봤던 것처럼
        System.out.println("안녕하세요 제 이름은 " + name + "입니다. \n제 전공은 " + major + "이고, 그래서 이전 직업은 " + previousJop
            + " 이었습니다. \n현재는 " + currentJob + "을 가지고 있습니다.");
        // 연습
        // 변수를 선언
        String name4 = "염진우";
        String major4 = "기계공학과";
        String mbti4 = "ESTJ";
        int age4 = 30;

        // 저는 코리아 it 아카데미 4월 국비 과정을 수강하고 있는 ... 입니다. ?? 살입니다.
        // 제 전공은 ???? 학과이며, mbti는 ??? 입니다. 열심히 할게요!!!
        // 와 같이 출력되도록 sout 작성
        System.out.println("저는 코리아 it 아카데미 4월 국비 과정을 수강하고 있는 "+ name4 +" 입니다.\n"+ age4 +" 살입니다.\n제 전공은 "+ major4+" 학과이며, MBTI는 " + mbti4 + "입니다. \n열심히 할게요!!!");

        // ch03_operator Operator01
    }
}