public class ReverseNumber {
    static int reversed = 0, rev = 0;


    static void reverseW (int num) {
        if (num <= 0)
            return;
        rev = (rev * 10) + num % 10;
        reverseW(num / 10);
    }

    static void whileT(int num) {
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num = num / 10;
        }
    }
    static String stringBufferS (int num) {
        String temp = Integer.toString(num);
        StringBuilder sb = new StringBuilder(temp);
        return String.valueOf(sb.reverse());
    }

    public static void main(String[] args) {
        int num = 12345;
        System.out.println("Orginal Number is:  " + num);

        reverseW(num);
        System.out.println("Reversed via recursion Number is: " + rev);

        whileT(num);
        System.out.println("Reversed Number WHILE is: " + reversed);

       // stringBufferS(num);
        System.out.println("Reversed via StringBuilder Number is: " + stringBufferS(num));
    }
}