// Полиморфизм - ты можешь использовать более абстрактный класс в параметрах метода или в типе массива
// Это даст возможность обрабатывать все дочерние типы классов или хранить их в массиве


public class InherAndPolyTestDrive {
    public static void main(String[] args) {

        // Создаем 2 экземпляра класса: Cat и Dog
        Cat myCat = new Cat();
        Dog myDog = new Dog();

        // Полиморфизм позволяет использовать обобщенный тип масссива для хранения подтипов
        Animal[] myAnimals = new Animal[2];
        myAnimals[0] = myCat;
        myAnimals[1] = myDog;

        // Доступ к объектам через элементы массива:
        myAnimals[0].name = "Пушистик";
        myAnimals[0].age = 3;

        myAnimals[1].name = "Рекс";
        myAnimals[1].age = 2;

        // Вывод имен питомцев
        for(Animal animal: myAnimals) {
            System.out.printf(animal.getName()  + "\n");
        }

        // Теперь у нас есть Ветеринар, который может принимать всех животных
        Vet vet = new Vet();
        // Мы передадим нашу собаку и кошку ему на осмотр и он без проблем их обслужил
        // Это сила полиморфизма
        vet.sayAbautAnimal(myCat);
        vet.sayAbautAnimal(myDog);

        //Вызов метода класса
        myCat.walk();
        //Вызов того же метода из супер-класса
        myCat.walkWithSuper();


//
//        myDog.walk();
//
//
//        myCat.walk();
//        myCat.walkWithSuper(); // Вызов метода из супер-класса
    }


}

