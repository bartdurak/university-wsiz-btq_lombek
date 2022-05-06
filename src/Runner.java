
public class Runner {

    public static void main(String[] args) {
        //       System.out.println("test");
test();
        LoginForm loginForm = new LoginForm();
        loginForm.initialize();
    }
     private static void test() {
        Student student1 = new Student("Rysiek", "Zielak", "zileak@o2.pl", "hasLostuden", 778323);
        Teacher teacher1 = new Teacher("Goska", "Janus", "goska@o2.pl ", " hasLonauczyciel ", "technik");


       /* FileUserRepository fileUserRepository = new FileUserRepository();


        System.out.println(student1);
        System.out.println(teacher1);
        System.out.println(fileUserRepository.findAll());
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ===== EKRAN LOGOWWANIA===== ");
        System.out.println("Podaj hasło: ");
        String password = scanner.nextLine();

        User loggedUser = fileUserRepository
                .findByEmailAndPassword(email, password);
        if (loggedUser != null) {
            System.out.println(" Zalogowano jako " + loggedUser);
        } else {
            System.out.println(" Dane nieprawidłowe");

        } */
    }
}