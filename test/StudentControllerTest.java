import controller.StudentController;
import model.Person;
import model.Student;

public class StudentControllerTest {
    public static void main(String[] args) {
        Student student = new Student();
        StudentController controller = new StudentController();
        controller.inputData(student);
        controller.displayData(student);
    }
}
