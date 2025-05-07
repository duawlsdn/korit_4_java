package ch20_collections;

import java.util.*;

public class StrMap {
    public static void main(String[] args) {
        Map<String, String> strMap1 = new HashMap<>();

        // Map에 key - value 쌍 삽입 -> .put(키, 값);
        strMap1.put("kor2025001","김일");
        strMap1.put("kor2025002","김이");
        strMap1.put("kor2025003","김삼");
        strMap1.put("kor2025004","김사");
        strMap1.put("kor2025005","김오");

        // Map 출력
        System.out.println(strMap1);

        strMap1.put("kor2025005", "KimFive");
        System.out.println(strMap1);
        // Map의 특징 중 하나로 하나의 key 에는 하나의 value만 가능
        // 그래서 key 값이 동일하다면 value 값은 최신 것으로 덮어쓰기 됩니다.

        // List의 경우에 특정 인덱스를 조회하고 싶다면
        // 리스트명.get(인덱스 넘버); 의 형태로 확인할 수 있었습니다.
        // Map의 경우는 순서는 없는대신 key가 있기 때문에

        // 특정 key 의 value 조회
        System.out.println(strMap1.get("kor2025002"));
        // 이상과 같은 방법으로 출력이 가능합니다. -> value만 나오죠

        // Java -> Map 에서의 key-value pair를 entry 라고 칭합니다.

        // 특정 키의 값 수정 # 1 -> 아까 본 것 처럼 .put(키)를 통해 덮어쓰기
        strMap1.put("kor2025001", "KimOne");
        System.out.println(strMap1.get("kor2025001"));

        // 특정 키의 값 수정 # 2 -> .replace();
        strMap1.replace("kor2025002","KimTwo");
        System.out.println(strMap1.get("kor2025002"));

        // 특정 키의 존재 여부 -> containsKey(); -> boolean
        boolean searchKeyFlag1 = strMap1.containsKey("kor2025006");
        System.out.println("kor2025006 존재 여부 : " + searchKeyFlag1);

        // 특정 값 존재 여부 -> containsValue(); -> boolean
        boolean searchValueFlag1 = strMap1.containsValue("김삼");
        System.out.println("김삼 존재 여부 : " + searchValueFlag1);

        // Map의 엔트리로 부터 Set을 생성
        Set<Map.Entry<String, String>> entrySet1 = new HashSet<>();     // 비어있는 Set 생성
        Set<Map.Entry<String, String>> entrySet2 = strMap1.entrySet();  // Map의 element를 Set에 삽입
        System.out.println(entrySet1);
        System.out.println(entrySet2);
        System.out.println(entrySet2.size());   // 5가 출력된다는 점에서 'key 값 = value 값'이 하나의 element로 잡힘.

        List<Map.Entry<String, String>> entryList1 = new ArrayList<>();
//        List<Map<String, String>> entryList2 = strMap1.entrySet();    // Map -> List 대입이 불가능하다는 걸 보여주는 예시
        // 결국 Map에서 List로의 형변환을 하고 싶다면 Set을 경우
        entryList1.addAll(entrySet2);

        // 그러면 sort가 가능

        // Key Set 출력
        Set<String> keySet = strMap1.keySet();  // 그러면 key의 자료형과 Set의 제네릭 자료형이 같아야 겠죠
        System.out.println(keySet);

        // Value Set 출력
        // Set<String> valueSet = strMap1.values();    // 오류 발생 예시 -> 필요한 타입 Set / 제공된 타입 Collection
        // 이상에서 문제가 발생하는 이유는 Key는 어차피 중복을 허용하지 않기 때문에 Set으로 형변환이 가능한 반면
        // 복수의 Key에서 동일한 value가 존재할 수 있기 때문에 Set으로 생성하는 것이 불가능
        Collection<String> values = strMap1.values();
        System.out.println(values);

    }
}
