
public class SimpleStartupTestDrive {

    public static void main(String[] args) {

        SimpleStartup dot = new SimpleStartup();
        int[] locations = { 2, 3, 4 };
        dot.setLocationCells(locations);

        int userGuess = 2;
        String result = dot.checkYourself(userGuess);
        String testResult = "провален";

        if (result.equals("попал")) {
            testResult = "Тест пройден";
        }
        System.out.println(testResult);

        userGuess = 3;
        dot.checkYourself(userGuess);
        userGuess = 4;
        result = dot.checkYourself(userGuess);

        testResult = "провален";
        if (result.equals("убил")) {
            System.out.println(testResult);
        }
    }

}
