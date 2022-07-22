public class starPattern_1 {
    public static void main(String[] args) {
       alphabetPattern();
    }

    public static void alphabetPattern() {
        int alpha = 65;
        for(int row = 0; row < 6; row++){
            for(int column = 0; column <= row; column++){
                System.out.print((char)alpha);
            }
            alpha++;
            System.out.println();
        }
    }
}
/*
OUTPUT
A
BB
CCC
DDDD
EEEEE
FFFFFF
 */
