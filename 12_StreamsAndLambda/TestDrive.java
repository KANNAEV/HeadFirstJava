import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class TestDrive {
    public static void main(String[] args) {
        List<String> strings = List.of("У", "вас", "в", "руках", "список", "строк");
        List<String> limit = strings.stream()
                .limit(4)
                .collect(Collectors.toList());
        System.out.println(strings); // Исходный список не изменился
        System.out.println(limit);


        // Lambda можно присвоить переменной, потом ее вызывать
        // 1 Lambda Runnable
        Runnable runnable = () -> System.out.println("Привет");
        runnable.run();

        // 2 Lambda Comparator
        Comparator<String> comparator = (s1, s2) -> s1.compareToIgnoreCase(s2);
        String text1 = "Hello";
        String text2 = "HELLO";
        boolean result = comparator.compare(text1, text2) == 0;
        System.out.println("Hello == HELLO: " + result);


        // Lambda Supplier
        Supplier<String> s = () -> "Какая то строка";
        System.out.println(s.get());

    }
}
