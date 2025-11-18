import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class SimpleLambdas {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
    animals.add(new Animal("Dog", false, true));
    animals.add(new Animal("Cat", true, true));
    print(animals, a -> a.canHop());


        List<String> names = animals.stream()
                .filter(p -> p.canSwim() == true)
                .map(Animal:: toString)
                .sorted()
                .collect(Collectors.toList());
    }
    private static void print(ArrayList<Animal> animals, Predicate<Animal> checker){
        for (Animal animal : animals){
            if (checker.test(animal)){
                System.out.println("That animal actually can Hop" + animal + " ");
            }
        }
    }
}
