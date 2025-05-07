package ch20_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StrList {
    public static void main(String[] args) {
        // 비어있는 List 생성 방법
        List<String> strList1 = new ArrayList<>();
        // 배열과의 차이점도 볼 필요 가있음
        String[] strArray1 = new String[2]; // 배열은 인덱스 넘버를 고정시켜야 함.
        // 배열에 element를 넣는 방법
        strArray1[0] = "김영";
        // List에 element를 넣는 방법 -> 배열과 달리 method를 통해서 element를 넣어야 함
        strList1.add("Java");
        strList1.add("Python");
        strList1.add("C#");
        strList1.add("JavaScript");
        strList1.add("Kotlin");

        // 출력
        System.out.println(strArray1);                  // 참조자료형이라서 주소값이 출력
        System.out.println(Arrays.toString(strArray1)); // 배열은 출력하기 위해 static method를 경유해야 함
        System.out.println(strList1);

        // 특정 element의 포함 여부 -> contains() 메서드를 사용 -> return boolean
        String searchElem1 = "Python";                      // 하드코딩을 피하기 위해 변수 대입
        boolean contains1 = strList1.contains(searchElem1);  // elem 이란 표현은 element의 축약어로 자주 쓰임
        System.out.println(searchElem1 + "의 포함 여부 : " + contains1);

        String searchElem2 = "Py";
        boolean contains2 = strList1.contains(searchElem2);
        System.out.println(searchElem1 + "의 포함 여부 : " + contains2);

        String email = "a@Test.com";
        boolean contains3 = email.contains("@");
        System.out.println("@의 포함 여부 : " + contains3);
        // String의 경우는 char들이 '순서대로' 나열된 것이기 때문에 char 하나가 포함된 것을
        // contains() 메서드를 통해 부분 검색이 가능하지만,
        // searchElem2의 경우(즉, List의 element)는 '완전히' 일치하는지를 확인하기 때문에
        // "Python" 포함 여부는 true / "Py" 포함 여부는 false 가 출력

        // 특정 element의 삭제 -> remove() -> return type boolean
        String removeElem1 = "Kotlin";
        boolean removed1 = strList1.remove(removeElem1);
        System.out.println(removeElem1+"의 삭제 여부 : " + removed1);
        System.out.println(strList1);

        // 마찬가지로 .remove() 역시 element 전체가 일치하는지를 확인하기 때문애
        // element의 일부만 가지고 삭제하는 것이 불가능합니다(일부로 element 전체 삭제 불가능,
        // 또한 removeElem2 = "Py"로 했을 때
        // sout(strList1)의 결과값 중 element로 "Py"만 삭제하고 "thon"만 남는 것이 불가능

        String removeElem2 = "Py";
        boolean removed2 = strList1.remove(removeElem2);
        System.out.println(removeElem2 + "의 삭제 여부 : " + removed2);
        System.out.println(strList1);

        // List의 정렬 -> 배열과 동일
        Collections.sort(strList1);     // 마찬가지로 원본 배열을 다 바꿉니다.(index가 바뀜)
        System.out.println("정렬된 List : " + strList1);

        Collections.sort(strList1, Collections.reverseOrder());
        System.out.println("역순 정렬된 List : " + strList1);

        // 배열과 유사하게 element 들을 다 뽑을 있음
        // python 언어 java 언어 JavaScript 언어 C# 언어 로 출력 될 수 있도록 작성
        // 참고 : strList1.length는 안먹습니다.
        // 일반 for 문
//        for(int i = 0; i < strList1.size(); i++){
//            System.out.print(strList1.get(i) + "언어 ");
//        }
        // 이상의 코드에서 알 수 있는 점은 배열과는 달리 한계값을 출력하기 위해서 리스트명.size()를 사용
        // 출력할 때도 리스트명.get(i)를 썼다는 점입니다.
        // 배열의 경우 배열명.length, 배열명[i]를 사용

        // 향상된 for 문
        for(String str : strList1){
            System.out.print(str + "언어 ");
        }



    }
}
