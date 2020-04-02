package controller;

import model.Student;

public class StudentController extends PersonController {

    public static final double MINIMUM_SCHOLARSHIP_SCORE = 8.0;

    public void inputData(Student student) {
        super.inputData(student);
        System.out.print("Enter StudentID: ");
        student.setStudentID(scanner.next());
        System.out.print("Enter average Score: ");
        student.setAverageScore(scanner.nextDouble());
        scanner.nextLine();
        System.out.print("Enter Student email: ");
        student.setEmail(scanner.nextLine());
    }

    public void displayData(Student student) {
        super.displayData(student);
        System.out.printf("StudentID: %s \n",student.getStudentID());
        System.out.printf("Average Score: %.2f \n",student.getAverageScore());
        System.out.printf("Email: %s \n", student.getEmail());
        System.out.printf("Is Valid for scholarship: %s \n",isValidForScholarship(student));
    }

    public boolean isValidForScholarship(Student student) {
        if (student.getAverageScore() >= MINIMUM_SCHOLARSHIP_SCORE) {
            return true;
        }
        return false;
    }
}
