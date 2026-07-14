package LogicalOperators;

public class TestDriveLogicalOperators {

    public static void main(String[] args) {
        LogicalOperators lc = new LogicalOperators();

        // AND
        int price = 350;
        String camera = lc.andExample(price);
        System.out.println("За "+ price + "$ Вам доступны камеры" +
                " фирмы " + camera);

        // OR
        lc.orExample("BQ");
        lc.orExample("Sony");
        lc.orExample("Haihao");







    }







}
