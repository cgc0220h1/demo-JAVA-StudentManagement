package controller;

import model.Person;
import java.util.Scanner;

public class PersonController {
    protected Scanner scanner = new Scanner(System.in);

    public void inputData(Person person) {
        String genderString;
        int[] date = new int[3];
        System.out.print("Enter Name: ");
        person.setName(scanner.nextLine());
        System.out.print("Enter Gender (Male/Female): ");
        genderString = scanner.next().toLowerCase();
        person.setGender(parseGender(genderString));
        System.out.println("Enter Birth Date ");
        System.out.print("Enter Day: ");
        date[0] = scanner.nextInt();
        System.out.print("Enter Month: ");
        date[1] = scanner.nextInt();
        System.out.print("Enter Year: ");
        date[2] = scanner.nextInt();
        person.setBirthDate(date);
        System.out.print("Enter address: ");
        scanner.nextLine();
        person.setAddress(scanner.nextLine());
    }

    public void displayData(Person person) {
        int[] date = person.getBirthDate();
        System.out.println("-------------------------------");
        System.out.printf("Name: %s \n", person.getName());
        System.out.printf("Gender: %s \n", parseGender(person.getGender()));
        System.out.printf("Date of Birth: %d/%d/%d \n", date[0], date[1], date[2]);
        System.out.printf("Address: %s \n", person.getAddress());
    }

    private boolean parseGender(String genderString) {
        if (genderString.equals("male")) {
            return true;
        }
        return false;
    }

    private String parseGender(boolean gender) {
        if (gender) {
            return "Male";
        }
        return "Female";
    }
}
