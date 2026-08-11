# Java Coding Requirement: Student Daily Expense Tracker

## Description

Create a Java application named **Student Daily Expense Tracker**.

The application should collect a student’s daily budget and expenses using `Scanner`. It should calculate the total expense, identify the remaining or exceeded amount, check the budget status, and display a complete expense report.

This activity will help students practise:

* Creating a class and an object
* Declaring instance variables
* Accepting input using `Scanner`
* Creating and calling methods
* Working with return types
* Using arithmetic operations
* Using `if-else` conditions

## Class Name

Create a class named:

```text
StudentExpense
```

Save the program as:

```text
StudentExpense.java
```

## Instance Variables

Declare the following variables inside the `StudentExpense` class:

| Data type | Variable name   | Purpose                           |
| --------- | --------------- | --------------------------------- |
| `String`  | `studentName`   | Stores the student’s name         |
| `double`  | `dailyBudget`   | Stores the available daily budget |
| `double`  | `foodExpense`   | Stores the food expense           |
| `double`  | `travelExpense` | Stores the travel expense         |
| `double`  | `studyExpense`  | Stores the study-related expense  |
| `double`  | `otherExpense`  | Stores any other expense          |

## Required Methods

### 1. `calculateTotalExpense()`

```text
Return type: double
Parameters: No parameters
```

Purpose:

Calculate and return the total amount spent by the student.

Calculation:

```text
Total Expense = Food Expense
              + Travel Expense
              + Study Expense
              + Other Expense
```

The method must return the calculated total expense.

### 2. `calculateRemainingAmount()`

```text
Return type: double
Parameters: No parameters
```

Purpose:

Calculate and return the amount remaining after all expenses.

Calculation:

```text
Remaining Amount = Daily Budget - Total Expense
```

This method should call `calculateTotalExpense()` to get the total expense.

If the total expense is greater than the daily budget, the returned value will be negative.

### 3. `isWithinBudget()`

```text
Return type: boolean
Parameters: No parameters
```

Purpose:

Check whether the student’s total expense is within the available daily budget.

Logic:

* Return `true` when the total expense is less than or equal to the daily budget.
* Return `false` when the total expense is greater than the daily budget.

### 4. `calculateExceededAmount()`

```text
Return type: double
Parameters: No parameters
```

Purpose:

Calculate how much the student has spent above the daily budget.

Logic:

* If the total expense is greater than the daily budget, return the exceeded amount.
* Otherwise, return `0`.

Calculation:

```text
Exceeded Amount = Total Expense - Daily Budget
```

### 5. `getBudgetStatus()`

```text
Return type: String
Parameters: No parameters
```

Purpose:

Return a suitable message based on the student’s expense status.

Required conditions:

* If the total expense is less than the daily budget, return:

```text
Within Budget
```

* If the total expense is exactly equal to the daily budget, return:

```text
Budget Fully Used
```

* If the total expense is greater than the daily budget, return:

```text
Budget Exceeded
```

### 6. `displayExpenseReport()`

```text
Return type: void
Parameters: No parameters
```

Purpose:

Display the complete expense report.

The report must display:

* Student name
* Daily budget
* Food expense
* Travel expense
* Study expense
* Other expense
* Total expense
* Remaining amount or exceeded amount
* Budget status

If the student is within the budget, display the remaining amount.

If the student has exceeded the budget, display the exceeded amount.

## Main Method Requirements

Inside the `main()` method:

1. Create a `Scanner` object.
2. Create an object of the `StudentExpense` class.
3. Ask the user to enter the student’s name.
4. Ask the user to enter the daily budget.
5. Ask the user to enter the food expense.
6. Ask the user to enter the travel expense.
7. Ask the user to enter the study expense.
8. Ask the user to enter the other expense.
9. Store the entered values in the instance variables using the `StudentExpense` object.
10. Call `displayExpenseReport()` using the object.
11. Close the `Scanner`.

## Input Order

The program should accept values in the following order:

```text
Student name
Daily budget
Food expense
Travel expense
Study expense
Other expense
```

## Sample Run 1: Within Budget

### Sample Input

```text
Enter student name: Ananya
Enter daily budget: 500
Enter food expense: 150
Enter travel expense: 80
Enter study expense: 100
Enter other expense: 50
```

### Expected Output

```text
---------- DAILY EXPENSE REPORT ----------
Student Name      : Ananya
Daily Budget      : 500.0
Food Expense      : 150.0
Travel Expense    : 80.0
Study Expense     : 100.0
Other Expense     : 50.0
Total Expense     : 380.0
Remaining Amount  : 120.0
Budget Status     : Within Budget
------------------------------------------
```

## Sample Run 2: Budget Fully Used

### Sample Input

```text
Enter student name: Rahul
Enter daily budget: 400
Enter food expense: 150
Enter travel expense: 100
Enter study expense: 100
Enter other expense: 50
```

### Expected Output

```text
---------- DAILY EXPENSE REPORT ----------
Student Name      : Rahul
Daily Budget      : 400.0
Food Expense      : 150.0
Travel Expense    : 100.0
Study Expense     : 100.0
Other Expense     : 50.0
Total Expense     : 400.0
Remaining Amount  : 0.0
Budget Status     : Budget Fully Used
------------------------------------------
```

## Sample Run 3: Budget Exceeded

### Sample Input

```text
Enter student name: Kiran
Enter daily budget: 300
Enter food expense: 140
Enter travel expense: 90
Enter study expense: 80
Enter other expense: 40
```

### Expected Output

```text
---------- DAILY EXPENSE REPORT ----------
Student Name      : Kiran
Daily Budget      : 300.0
Food Expense      : 140.0
Travel Expense    : 90.0
Study Expense     : 80.0
Other Expense     : 40.0
Total Expense     : 350.0
Exceeded Amount   : 50.0
Budget Status     : Budget Exceeded
------------------------------------------
```

## Code-Writing Order

Students should write the program in this order:

1. Import the `Scanner` class.
2. Create the `StudentExpense` class.
3. Declare all the instance variables.
4. Create `calculateTotalExpense()`.
5. Create `calculateRemainingAmount()`.
6. Create `isWithinBudget()`.
7. Create `calculateExceededAmount()`.
8. Create `getBudgetStatus()`.
9. Create `displayExpenseReport()`.
10. Write the `main()` method.
11. Create the `Scanner` object.
12. Create the `StudentExpense` object.
13. Accept and store all input values.
14. Call the report method.
15. Test all three budget conditions.

## Important Instructions

* Use `Scanner` to accept user input.
* Create an object of the `StudentExpense` class.
* Access the variables and methods using the object.
* Do not use a constructor.
* Do not use the `this` keyword.
* Do not write all calculations inside `main()`.
* Do not repeat the total-expense calculation in different methods.
* Call `calculateTotalExpense()` wherever the total is required.
* Use the exact method names and return types specified.
* Use meaningful variable names.
* Do not accept negative values for the budget or expenses.
* Test the program for within-budget, fully-used, and exceeded-budget situations.
* Students must think and write the method logic independently.

## Learning Outcome

After completing this requirement, students should be able to:

* Create a Java class and its object.
* Store data inside an object.
* Accept different data types using `Scanner`.
* Create methods with `double`, `boolean`, `String`, and `void` return types.
* Call one method from another method.
* Use conditions to make decisions.
* Separate input, calculation, decision-making, and output operations into different methods.
* Convert a simple real-life requirement into a working Java application.
