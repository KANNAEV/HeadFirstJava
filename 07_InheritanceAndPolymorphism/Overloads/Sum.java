package Overloads;

public class Sum {

    public int addNumbs(int a, int b) {
        return a + b;
    }

    public double addNumbs(double a, double b) {
        return a + b;
    }


    public static void main(String[] args) {

        Sum sum = new Sum();

        System.out.println(sum.addNumbs(1, 2));
        System.out.println(sum.addNumbs(1.5, 2.534));

    }
}
