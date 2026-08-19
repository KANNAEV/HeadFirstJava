import java.util.List;
import java.util.stream.Collectors;

public class CoffeeOrder {
	public static void main(String[] args) {
		List<String> coffees = List.of("Американо", "Эспрессо", "Кортадо", "Мокка", "Капучино", "Флэт уайт", "Латте");
		List<String> coffeeEndingIO = coffees.stream()
				.distinct()
				.filter(s -> s.endsWith("о"))
				.sorted()
				.collect(Collectors.toList());
		System.out.println(coffeeEndingIO);


		// Американо, Капучино, Кортадо, Эспрессо

	}

}
