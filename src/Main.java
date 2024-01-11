import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int nombre1 = 0, nombre2 = 0;
        String symbol = " ";
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Entrez le premier nombre : ");
            nombre1 = Integer.parseInt(scanner.nextLine());

            scanner = new Scanner(System.in);
            System.out.println("Entrez le deuxieme nombre : ");
            nombre2 = Integer.parseInt(scanner.nextLine());

            scanner = new Scanner(System.in);
            System.out.println("Choisissez l'operation (+, -, *, /) : ");
            symbol = scanner.nextLine();

        } catch(Exception error){
            System.out.println("Entrez un numero valide!");
        }


        int resultat = 0;

        switch (symbol) {
            case "+": resultat = nombre1 + nombre2;
            break;
            case "-": resultat = nombre1 - nombre2;
            break;
            case "*": resultat = nombre1 * nombre2;
            break;
            case "/":
                try {
                    resultat = nombre1 / nombre2;
                } catch(Exception error){
                    System.out.println("Vous ne pouvez pas diviser par 0 ");
                }

            break;
            default: System.out.println("Operation invalide");
        }
        System.out.println("Resultat : " + resultat);




    }
}