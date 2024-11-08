import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("dog", "cat", "Elephant", "Tiger", "lion", "ant");
        List<String> shedegi = words.stream()
                .filter(word -> word.length() >4)
                .map(String::toLowerCase)
                .sorted()
                .collect(Collectors.toList());
        shedegi.forEach(System.out::println);
    }
    }