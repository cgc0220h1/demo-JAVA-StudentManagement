import controller.PersonController;
import model.Person;

import java.text.ParseException;

public class PersonControllerTest {
    public static void main(String[] args) throws ParseException {
        PersonController personController = new PersonController();
        Person person1 =new Person();
        personController.inputData(person1);
        personController.displayData(person1);
    }
}