// Наследуется от Animal
public class Cat extends Animal{

public void walk() {
    System.out.println("Хожу и царапаюсь");
}

public void walkWithSuper () {
    super.walk();
}

}
