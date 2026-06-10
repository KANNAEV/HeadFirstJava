import java.util.Scanner;

public class Player {

    int number;

    public  Player (int number) {
        this.number = number;
    }

    public int guess (Scanner scanner) {
        return scanner.nextInt();
    }
}