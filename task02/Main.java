package task02;

public class Main {
    public static void main(String[] args) {
        Rectangle rec01 = new Rectangle();
        Rectangle rec02 = new Rectangle(5, 10);

        rec01.greet();
        rec01.info();

        System.out.println();

        rec02.greet();
        rec02.info();
    }
}
