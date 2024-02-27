package Develhope_Ex;

public class EsObject1 {
    public static void main(String[] args) {

        Student firstStudent = new Student("Giovanni Battista", "Innaimi", "G24fb00");
        System.out.println("name: " + firstStudent.getName() + " " + firstStudent.getSurname());
        System.out.println("ID: " + firstStudent.getId());
    }

    public static class Student {
        private String name;
        private String surname;
        private String id;

        public Student(String name, String surname, String id) {
            this.name = name;
            this.surname = surname;
            this.id = id;
        }

        //GETTER METOD FOR NAME
        public String getName() {
            return name;
        }

        //GETTER METOD FOR SURNAME
        public String getSurname() {
            return surname;
        }

        //GETTER METOD FOR ID
        public String getId() {
            return id;
        }
    }
}
