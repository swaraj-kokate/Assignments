public class Unary {
    public static void main(String[] args) {
        int number_1 = 23, number_2 = 64, unary_minus, increment, decrement, bitwise_complement;
        boolean condition = true, not;

        //Converts positive value to negative
        unary_minus = -number_2;
        System.out.println("Output of unary minus operation is :" +unary_minus);

        //Converts positive value to negative
        not = !condition;
        System.out.println("Output of not operation is :" +not);

        //increments number value by 1
        increment = number_1++;
        System.out.println("Output of increment operation is :" +increment);

        //decrements number value by 1
        decrement = number_1--;
        System.out.println("Output of increment operation is :" +decrement);

        //performs 1's complement
        bitwise_complement = ~number_2;
        System.out.println("Output of bitwise complement operation is :" +bitwise_complement);

    }
}
