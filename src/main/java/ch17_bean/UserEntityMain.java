package ch17_bean;

public class UserEntityMain {
    public static void main(String[] args) {
        UserEntity userEntity1 = new UserEntity();
        userEntity1.setUsername(1);
        userEntity1.setPassword(9876);
        userEntity1.setEmail("a@test.com");
        userEntity1.setName("염진우");

        System.out.println(userEntity1);

        UserEntityLombok user2 = new UserEntityLombok();
        user2.setUsername(2);
        user2.setPassword(9876);
        user2.setEmail("b@Test.com");
        user2.setName("김이");

        System.out.println(user2);
    }
}
