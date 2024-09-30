import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Raphael Paquin
 * @version 01
 * Exercice aide à la réussite.
 * 2024-09-23
 */
public class Main {

    public static int Quiz() {
        try {
            File fichier = new File("src/main/resources/input.txt");
            Scanner lecteur = new Scanner(fichier);

            while (lecteur.hasNextLine()) {
                String ligne = lecteur.nextLine();
                System.out.println(ligne); // Here

            }

            lecteur.close();
        } catch (FileNotFoundException e) {
            System.out.println("Le fichier n'a pas été trouvé.");
        }

        return 0;
    }

    public static void main(String[] args) {
        int answer = 433;
        int result = Quiz();
        if (result == answer) {
            System.out.println("BRAVO");;
        } else {
            System.out.println("Incorrect answer: " + result + " The expected output is " + answer);
        }
    }
}