package ch16_objects;

public class ObjectTestMain {
    public static void main(String[] args) {
        ObjectTest objectTest1 = new ObjectTest("염진우","주소");
        objectTest1.displayInfo();
        System.out.println(objectTest1);


        Teacher teacher = new Teacher("김일","toString()");
        System.out.println(teacher);
    }
}
