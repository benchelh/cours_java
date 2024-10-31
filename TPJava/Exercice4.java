
import java.util.Scanner;

public class Exercice4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la temperature en degres Celsius : ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println(celsius + " degres Celsius equivalent a " + fahrenheit + " degres Fahrenheit.");

        scanner.close();
    }
}
