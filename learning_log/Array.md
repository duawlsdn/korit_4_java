# 배열(Array)
## 배열의 필요성
- 여태까지의 수업을 기준으로 했을 때, 10개의 정수형 데이터를 저장하려면 int 변수를 10개 선언해서 저장해야 했습니다.
- 배열은 '같은' 자료형의 데이터를 하나의 변수에 저장해서 처리하는 방식이라고 할 수 있습니다.
## 일반 변수 VS 참조 변수
- 일반 변수 : 데이터를 직접 가지는 변수
    - byte, short, int, double 등 기본 자료형(primitive type)
- 참조 변수 : 데이터가 위치한 주소값을 가지는 변수로 해당 주소를 통해서 데이터에 접근하여 값을 가져오거나 변경하는 경우
    - String, 배열, 객체(클래스), Collections

## 1차 배열 선언 방식
```java
// 자료형[] 배열명 = {값1, 값2, 값3, ..., 값n};
    int[] arr1 = {1,2,3,4,5};

    String[] arr2 = new String[4];
    arr2[0] = "김영";
    arr2[1] = "김일";
    arr2[2] = "김이";
    arr2[3] = "김삼";
```

### 반복문 사용 element 출력
#### 💻사용 예시 & 📃참고 패키지
- ch12_arrays/Array01 ~ 03
```java
for(int i = 0; i < arr1.length; i++){
    System.out.print(arr[i]);    
}

// 역순
for(int i = arr1.length-1; i > -1; i--){
    System.out.print(arr[i]);    
}
```
- `배열명.length` -> 결과값은 `int`이 반환됨, 객체명.속성명과 동일

## method overloading
#### 💻사용 예시 & 📃참고 패키지
- ch12_arrays/Array04
```java
public class Array04 {
    public void printNames(String[] names){
        for(int i = 0; i < names.length; i++){ 
            System.out.print(names[i] + " / "); 
        }
    }

    public void printNames(int[] names){
        for(int i = 0; i < names.length; i++){
            System.out.print(names[i] + " / "); 
        }
    }

    public static void main(String[] args) {
        Array04 array04 = new Array04();
        array04.printNames(names);

        String[] strArr01 = {"10","9","8","7","6","5"};
        array04.printNames(strArr01);
        int[] intArr01 = {3,4,5,6,7,8,9,10};
        array04.printNames(intArr01);
    }
}
```
### 정의
- 매개변수의 형태가 다르면 동일한 메서드명을 가지고 정의할 수 있는 기능으로, 동일한 기능을 하지만(이상의 경우처럼 배열의 element를 출력하는 식의) 매개변수가 다른 경우 이전에는 메서드명을 하나하나 다르게 지정해줘야만 했습니다.
- 하지만 overloading의 개념이 도입되고 나서는 메서드명에 대한 고민 필요 없이 `소괄호()`내의 부분을 수정해주면 코드를 그대로 재사용할 수 있다는 점에서 코드의 재사용성 및 유지보수성의 증진을 가져왔습니다.
### 장점
- 동일한 기능을 하는 메서드를 정의할 때 메서드명이 필요한데, 예를 들어 *String 자료형끼리 연결해주는 메서드*와 *int 끼리 합 연산을 하는 메서드*를 나누었을 때, 그리고 *double 끼리 합 연산*을 하거나 *double과 int를 합 연산을 하는 메서드*가 있다고 가정한다면 add, plus, connect 등의 메서드 명으로 정의했다면 그 다음 메서드는 또 뭘 써야 할까요?
- 이상의 문제를 해결하기 위해 메서드명은 동일하지만 매개변수를 다르게하면 알아서 매개변수에 맞는 메서드를 실행시킬수 있게끔 하는 것이 method overloading 으로 객관식 시험에서 장점 기준으로 자주 나오는 편
- 저희는 이상의 코드블록에서 printNames 라는 메서드의 매개변수를 String[] 배열과 int[] 배열 두가지로 작성

## 다차원 배열 선언 방식
```java
int[][] arr01 = new int[크기][크기];    // - 선언 방식 # 1
int[][] arr02 = new int[크기][];       // - 선언 방식 # 2
int[][] arr03 = {{1,2},{3,4},{5,6}};  // - 선언 방식 # 3 및 초기화

1열  2열(Colum)            → 세로줄을 열
  ↓   ↓
{ 1 , 2 }, → 1행(row)      → 가로줄을 행
{ 3 , 4 }, → 2행(row)
{ 5 , 6 }  → 3행(row)
```

### for 문과 향상된 for 문으로 element 출력 방식
```java
for(int[] arr031 : arr03){
    System.out.println(arr031);
    for(int arr0311 : arr031){
        System.out.println(arr0311);
    }
}

System.out.println("=== 이하는 일반 for 문으로 작성");
for(int i = 0; i < arr03.length; i++){
    System.out.println(arr03[i]);
    for(int j = 0; j < arr03[i].length; j++){
        System.out.println(arr03[i][j]);
    }
}
```

### 다차원 배열의 element 입력(for 문)
```java
int[][] nums = new int[20][5];
int num = 0;
// 이상의 2차 배열에 1 ~ 100 까지의 값을 집어 넣으시오.
// Arrays.deepToString(nums);를 통해 출력하시오.
/*
    실행 예
    [1,2,3,4,5],
    [6,7,8,9,10],
    [11,12,13,14,15],
    ...
    [..., 100]
 */
for(int i = 0; i < nums.length; i++){
    for(int j = 0; j < nums[i].length; j++){
        nums[i][j] += ++num;
    }
}
// 다차원 배열 출력
System.out.println(Arrays.deepToString(nums));

// 향상된 for문
for(int[] numbers : nums){
    for(int number : numbers){
        System.out.print(number + " / ");
    }
}
```

## 배열 전체 String 형태로 출력하는 방법
```java
// 1차 배열 하나 생성
String[] students = {"김영","김일","김이","김삼"};
// 2차 배열 하나 생성
double[][] scores = {
    {100.0 , 96.4},
    {64.2 , 79.3},
    {48.1 , 99.8},
    {80.2 , 4.5}
};

// 1차 배열의 출력
System.out.println(Arrays.toString(students));      
// 결과값 : [김영, 김일, 김이, 김삼]

// 다차원 배열의 출력
System.out.println(Arrays.deepToString(scores));    
// 결과값 : [[100.0, 96.4], [64.2, 79.3], [48.1, 99.8], [80.2, 4.5]]
```

## Arrays.sort()
```java
Integer[] nums = {8, 6, 4, 2, 1, 7, 9, 5, 10, 3};

System.out.println("정렬 전 : " + Arrays.toString(nums));

Arrays.sort(nums);
System.out.println("오름차순 : " + Arrays.toString(nums));

Arrays.sort(nums, Comparator.reverseOrder());
System.out.println("내림차순 : " + Arrays.toString(nums));
```
- int는 기본 자료형에 해당 primitive type
- `Integer`는 정수 관련한 field 및 method 들을 모아둔 class에 해당
- `String`은 char 자료형들의 특징들을 모아서 field / method 들을 정리해둔 것