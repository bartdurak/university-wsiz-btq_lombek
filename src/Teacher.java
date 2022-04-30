public class Teacher extends User   {

   private String priacademicDegree;
   public Teacher (String firstName, String lastName, String email, String password,
                   String academicDegree)
   {
       super (firstName, lastName, email, password );
       this.academicDegree = academicDegree;
   }
}
