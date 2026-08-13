package Map;

import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		// До 10 записей
		Map<String, Integer> scores = Map.of("First", 1,
				"Second", 2);
		// Более 10 записей
		Map<String, String> cars = Map.ofEntries(Map.entry("EveryDay", "Camry"),
				Map.entry("Taxi", "Corolla"),
				Map.entry("To Mointains", "4Runner"));


		// Тип параметра метода = типу объектов List
		List<Animal> animals = List.of(new Dog(), new Cat(), new Dog());
		takeAnimals(animals); // OK

		// Тип параметра метода != типу объектов List
		List<Dog> dogs = List.of(new Dog(), new Dog());
		//takeAnimals(dogs); // Не сработает ! cannot be converted to java.util.List<Map.Animal>
		// Дженерики в Java инвариантны — List<Dog> НЕ является наследником List<Animal>, даже если Dog наследник Animal


	}

	public static void takeAnimals(List<Animal> animals) {
		for (Animal a : animals) {
			a.eat();
		}
	}
}



