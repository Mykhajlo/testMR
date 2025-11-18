import java.util.ArrayList;

public class StatementFor{
public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
        System.out.print(i + " ");
        System.out.println();
    }

    System.out.println();
    ArrayList<String> values = new ArrayList<>();
    values.add("Tom");
    values.add("Kate");
    for (String value : values){
        System.out.println(value + " ");
    }
}
}