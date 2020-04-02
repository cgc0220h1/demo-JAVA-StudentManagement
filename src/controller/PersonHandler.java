package controller;

import model.Person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PersonHandler extends Person {
    private Scanner scanner = new Scanner(System.in);
    private SimpleDateFormat dateInput = new SimpleDateFormat("dd/MM/yyyy");

    public void inputData() throws ParseException {
        String genderString;
        String dateString;
        System.out.print("Enter Name: ");
        setName(scanner.nextLine());
        System.out.print("Enter Gender (Male/Female): ");
        genderString = scanner.next();
        setGender(parseGender(genderString));
        System.out.print("Enter Birth Date (dd/mm/yyyy): ");
        dateString = scanner.next();
        dateInput.parse(dateString);
        setBirthDate(dateInput);
        System.out.print("Enter address: ");
        scanner.nextLine();
        setAddress(scanner.nextLine());
        System.out.println("-------------------------------");
    }

    public void displayData() {
        System.out.printf("Name: %s \n", getName());
        System.out.printf("Gender: %s \n", parseGender(getGender()));
        System.out.printf("Date of Birth: %s \n",getBirthDate());
        System.out.printf("Address: %s \n", getAddress());
    }

    public boolean parseGender(String genderString) {
        if (genderString.equals("Male")) {
            return true;
        }
        return false;
    }

    public String parseGender(boolean gender) {
        if (gender) {
            return "Male";
        }
        return "Female";
    }
}
