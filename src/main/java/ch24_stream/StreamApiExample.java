package ch24_stream;

import java.util.Arrays;
import java.util.List;

// Stream API에 딸려있는 주요 메서드 예제 설명
public class StreamApiExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("김영","김일","김이","김삼","김사","최오","최육","최칠");

        // filter();
        List<String> namesWithKim = names.stream()
                .filter(name -> name.startsWith("김"))
                .toList();  // to... 메서드가 실행되었다는 말은, 걔 이전의 자료형이 절대 List가 아니라는 점

        System.out.println(names);
        System.out.println(namesWithKim);

        // 사실 filter 는 그 자체로 한 방에 쓰이기 보다는 합쳐서 쓰입니다.
        // filter / map / sorted / collect
        List<String> englishNames = Arrays.asList("alice","anya","bacon","camel","pascal","yor","spy","family");
        List<String> result = englishNames.stream()
                // 여기 사이에 다양한 메서드들 쓰라는 의미(마치 Builder 패턴 사용할 때 .build()가 자동 생성됐었던 것 처럼)
                .filter(name -> name.startsWith("a")) // "a"로 시작하는 element만 추출
                .map(String::toUpperCase)                   // 이상의 결과값으로 "a"로 시작하는 걸 뽑았는데, 대문자로 변환
                .sorted()                                   // 정렬입니다 sort()가 아님
                .toList();

        System.out.println(englishNames);
        System.out.println(result);

        // count()
        int count = englishNames.size();    // element의 전체 개수를 세는 것만 가능
        System.out.println(count);

        long count2 = englishNames.stream().filter(name -> name.length() > 3).count();
        System.out.println(count2);

        int count3 = 0;
        for(String name : englishNames){
    //  for(int i = 0; i < englishNames.size(); i++){

            if(name.length() > 3){
    //      if(englishNames.get(i).length() > 3){

                count3++;
            }
        }
        System.out.println(count3);



    }
}
