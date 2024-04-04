package Develhope_Ex.DesignPattern_2;

public class Main {
    public static void main(String[] args) {
        PersonBuilder builder = new PersonBuilder();
        builder.setNome("Giovanni");
        builder.setCognome("Innaimi");
        Person persona1 = builder.build();

        PersonBuilder builder1 = new PersonBuilder();
        builder.setNome("Giovanni");
        builder.setCognome("Battista");
        builder.setEta(24);
        Person persona2 = builder.build();

        System.out.println(persona1);
        System.out.println(persona2);

    }
}
