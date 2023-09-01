package task01;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner iScanner = new Scanner (System.in);

        Owner owner1 = new Owner("Иван");
        System.out.println("Введите имя кота:");
        String name = iScanner.nextLine();
        System.out.println("Введите возраст кота:");
        int age = Integer.parseInt(iScanner.nextLine());

        Cat cat1 = new Cat(name, age, owner1);

        cat1.greet();

        iScanner.close();
    }
}
