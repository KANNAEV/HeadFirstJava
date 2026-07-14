public class Dog {
    int size;
    String name;

    Dog() {
        this.size = size;
        this.name = name;
    }

    // Лай бывает разный
    void bark() {
        if (this.size > 60) {
            System.out.println("Гав-гав");
        } else if (this.size > 14) {
            System.out.println("Тяф-тяф");
        } else {
            System.out.println("Пиу-пиу");
        }
    }
}