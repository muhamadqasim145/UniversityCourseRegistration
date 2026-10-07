public class Registration {
    private Student student;
    private Course course;

    public Registration(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public void displayRegistration() {
        System.out.println("=================================");
        System.out.println("  OFFICIAL REGISTRATION RECORD   ");
        System.out.println("=================================");
        student.displayStudentInfo();
        course.displayCourseInfo();
        System.out.println("=================================");
    }
}