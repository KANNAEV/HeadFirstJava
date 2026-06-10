import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {

        Scanner scanner = new Scanner(System.in);

        p1 = new Player(1);
        p2 = new Player(2);
        p3 = new Player(3);

        int p1guess;
        int p2guess;
        int p3guess;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10);

        System.out.println("Я загадал число от 0 до 9: " + targetNumber + "\n Попробуйте отгадать его");

        while (true) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Игрок 1 загадай число:");
            p1guess = p1.guess(scanner);
            System.out.println("Игрок 1 предложил число: " + p1guess);
            System.out.println("Игрок 2 загадай число");
            p2guess = p2.guess(scanner);
            System.out.println("Игрок 2 предложил число " + p2guess);
            p3guess = p3.guess(scanner);
            System.out.println("Игрок 3 загадай число:");
            System.out.println("Игрок 3 предложил число " + p3guess);

            if (p1guess == targetNumber) p1isRight = true;

            if (p2guess == targetNumber) p2isRight = true;

            if (p3guess == targetNumber) p3isRight = true;

            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("У нас победитель !");
                System.out.println("Игрок 1 : " + p1isRight + " с числом " + p1guess);
                System.out.println("Игрок 2 : " + p2isRight + " с числом " + p2guess);
                System.out.println("Игрок 3 : " + p3isRight + " с числом " + p3guess);
                break;

            } else {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println("Продолжаем игру, потому что никто не выйграл");
            }
        }
    }
}