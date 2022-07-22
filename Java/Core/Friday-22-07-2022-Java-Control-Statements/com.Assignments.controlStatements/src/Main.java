import java.util.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        question_1();
        question_2();
        question_3();
        question_4();

        //Question - 5
        System.out.println("Enter two numbers to find the greatest amongst them: ");

        //numerical input
        int number_1 = scanner.nextInt();
        int number_2 = scanner.nextInt();

        question_5(number_1, number_2);

        //Question - 6
        System.out.println("Enter the ages of three persons: ");

        //numerical input
        int age_1 = scanner.nextInt();
        int age_2 = scanner.nextInt();
        int age_3 = scanner.nextInt();

        question_6(age_1, age_2, age_3);

        //Question - 7
        Date d= new Date();
        question_7(22);

    }

    public static void question_1() {
        int number1 = 3;

        if (number1 >= 0) {
            if (number1 == 0)
                System.out.println("first");
            else
                System.out.println("second");
            System.out.println("third");
        }
    }
    /*
    OUTPUT FOR QUESTION - 1
    second
    third
    */

    public static void question_2() {
        int number1 = 0;
        if (number1 >= 0)                        //if number1 is greater than or equal to zero
            if (number1 == 0)                   //if number1 is equal to zero
                System.out.println("first");
            else
                System.out.println("second");
        System.out.println("third");
    }

    public static void question_3() {
        int var = 3;

        switch (var) {

            case 1:
                System.out.println("low");
                break;

            case 2:
                System.out.println("medium");
                break;

            case 3:
                System.out.println("high");
                break;

            default:
                System.out.println("abnormal");

        }
    }
    /*
    OUTPUT FOR QUESTION 3
    high(for var = 3)
    */

    public static void question_4() {

        int x = 0, m = 2;

        //if m is equal to zero
        if (m == 0) {
            x = x + 2;

            //prints x
            System.out.println("X = " + x);
        }

        //if m is equal to one
        if (m == 1) {
            x = x + 4;

            //prints x
            System.out.println("X = " + x);
        }

        //if m is equal to two
        if (m == 2) {
            x = x + 6;

            //prints x
            System.out.println("X = " + x);
        }
    }
    /*
    OUTPUT FOR QUESTION 4
    X = 6
    */

    public static void question_5(int number_1, int number_2) {

        if (number_1 > number_2)
            System.out.println(number_1 + " is greatest");

        else
            System.out.println(number_2 + " is greatest");
    }
    /*
    OUTPUT FOR QUESTION 5
    Enter two numbers to find the greatest amongst them:
            23 34
            34 is greatest
    */

    public static void question_6(int age_1, int age_2, int age_3) {

        if ((age_1 > age_2) && (age_1 > age_3)) {
            System.out.println("Person with age " + age_1 + " is oldest");
            if (age_2 < age_3)
                System.out.println("Person with age " + age_2 + " is youngest");
            else
                System.out.println("Person with age " + age_3 + " is youngest");
        } else if ((age_2 > age_1) && (age_2 > age_3)) {
            System.out.println("Person with age " + age_2 + " is oldest");
            if (age_1 < age_3)
                System.out.println("Person with age " + age_1 + " is youngest");
            else
                System.out.println("Person with age " + age_3 + " is youngest");
        }
        if ((age_3 > age_1) && (age_3 > age_2)) {
            System.out.println("Person with age " + age_3 + " is oldest");
            if (age_1 < age_2)
                System.out.println("Person with age " + age_1 + " is youngest");
            else
                System.out.println("Person with age " + age_2 + " is youngest");
        }

    }
    /*OUTPUT FOR QUESTION 6
    Enter the ages of three persons:
            56 67 89
    Person with age 89 is oldest
    Person with age 56 is youngest
     */


    public static void question_7(int currentDate) {

        //print week days using loop
        String days[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        for (String week : days)
            System.out.println(week);

        //print week days by skipping today's day
        for (String week : days) {

            if (week == "Friday")
                continue;

            System.out.println(week);
        }

        //print date till today
        Calendar calendar = Calendar.getInstance();
        Formatter fmt = new Formatter();
        fmt.format("%tB", calendar);
        String today = fmt.toString();
        for (int date = 1; date <= currentDate; date++) {
            if (date != currentDate)
                System.out.println(today + " - " + date);
            else
                System.out.println("today is " + currentDate + "nd " + today);
        }
    }
    /*
    OUTPUT FOR QUESTION 7
    Monday
    Tuesday
    Wednesday
    Thursday
    Friday
    Saturday
    Sunday
    ------------------------------------------------------------------------------------------------------------------------------------------
    Monday
    Tuesday
    Wednesday
    Thursday
    Saturday
    Sunday
    -------------------------------------------------------------------------------------------------------------------------------------------
    July - 1
    July - 2
    July - 3
    July - 4
    July - 5
    July - 6
    July - 7
    July - 8
    July - 9
    July - 10
    July - 11
    July - 12
    July - 13
    July - 14
    July - 15
    July - 16
    July - 17
    July - 18
    July - 19
    July - 20
    July - 21
    today is 22nd July
     */
}
