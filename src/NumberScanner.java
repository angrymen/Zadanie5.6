import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class NumberScanner {

    int number;

    public NumberScanner() {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber() {

        System.out.println("Podaj liczbę całkowitą:");
        Scanner scanner = new Scanner(System.in);
        this.number = scanner.nextInt();

        for (int i = this.number; i < 100 || i > 200; i++) {
            if (this.number < 100) {
                System.out.println("Podana liczba jest za mała");
                System.out.println("Podaj kolejną liczbę:");
                this.number = scanner.nextInt();
            }
            else if (this.number > 200) {
                System.out.println("Podana liczba jest za duża");
                System.out.println("Podaj kolejną liczbę:");
                this.number = scanner.nextInt();
            }

            else if (this.number%3 != 0) {

                System.out.println("Podana nie jest podzielna przez 3");
                System.out.println("Podaj kolejną liczbę:");
                this.number = scanner.nextInt();
            }
        }
            System.out.println("Wspaniale! Twoja liczba jest ok! Dzięki!");

    }
}
