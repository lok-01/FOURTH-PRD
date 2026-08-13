import java.util.Scanner;

public class StudentExpense {
    // Instance Variables
    String studentName;
    double dailyBudget;
    double foodExpense;
    double travelExpense;
    double studyExpense;
    double otherExpense;

    // Required Methods

    // 1. calculateTotalExpense()
    public double calculateTotalExpense() {
        return foodExpense + travelExpense + studyExpense + otherExpense;
    }

    // 2. calculateRemainingAmount()
    public double calculateRemainingAmount() {
        return dailyBudget - calculateTotalExpense();
    }

    // 3. isWithinBudget()
    public boolean isWithinBudget() {
        return calculateTotalExpense() <= dailyBudget;
    }

    // 4. calculateExceededAmount()
    public double calculateExceededAmount() {
        double totalExpense = calculateTotalExpense();
        if (totalExpense > dailyBudget) {
            return totalExpense - dailyBudget;
        } else {
            return 0.0;
        }
    }

    // 5. getBudgetStatus()
    public String getBudgetStatus() {
        double totalExpense = calculateTotalExpense();
        if (totalExpense < dailyBudget) {
            return "Within Budget";
        } else if (totalExpense == dailyBudget) {
            return "Budget Fully Used";
        } else {
            return "Budget Exceeded";
        }
    }

    // 6. displayExpenseReport()
    public void displayExpenseReport() {
        System.out.println("---------- DAILY EXPENSE REPORT ----------");
        System.out.println("Student Name      : " + studentName);
        System.out.println("Daily Budget      : " + dailyBudget);
        System.out.println("Food Expense      : " + foodExpense);
        System.out.println("Travel Expense    : " + travelExpense);
        System.out.println("Study Expense     : " + studyExpense);
        System.out.println("Other Expense     : " + otherExpense);
        System.out.println("Total Expense     : " + calculateTotalExpense());
        
        if (isWithinBudget()) {
            System.out.println("Remaining Amount  : " + calculateRemainingAmount());
        } else {
            System.out.println("Exceeded Amount   : " + calculateExceededAmount());
        }
        
        System.out.println("Budget Status     : " + getBudgetStatus());
        System.out.println("------------------------------------------");
    }

    // Main Method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentExpense expense = new StudentExpense();

        // Input gathering with negative check as per requirements
        System.out.print("Enter student name: ");
        expense.studentName = scanner.nextLine();
        System.out.println(expense.studentName);

        System.out.print("Enter daily budget: ");
        expense.dailyBudget = scanner.nextDouble();
        System.out.println((int) expense.dailyBudget);
        if (expense.dailyBudget < 0) {
            System.out.println("Budget cannot be negative.");
            scanner.close();
            return;
        }

        System.out.print("Enter food expense: ");
        expense.foodExpense = scanner.nextDouble();
        System.out.println((int) expense.foodExpense);
        if (expense.foodExpense < 0) {
            System.out.println("Expense cannot be negative.");
            scanner.close();
            return;
        }

        System.out.print("Enter travel expense: ");
        expense.travelExpense = scanner.nextDouble();
        System.out.println((int) expense.travelExpense);
        if (expense.travelExpense < 0) {
            System.out.println("Expense cannot be negative.");
            scanner.close();
            return;
        }

        System.out.print("Enter study expense: ");
        expense.studyExpense = scanner.nextDouble();
        System.out.println((int) expense.studyExpense);
        if (expense.studyExpense < 0) {
            System.out.println("Expense cannot be negative.");
            scanner.close();
            return;
        }

        System.out.print("Enter other expense: ");
        expense.otherExpense = scanner.nextDouble();
        System.out.println((int) expense.otherExpense);
        if (expense.otherExpense < 0) {
            System.out.println("Expense cannot be negative.");
            scanner.close();
            return;
        }

        // Display report
        expense.displayExpenseReport();

        scanner.close();
    }
}
