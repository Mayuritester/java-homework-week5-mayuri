package week5;

import java.util.Scanner;

//**Rewrite the student mark sheet programme (From java-homework-week3
//programmes) using if else and while loop.
public class Programme_2 {

    static String studentName;
    static int rollNumber;
    static String subject[] = {"Maths", "Science", "English"};
    static int Maths;
    static int Science;
    static int English;
    static int total;
    static float percentage;
    static String result;
    static String Grade;


    public static void errorMessage() {
        int marks = 100;
        if (marks < 1 && marks > 100) {
            System.out.println(" it is invalid number");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Name: ");
        studentName = scanner.nextLine();

        System.out.println("Enter the roll number: ");
        rollNumber = scanner.nextInt();

        System.out.println("Enter marks in Maths (0 to 100");
        Maths = scanner.nextInt();

        System.out.println("Enter marks in Science (0 to 100");
        Science = scanner.nextInt();

        System.out.println("Enter marks in English (0 to 100");
        English = scanner.nextInt();

        total = Maths + Science + English;
        percentage = (float) total / subject.length;

        if (total >= 35)
            result = "pass";
        else result = "fail";

        Grade = getGrade(total);


//        System.out.println("Roll Number:" + roll + "\tName: "+ name);
//        System.out.println("Marks(Maths,Science,English): " +Maths+", "+Science+", "+English);
//        System.out.println("Total: "+total+"\tpercentage:"+perc);


        System.out.println("|----------------------------------------------------|");
        System.out.println("|                 Mark Sheet                         |");
        System.out.println("|----------------------------------------------------|");
        System.out.println("|                                                    |");
        System.out.println("|    Name     :    " + studentName + "               |");
        System.out.println("|    Roll No  :    " + rollNumber + "                |");
        System.out.println("|----------------------------------------------------|");
        System.out.println("|    Subject   :   Marks                             |");
        System.out.println("|----------------------------------------------------|");
        System.out.println("|     Maths    :     " + Maths + "                   |");
        System.out.println("|     Science  :    " + Science + "                  |");
        System.out.println("|     English  :    " + English + "                  |");
        System.out.println("|----------------------------------------------------|");
        System.out.println("|     Total    :    " + total + "                    |");
        System.out.println("|----------------------------------------------------|");
        System.out.println("|     Percentage :   " + percentage + "              |");
        System.out.println("|     Result     :    " + result + "                 |");
        System.out.println("|     Grade       :    " + Grade + "                 |");
        System.out.println("|----------------------------------------------------|");
    }

    public static String getGrade(int total) {
        String grade = "";
        if (percentage >= 80 && percentage < 100) {
            grade = "A+";
        } else if (percentage >= 60 && percentage < 70) {
            grade = "A";
        } else if (percentage >= 50 && percentage < 60) {
            grade = "B";
        } else if (percentage >= 35 && percentage < 50) {
            grade = "C";
        }
        return grade;
    }

    public static int getValidMarks(Scanner scanner, String subject) {
        int marks;
        while (true) {
            System.out.println("Enter marks for " + subject + "(0-100): ");
            marks = scanner.nextInt();
            if (marks >= 0 && marks <= 100) {
                break;
            } else {
                System.out.println("Invalid Input, marks should be between 0 to 100");
            }
        }


        return marks;
    }
}
