import java.util.*;
import java.util.stream.*;

public class StreamMet {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 1, 2, 3, 3, 4, 50, 6);
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        List<Integer> multipleOff10 = list.stream()
                .filter(x -> x > 10)  // filter elements by some condition
                .collect(Collectors.toList());
        System.out.println(multipleOff10); // [50]

        List<String> upper = names.stream()
                .map(String::toUpperCase) // transform each element
                .collect(Collectors.toList());
        System.out.println(upper); // [ALICE, BOB, CHARLIE]

        List<Integer> sortedList = list.stream()
                .sorted().collect(Collectors.toList());  // sorted elements
        System.out.println(sortedList);

        List<Integer> takeWhileList = list.stream()
                .takeWhile(x -> x < 10)  // take elements while condition is true after find some element which is not true stop processing
                .collect(Collectors.toList());
        System.out.println(takeWhileList);

        List<Integer> dropWhileList = list.stream()
                .dropWhile(x -> x < 10)  // drop elements while condition than stop processing and take all next elements
                .collect(Collectors.toList());
        System.out.println(dropWhileList);

        int sum = list.stream()
                .reduce(0, Integer::sum);  // aggregate elements to one result
        System.out.println(sum);

        String concat = names.stream()
                .reduce("", String::concat);  // aggregate elements to one result,  in current case concatenate strings
        System.out.println(concat);

        String concat22 = names.stream()
                .reduce("", (partialString, element) -> partialString.toUpperCase() + element.toUpperCase());  // aggregate elements to one result,  in current case we make elements to UpperCase concatenate it
        System.out.println(concat22);

        Boolean someElement = list.stream()
                .anyMatch(x ->  x > 400 ); // check if any element match the condition and return boolean False if no such
        System.out.println(someElement);

        long count = list.stream()
                .filter( x -> x > 5)
                .count();     // check if any element match the condition and return boolean False if no such
        System.out.println(count);
    }
}
