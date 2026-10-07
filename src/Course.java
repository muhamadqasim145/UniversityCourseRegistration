public class Course {
    private String courseCode;
    private String courseTitle;
    private int creditHours;

    public Course(String courseCode, String courseTitle, int creditHours) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.creditHours = creditHours;
    }

    public String getCourseCode() { return courseCode; }
    public String getCourseTitle() { return courseTitle; }
    public int getCreditHours() { return creditHours; }

    public void displayCourseInfo() {
        System.out.println("----- Course Info -----");
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Title: " + courseTitle);
        System.out.println("Credit Hours: " + creditHours);
    }
}