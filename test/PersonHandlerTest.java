import controller.PersonHandler;

import java.text.ParseException;

public class PersonHandlerTest {
    public static void main(String[] args) throws ParseException {
        PersonHandler person1 = new PersonHandler();
        person1.inputData();
        person1.displayData();
    }
}