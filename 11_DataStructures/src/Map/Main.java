package Map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // Первый словарь. Ключ Integer, значение String
        Map<Integer, String> phones = new HashMap<>();

        // put() - принимает 2 параметра: ключ и значение и помещает в словарь
        phones.put(622737, "Гаджи");
        phones.put(615750, "Патимат");
        System.out.println("Справочник телефонов: " + phones);

        // get() - принимает ключ и возвращает значение
        System.out.println("По номеру 622737 попадем к : " + phones.get(622737));


    }
}


