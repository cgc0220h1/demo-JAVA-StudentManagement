package model;

public class Student extends Person {
    private String studentID;
    private double averageScore;
    private String email;

    public Student(String name, boolean gender, int[] birthDate, String address, String studentID, double averageScore, String email) {
        super(name, gender, birthDate, address);
        this.studentID = studentID;
        this.averageScore = averageScore;
        this.email = email;
    }

    public Student(String studentID, double averageScore, String email) {
        this.studentID = studentID;
        this.averageScore = averageScore;
        this.email = email;
    }

    public Student() {}

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
