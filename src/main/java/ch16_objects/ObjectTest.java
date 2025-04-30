package ch16_objects;
/*
    필드를 전부 private 으로 선언
    String name;
    String address;

    기본 생성자, 매개변수 생성자(하나짜리 한개, 두개짜리 하나) 생성
    ex) 기본 생성자로 객체가 생성되었습니다.
        name 매개변수로 객체가 생성되었습니다.
        name, address 매개변수로 객체가 생성되었습니다. 출력

    getter / setter 를 정의

    displayInfo() 메서드를 call1() 유형으로 정의
    ex)
        이름 : ???
        주소 : ???

    ObjectTestMain 에서 ObjectTest의 객체를 생성하고 이름에 여러분이름, 주소에 여러분 주소를
    입력하고 displayInfo()를 호출하시오.
 */
public class ObjectTest {
    // 필드 선언
    private String name;
    private String address;

    // 생성자
    public ObjectTest() {
        System.out.println("기본 생성자로 객체가 생성되었습니다.");
    }

    public ObjectTest(String name) {
        System.out.println("name 매개변수로 객체가 생성되었습니다.");
        this.name = name;
    }

    public ObjectTest(String name, String address) {
        System.out.println("name, address 매개변수로 객체가 생성되었습니다.");
        this.name = name;
        this.address = address;
    }

    // getter / setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public void displayInfo(){
        System.out.println("이름 : " + getName()+"\n주소 : " + getAddress());
    }


//    public ObjectTest(String address){
//        this.address = address;
//    }
    /*
        이상의 코드가 오류가 발생하는 이유 :
        1. 매개변수와 field는 서로 다른 개념(동일한 자료형이 있을 경우 이해를 불가능)
            호출 상황을 가정 -> ObjectTestMain 에서 객체 생성
        ObjectTest object1 = new ObjectTest("이름");
        ObjectTest object2 = new ObjectTest("주소");
     */

    // Object 클래스의 메서드들을 override

//    @Override
//    public String toString() {
//        return "이름 : " + name +"\n주소 : " + address;
//    }


//    @Override
//    public String toString() {
//        return super.toString();
//    }
}
