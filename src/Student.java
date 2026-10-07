public class Student {
    private String studentID;
    private String studentName;
    private String department;

    public Student(String studentID, String studentName, String department) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.department = department;
    }

    public String getStudentID() { return studentID; }
    public String getStudentName() { return studentName; }
    public String getDepartment() { return department; }

    public void displayStudentInfo() {
        System.out.println("----- Student Info -----");
        System.out.println("ID: " + studentID);
        System.out.println("Name: " + studentName);
        System.out.println("Department: " + department);
    }
}