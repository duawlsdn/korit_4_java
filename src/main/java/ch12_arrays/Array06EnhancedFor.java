package ch12_arrays;
/*
   향상된 for문(Enhanced For Loop)

   일반 for 문과의 차이점 :
        일반 for 문의 경우 인덱스 넘버(주소지)를 명확하게 알고 있어야 하지만 일일이 element의 숫자를 세는 것이 번거롭기 때문에
        배열명.length 와 같은 방식으로 int 값을 추출해서 한계값에 대입

        그런데 잘 생각해 보면 for(int i = 0; ...) 으로 작성할 때 int i 는 for 문의 내부에서 선언됩니다.(일종의 지역변수)

        이를 응용해서 배열내의 element를 변수에 대입하는 지역 변수를 선언하는 방식으로 index 넘버의 사용 없이 바로 적용이 가능한
        for 반복문이 있는데 이를 향상된 for 문이라고 합니다.

        제약 :
            읽기만 되고, 쓰기가 안됩니다.(예를 들어 1부터 100까지 추출하는건 되는데, 1부터 100까지 입력은 불가능할 때가 있음)

        형식 :
        for( 자료형 변수명 : 반복가능개체(배열)) {
            반복실행문
        }
 */
public class Array06EnhancedFor {
    public void printElem(int[] numbers){
        for(int i = 0; i < numbers.length; i++){
            numbers[i] += i+1;
            System.out.print(numbers[i] + " / ");
        }
        System.out.println();
        for(int number : numbers){
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public void printElem(String[] names){
        // 일반 for 문
//        for(int i = 0; i < names.length; i++){
//            System.out.print(names[i] + " / ");
//        }

        // 향상된 for 문
        for(String name : names){
            System.out.println(name + " ");       // 출력문 쓰는 방법의 차이에 주목
        }
    }
    public static void main(String[] args) {
        Array06EnhancedFor array06EnhancedFor = new Array06EnhancedFor();
        int[] numbers = new int[200];
        // 1부터 200까지 대입하시오.

        // for 문을 통해 1 2 3 4 5 ... 200을 출력
//        for(int i = 0; i < numbers.length; i++){
//            numbers[i] += i+1;
//            System.out.print(numbers[i] + " / ");
//        }

        String[] names = {"강미경","김광호","김규철","김대웅","김명규","김민성","김민효","김서준","김선영","김재원","김종보","김호섭","노소정","염진우",
        "예영근","이수원","이진혁","정선유","제다정"};

        // for 문을 통해 이름을 강미경 / 김광호 / 김규철 / 김대웅 ... / 제다정으로 출력
//        for(int i = 0; i < names.length; i++){
//            System.out.print(names[i] + " / ");
//        }

        // printElem(배열) 형태로 메서드 정의 -> int 배열과 String 배열에 다 사용할 수 있도록 method overloading도 적용
        array06EnhancedFor.printElem(numbers);
        System.out.println();
        array06EnhancedFor.printElem(names);
    }
}
