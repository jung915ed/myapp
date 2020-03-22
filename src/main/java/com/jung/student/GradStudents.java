package com.jung.student;

public class GradStudents extends Students {
    int thesis;
    static int pass = 70;

    @Override
    public void print() {

        System.out.println(
                name + "\t" + math + "\t" + english + "\t" +
                        "\t" + thesis + getAverage()
                        + "\t" + ((getAverage() >= pass) ? "PASSED" : "FAILED"));
        grading(average / 10);

    }

    public static void grading(double v) {
        char grading = 'F';
        switch ((int) (v)) {
            case 10:
            case 9:
                grading = 'A';
                break;
            case 8:
                grading = 'B';
                break;
            case 7:
                grading = 'C';
                break;
            case 6:
                grading = 'D';
                break;
            default:
                grading = 'F';

        }
        System.out.println("your grading is: " + grading);
    }


    public GradStudents(String name, double math, double english, int thesis) {
        super(name, math, english);
        this.thesis = thesis;

    }
}
