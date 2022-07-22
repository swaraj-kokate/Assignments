// Java Program to Illustrate A Method
// Which Adds Up Numbers

class local {
    public static void main(String args[]){

        int number_1 = 23, number_2 = 64;

        int sum = add(number_1, number_2);
        System.out.println("The sum is " + sum);
    }

    // Using two parameters of integer data type
    // With integer return type
    public static int add(int number_1, int number_2) {

        // Creating a sum to add the numbers
        int sum = number_1 + number_2;

        // Returning the sum of int data type
        return sum;
    }

}