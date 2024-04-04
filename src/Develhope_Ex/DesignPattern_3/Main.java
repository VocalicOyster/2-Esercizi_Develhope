package Develhope_Ex.DesignPattern_3;

public class Main {
    public static void main(String[] args) {
        User user1  = new User();
        User user2  = new User();

        System.out.println(user1);

        user2.setNome("Claudia");
        user2.setEta(24);

        System.out.println(user2);
    }
}
