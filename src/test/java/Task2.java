import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("dog", "cat", "elephant", "tiger", "lion", "ant");

        List<String> didiAsoebi = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        for (String cxovelebi : didiAsoebi) {
            System.out.println(cxovelebi);
        }

    }
}

