package PerformanceTracker;

public class Student {

    private String name;
    private String Course;
    private int problemsSolved;
    private int completedTopics;

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(String course) {
        this.Course = course;
    }

    public void setProblemsSolved(int problemsSolved) {
        this.problemsSolved = problemsSolved;
    }

    public void setCompletedTopics(int completedTopics) {
        this.completedTopics = completedTopics;
    }

    public void AddSolved(int num) {
        this.problemsSolved += num;
    }

    public void AddTopics(int num) {
        this.completedTopics += num;
    }

    public void DisplayStudentDetails() {
        System.out.println("Student Name: " + this.name);
        System.out.println("Course: " + this.Course);
    }

    public void DisplayProgress() {
        System.out.println("Problems Solved: " + this.problemsSolved);
        System.out.println("Completed Topics: " + this.completedTopics);
    }

}
