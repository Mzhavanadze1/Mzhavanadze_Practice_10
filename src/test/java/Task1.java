import java.util.Arrays;
import java.util.List;


public class Task1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice","Bob","Eve","Charlie","Daniel");
        names.stream()
                .filter(name-> name.contains("e"))
                .forEach(System.out::println);
    }
}