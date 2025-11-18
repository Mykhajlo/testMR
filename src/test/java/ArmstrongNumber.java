public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153, sum = 0, temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            System.out.println("digit = " + digit);
            sum += Math.pow(digit, 3);
            temp /= 10;
            System.out.println(temp);
        }
        System.out.println(num == sum);
    }
}