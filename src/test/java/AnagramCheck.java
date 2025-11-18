import java.util.Arrays;
public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen", str2 = "silent";
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println("Both strings has same chars -> " + Arrays.equals(arr1, arr2));
        StringBuilder sb1 = new StringBuilder(str1);
        System.out.println("Revers Anagram -> " + String.valueOf(sb1.reverse()).equals(str2));
    }
}