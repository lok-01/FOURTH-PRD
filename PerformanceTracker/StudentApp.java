package PerformanceTracker;

import java.util.Scanner;
import PerformanceTracker.Student;

public class StudentApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=========================");
        System.out.println("Student Practice Tracker");
        System.out.println("=========================");
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter Course: ");
        String course = sc.nextLine();

        Student s = new Student();
        s.setName(name);
        s.setCourse(course);

        int choice = 0;
        while (choice != 5) {
            System.out.println("=================================");
            System.out.println("         STUDENT MENU");
            System.out.println("=================================");
            System.out.println("1. View Student Details");
            System.out.println("2. View Progress");
            System.out.println("3. Add Completed Topics");
            System.out.println("4. Add Solved Problems");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    s.DisplayStudentDetails();
                    break;
                case 2:
                    s.DisplayProgress();
                    break;
                case 3:
                    System.out.println("Enter number of topics to add: ");
                    int topics = sc.nextInt();
                    s.AddTopics(topics);
                    break;
                case 4:
                    System.out.println("Enter number of problems to add: ");
                    int problems = sc.nextInt();
                    s.AddSolved(problems);
                    break;
                case 5:
                    System.out.println("Thank You for using Student Practice Tracker.");
                    System.out.println("Keep Practicing");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        }
    }
}
