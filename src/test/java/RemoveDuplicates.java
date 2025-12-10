import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4};
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        System.out.println("Via set in circle : " + set);

        Set<Integer> set1 = Arrays.stream(arr)  // create IntStream from array
                .boxed()                       // convert int -> Integer (boxed stream)
                .collect(Collectors.toSet());  // collect into a HashSet

        System.out.println("Via stream : " + set1);
    }
}