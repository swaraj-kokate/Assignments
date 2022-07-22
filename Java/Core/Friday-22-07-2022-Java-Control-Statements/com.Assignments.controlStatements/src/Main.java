public class Main {
    static int number1 = 0;
    static int var = 3;
    static int m = 0;

    public static void main(String[] args) {
        question_1();
        question_2();
        question_3();
        question_4();
    }

    public static void question_1(){
        int number1 = 3;

        if(number1 >= 0) {
            if (number1 == 0)
                System.out.println("first");
            else
                System.out.println("second");
            System.out.println("third");
        }
    }

    public static void question_2(){
        if(number1 >= 0)                        //if number1 is greater than or equal to zero
            if (number1 == 0)                   //if number1 is equal to zero
                System.out.println("first");
            else
                System.out.println("second");
            System.out.println("third");
    }

    public static void question_3(){
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

    public static void question_4(){

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
}
