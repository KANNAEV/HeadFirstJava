import java.util.ArrayList;

class ArrayListTestDrive {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<> (); // <> алмазный оператор
        // add - Добавление элемента
        myList.add("BMW");
        myList.add("Mercedess-Benz");
        myList.add("BMW");
        printList(myList); 
        
        // indexOf - Поиск индекса по первому вхождению
        System.out.println("Индекс BMW в myList: " + myList.indexOf("BMW")); // 0
        System.out.println("Индекс Mercedess-Benz в myList: " + myList.indexOf("Mercedess-Benz")); // 1

        // size Размер массива 3
        System.out.println("Размер myList: " + myList.size());

        // remove - Удаление элемента по первому вхождению
        myList.remove("BMW");
        printList(myList); 

        // remove - Удаление элементапо индексу
        myList.remove(0);
        printList(myList); 

         // size - Размер массива 2
        System.out.println("Размер myList: " + myList.size());

        // isEmpty - Проверка на пустоту списка
        System.out.println("myList пуст : " + myList.isEmpty());

        // contains - Проверка на наличие элемента
        System.out.println("myList содержит BMW : " + myList.contains("BMW"));
        System.out.println("myList содержит Mercedess-Benz : " + myList.contains("Mercedess-Benz"));

        // get - получение элемента по позиции 
        System.out.println("myList элемент по индексу 0: " + myList.get(0));





}


    static void printList (ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
             System.out.printf("%d : %s%n", i, list.get(i));
        }
    }
}