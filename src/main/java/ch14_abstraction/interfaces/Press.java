package ch14_abstraction.interfaces;

public interface Press {
    String NAME = "button";
    /*
        interface 이기 때문에 변수 앞에 접근 지정자를 명시하지 않았지만
        public final에 해당합니다. 또한 상수이기 때문에 상수명을 나타내는 'NAME' 으로 작성하였고,
        일반 클래스의 field 선언 처럼 String name;으로 작성하는 것이 불가능 합니다.

        나중에 깃허브 확인학실때 보게 안되는 것들 나열
     */
    // 안되는 사례
//    String name;
//    public Press() {};
//    void popOut() {
//        System.out.println("추상 메서드만 가능/ 일반 메서드 불가능 예사");
//    }

    // 되는 사례
    void onPressed();   // 아무 표시도 안했지만 abstract 입니다.

    // interface 인 Up.java / Down.java 생성
    // void 형태인 onUp() / onDown() 메서드를 선언
}
