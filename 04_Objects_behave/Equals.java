class Dog {
    String name;
    int size;

    void bark() {
        System.out.println("Гав-гав");
    }

}

public class Equals {
    public static void main(String[] args) {
        int x = 5;
        boolean result = (x == 5);
        System.out.println("Результат сравнения x == 5: " + result); // true, так как x действительно равно 5

        Dog dog1 = new Dog();
        Dog dog2 = dog1;
        boolean result2 = (dog1 == dog2);
        System.out.println("Результат сравнения dog1 == dog2: " + result2); // true, так как обе переменные ссылаются на
                                                                            // один и тот же объект в памяти

        Dog dog3 = new Dog();
        boolean result3 = dog1.equals(dog3);
        System.out.println("Результат сравнения dog1 и dog3 с помощью метода equals: " + result3); // false, так как
                                                                                                   // dog1 и dog3 - это
                                                                                                   // разные объекты в
                                                                                                   // памяти

        String str1 = "Hello";
        String str2 = "Hello";
        boolean result4 = str1.equals(str2);
        System.out.println("Результат сравнения str1 и str2 с помощью метода equals: " + result4); // true, так как
                                                                                                   // строки в Java
                                                                                                   // сравниваются по
                                                                                                   // содержимому, а не
                                                                                                   // по ссылке
        boolean result5 = (str1 == str2);
        System.out.println("Результат сравнения str1 == str2: " + result5); // true, так как строки в Java могут быть
                                                                            // оптимизированы компилятором и указывать
                                                                            // на один и тот же объект в памяти, если
                                                                            // они имеют одинаковое значение
    }
}
