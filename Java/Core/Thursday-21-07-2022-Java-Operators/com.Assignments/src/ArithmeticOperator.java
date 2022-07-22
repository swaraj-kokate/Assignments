public class ArithmeticOperator {
    public static void main(String[] args) {
        int number_1 = 23, number_2  = 64, addition, multiplication, substraction, division, remainder;

        //Adding two numbers
        addition = number_1 + number_2;
        System.out.println("The Addition is " + addition);

        //Multiplying two numbers
        multiplication = number_1 * number_2;
        System.out.println("The multiplication is " + multiplication);

        //Substraction two numbers
        substraction = number_1 - number_2;
        System.out.println("The substraction is " + substraction);

        //Dividing two numbers
        division = number_1 / number_2;
        System.out.println("The division is " + division);

        //Calculating remainder of two numbers
        remainder = number_1 % number_2;
        System.out.println("The remainder is " + remainder);
    }
}
