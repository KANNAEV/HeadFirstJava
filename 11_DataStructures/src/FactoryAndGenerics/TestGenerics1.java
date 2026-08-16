package FactoryAndGenerics;

import java.util.List;


public class TestGenerics1 {
    public static void main(String[] args) {
        // Фабричный способ добавления
        List<Animal> animals = List.of(new Dog(), new Cat(), new Dog());
        takeAnimals(animals); // Все работает

        List<Dog> dogs = List.of(new Dog(), new Dog());
        // Полиморфизм тут не работает: метод takeAnimals явно принимает только тип <Animal>
        // takeAnimals(dogs);
        takeAllAnimals(dogs);

    }


    public static void takeAnimals(List<Animal> animals) {
        for (Animal a : animals) {
            a.eat();
        }
    }

    // Теперь можно передавать все подтипы Animal
    // Однако знак <?> говорит компилятору: нельзя добавлять элементы в список
    public static void takeAllAnimals(List<? extends Animal> animals) {
        for (Animal a : animals) {
            a.eat();
        }

    }

}