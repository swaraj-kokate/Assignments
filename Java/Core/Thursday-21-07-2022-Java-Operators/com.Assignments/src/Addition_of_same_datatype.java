public class Addition_of_same_datatype {
    public static void main(String[] args) {

        int number_1 = 1,number_2 = 3;
        int sum_1 = number_1 + number_2;
        System.out.println("The sum of int datatype is :" + sum_1);

        byte value_1 = 2, value_2 = 3;
        byte sum_2;
        sum_2 = (byte)(value_1 + value_2);
        System.out.println("The sum of byte datatype is :" + sum_2);

        float operand_1 = 1.1f, operand_2 = 3.2f;
        float sum_3 = operand_1 + operand_2;
        System.out.println("The sum of float datatype is :" + sum_3);

        char alphabet_1 = 'A',alphabet_2 = 'B';
        int alpha_sum = alphabet_1 + alphabet_2;
        System.out.println("The sum of int datatype is :" + alpha_sum);
    }
}
