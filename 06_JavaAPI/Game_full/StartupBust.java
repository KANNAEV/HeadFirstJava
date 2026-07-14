package Game_full;


import java.util.ArrayList;

public class StartupBust {

    private GameHelper helper = new GameHelper();               // Создание экземпляра класса
    private ArrayList<Startup> startups = new ArrayList<>();    // Массив стартапов
    private int numOfGuesses = 0;                               // Счетчик ходов

    //
    private void setUpGame() {
        // Сперва создадим 3 стартапа и добавим в наш список startups

        // Создание стартапов: создаем объект стартап и через сеттер задаем имя стартапам
        Startup one = new Startup();
        one.setName("poniez");
        Startup two = new Startup();
        two.setName("hacqi");
        Startup three = new Startup();
        three.setName("cabista");

        // Добавление в динамический список startups
        startups.add(one);
        startups.add(two);
        startups.add(three);

        // Вывод условий игры
        System.out.println("Ваша цель — потопить три стартапа.");
        System.out.println("poniez, hacqi, cabista");
        System.out.println("Постарайтесь потопить их все, сделав как можно меньше попыток.");

        // Для каждого стартапа создаем список координат
        for (Startup startup : startups) {
            ArrayList<String> newLocation = helper.placeStartup(3);
            startup.setLocationCells(newLocation);
        } // close for loop
    } // close setUpGame method

    private void startPlaying() {
        while (!startups.isEmpty()) {
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        } // close while
        finishGame();
    } // close startPlaying method

    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "miss"; // assume a miss until told otherwise

        for (Startup startupToTest : startups) {
            result = startupToTest.checkYourself(userGuess);

            if (result.equals("hit")) {
                break;
            }
            if (result.equals("kill")) {
                startups.remove(startupToTest); // he's gone
                break;
            }
        } // close for

        System.out.println(result);
    } // close method

    private void finishGame() {
        System.out.println("All Startups are dead! Your stock is now worthless");
        if (numOfGuesses <= 18) {
            System.out.println("It only took you " + numOfGuesses + " guesses.");
            System.out.println("You got out before your options sank.");
        } else {
            System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
            System.out.println("Fish are dancing with your options");
        }
    } // close method

    public static void main(String[] args) {
        StartupBust game = new StartupBust();
        game.setUpGame();
        game.startPlaying();
    } // close method
}
