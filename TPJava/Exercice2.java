import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le premier nombre : ");
        int nombre1 = scanner.nextInt();

        System.out.print("Entrez le deuxieme nombre : ");
        int nombre2 = scanner.nextInt();

        int somme = nombre1 + nombre2;
        System.out.println("La somme des deux nombres est : " + somme);

        scanner.close();
    }
}