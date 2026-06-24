import java.util.Scanner;

class GameHelper {
    int getUserInput(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(msg + ": ");
        int userInput =scanner.nextInt();
        return userInput;
    }
}