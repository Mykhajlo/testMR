public class GCD {
    public static void main(String[] args) {
        int a = 60, b = 48;
        while (b != 0) {
            int temp = b;
            b = a % b;
            System.out.println("Th -> " + b);
            a = temp;
        }
        System.out.println("The greatest common divisor (GCD) -> " + a);
        System.out.println("Test");
        System.out.println("Test1");
        System.out.println("Test2");
        System.out.println("Test44");
    }
}