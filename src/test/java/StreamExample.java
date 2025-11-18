import java.util.*;
import java.util.stream.*;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 1, 2, 3, 3, 4, 5, 6);

        List<Integer> evenSquares = nums.stream()
                .filter(n -> n % 2 == 0) // [2, 4, 6]
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println(evenSquares); // [4, 16, 36]

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        Stream<String> stream1 = names.stream();            // From a collection
        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4);    // From values
        Stream<String> stream3 = Stream.empty();            // Empty stream
        Stream<Double> randoms = Stream.generate(Math::random); // Infinite stream

        List<String> upper = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upper);

        List<Integer> unique = nums.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(unique);

       // nums.forEach(System.out::println);
        Optional<Integer> first = nums.stream().findFirst(); // 1
        System.out.println(first);

        Optional<Integer> any = nums.stream().findAny(); // 1
        System.out.println(any);

        int sum = nums.stream().reduce(0, Integer::sum);
        System.out.println(sum);

        List<String> result = Arrays.asList("apple", "banana", "pear", "apple")
                .stream()
                .filter(s -> s.length() > 4)
                .distinct()
                .sorted()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
