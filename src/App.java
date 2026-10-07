public class App {
    public static void main(String[] args) throws Exception {
   Student student1 = new Student("S101", "Alice Smith", "Computer Science");
        Course course1 = new Course("CS201", "Data Structures", 3);

        Registration reg1 = new Registration(student1, course1);
        reg1.displayRegistration();
    }
}
