import java.util.Scanner;

public class Main {




    public static void main(String[] args) {

        Pryamokutnyk p1 = new Pryamokutnyk();
        p1.setL(5);
        p1.setW(3);
        System.out.println("Площа прямокутника: " + p1.ploshcha());
        System.out.println("Периметр прямокутника: " + p1.perymetr());

        Kolo k1 = new Kolo();
        k1.setR(15);
        System.out.println("Площа кола: " + k1.PloshchaKola());
        System.out.println("Периметр кола: " + k1.perKola());

        Dog dog = new Dog();
        dog.setName("Jack");
        dog.voice();
    }
}
