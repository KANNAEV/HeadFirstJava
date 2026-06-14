public class Dog {
    int size;
    String name;

    Dog(int size, String name) {
        this.size = size;
        this.name = name;
    }

    // Лай бывает разный
    void bark(int size) {
        if (size > 60) {
            System.out.println("Гав-гав");
        } else if (size > 14) {
            System.out.println("Тяф-тяф");
        } else {
            System.out.println("Пиу-пиу");
        }
    }
}
