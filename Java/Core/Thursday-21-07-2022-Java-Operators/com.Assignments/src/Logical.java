public class Logical {
    public static void main(String[] args) {
        boolean value_1 = true, value_2 = false;

        if(value_1 && value_2){
            System.out.println("AND");
        }
        if(value_1 || value_2){
            System.out.println("OR");
        }
        if(!(value_1 == value_2)){
            System.out.println("NOT");
        }

    }
}
