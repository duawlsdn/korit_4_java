package ch21_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@ToString
class User{
    private String username;
    private String password;
    private String email;
    private String name;
    private String age;
}

public class JSON2 {
    public static void main(String[] args) {
        // 사용할 객체 생성
        Gson gson = new Gson(); // 아까랑 다르게 그냥 Gson 인스턴스를 생성
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        // 아까와 동일하게 gsonBuilder를 통해서 prettyPrinting이 적용 될 수 있도록 인스턴스 생성

        // 사용할 변수 선언
        String userJson = null;

        // 1. Java Object -> json 으로 변환
        // user1 객체를 생성하고 "kim1","9876","a@test.com","김일","20"로 입력
        // Lombok -> @Setter 방법, @AllArgsConstructor 방법
        // Lombok
        User user1 = new User("kim1","9876","a@test.com","김일","20");
        // 그럼 생성된 user1 인스턴스를 가지고 Json 데이터로 변환
        userJson = gson.toJson(user1);
        System.out.println("Gson 사용 결과값 : "+userJson);
        userJson = gsonBuilder.toJson(user1);
        System.out.println("GsonBuilder 사용 결과값 : "+userJson);

        // 2. JsonObject -> json 으로 변환 근데 JSON1에서 했던 것
        // JsonObject를  활용하여 studentCode 2025001 / studentName 김이 / studentYear 2 / score 96.7 인 객체를 생성
        // 참고로 key value 다 String 으로 삽입
        // JsonObject 클래스의 인스턴스 생성
        JsonObject jsonObject1 = new JsonObject();
        jsonObject1.addProperty("studentCode","2025001");
        jsonObject1.addProperty("studentName", "김이");
        jsonObject1.addProperty("studentYear", "2");
        jsonObject1.addProperty("score" ,"96.7");

        // gson 및 gsonBuilder 를 이용하여 studentJson을 두 번 출력한 결과값을 콘솔창에 띄울 수 있도록 하시오.
        String studentJson = gson.toJson(jsonObject1);
        System.out.println(studentJson);
        studentJson = gsonBuilder.toJson(jsonObject1);
        System.out.println(studentJson);

        // 3. Map -> Json 데이터로
        /*
            Map을 활용하여 key String / value String 으로 선언하고, 객체명을 map1으로 한 빈 map을 생성

            map에 productCode NT960XHA-KD72G
            productName 삼성 갤럭시북 프로 5
            라는 Entry(key-value pair)를 입력

            gson 및 gsonBuilder 를 활용하여 json 데이터로 바꿀겁니다.
         */
        Map<String, String> map1 = new HashMap<>();
        map1.put("productCode","NT960XHA-KD72G");
        map1.put("productName","삼성 갤럭시북 프로 5");

        System.out.println("gson 사용 사례 : " + gson.toJson(map1));
        System.out.println("gsonBuilder 사용 사례 : " + gsonBuilder.toJson(map1));
        String productJson = gsonBuilder.toJson(map1);      // 하는 김에 Json 데이터들의 자료형이 전부 String인 것에 주목

        // 그렇다면 json -> Map / Java 객체 자료형으로 변형하려면 어떻게 해야할까요?
        // 즉 json 데이터를 user 객체로 다시 바꾸는 것과
        // json 데이터를 map2형태로 작성하는 것을 의미함
        // 형식 :
        // gson.fromJson(제이슨데이터, 바꾸고자하는_클래스명.class);

        // json -> map
        Map<String, String> map2 = gson.fromJson(productJson, Map.class);   // gsonBuilder.toJson(map1)이든 gson.toJson(map1)이든 상관 없음
        System.out.println("Map 형태로 출력 : " + map2);

        // json -> User 클래스의 인스턴스로 바꾸는 방법
        User user2 = gson.fromJson(userJson, User.class);
        System.out.println(user2);

        // json -> jsonObject : 이게 의미하는 바는 json 데이터 =/= jsonObject 입니다.
        // studentJson의 자료형은 String 이고, jsonObject1의 자료형은 JsonObject 입니다.
        JsonObject jsonObject2 = gson.fromJson(studentJson, JsonObject.class);
        System.out.println(jsonObject2);
    }
}
