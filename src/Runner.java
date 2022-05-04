public class Runner {

    public static void main(String[] args) {
        System.out.println("test");
        Student student1 = new Student("Rysiek", "Zielak", "zileak@o2.pl","hasLostuden", 778323);
        Teacher teacher1 = new Teacher("Goska", "Janus", "goska@o2.pl "," hasLonauczyciel ", "technik");
FileUserRepository fileUserRepository = new FileUserRepository();

        System.out.println(student1);
        System.out.println(teacher1);
    }
}
