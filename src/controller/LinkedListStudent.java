package controller;

import model.Student;

import java.util.LinkedList;

public class LinkedListStudent extends StudentManagementAbstract {
    public LinkedList<Student> students = new LinkedList<>();

    @Override
    public void display() {
        int index = 1;
        for (Student student : students) {
            System.out.println("Student: " + index);
            student.displayData();
            index++;
        }
    }

    @Override
    public void displayStudentHasScholarship() {
        int index = 1;
        for (Student student : students) {
            if (student.isValidForScholarship()) {
                System.out.println("Student: " + index);
                student.displayData();
                index++;
            }
        }
    }

    @Override
    public void displayFemaleStudent() {
        int index = 1;
        for (Student student : students) {
            if (student.isFemale()) {
                System.out.println("Student: " + index);
                student.displayData();
                index++;
            }
        }
    }

    @Override
    public void addAllStudent() {
        System.out.print("Enter amount of students: ");
        int amount = scanner.nextInt();
        for (int index = 1; index <= amount; index++) {
            System.out.println("Student: " + index);
            Student student = new Student();
            student.inputData();
            students.add(student);
        }
    }

    @Override
    public void searchStudentByID() {
        System.out.print("Enter Student's ID: ");
        String id = scanner.next();
        for (Student student : students) {
            if (student.getStudentID().equals(id)) {
                student.displayData();
                return;
            }
        }
        System.out.println("Student not in the list!");
    }

    @Override
    public void searchStudentByName() {
        System.out.print("Enter Student's name: ");
        String name = scanner.nextLine();
        for (Student student : students) {
            if (student.getStudentID().equals(name)) {
                student.displayData();
                return;
            }
        }
        System.out.println("Student not in the list!");
    }

    @Override
    public void updateStudentByID() {
        System.out.print("Enter Student's ID: ");
        String id = scanner.next();
        for (Student student : students) {
            if (student.getStudentID().equals(id)) {
                student.displayData();
                System.out.println();
                System.out.println("Data's above will be replace! ");
                student.inputData();
            }
        }
        System.out.println("Student not in the list!");
    }

    @Override
    public void updateStudentByName() {
        System.out.print("Enter Student's name: ");
        String name = scanner.nextLine();
        for (Student student : students) {
            if (student.getStudentID().equals(name)) {
                student.displayData();
                System.out.println();
                System.out.println("Data's above will be replace! ");
                student.inputData();
            }
        }
        System.out.println("Student not in the list!");
    }

    @Override
    public void removeStudentByID() {
        System.out.print("Enter Student's ID: ");
        String id = scanner.next();
        for (Student student : students) {
            if (student.getStudentID().equals(id)) {
                System.out.println("Data's above will be deleted! ");
                System.out.print("Do you want to delete ? (yes/no): ");
                char choice = scanner.next().charAt(0);
                if (choice == 'y') {
                    students.remove(student);
                    System.out.println("Successful!");
                }
            }
        }
        System.out.println("Student not in the list!");
    }

    @Override
    public void removeStudentByName() {
        System.out.print("Enter Student's name: ");
        String name = scanner.nextLine();
        for (Student student : students) {
            if (student.getName().equals(name)) {
                System.out.println("Data's above will be deleted! ");
                System.out.print("Do you want to delete ? (yes/no): ");
                char choice = scanner.next().charAt(0);
                if (choice == 'y') {
                    students.remove(student);
                    System.out.println("Successful!");
                }
            }
        }
        System.out.println("Student not in the list!");
    }
}
