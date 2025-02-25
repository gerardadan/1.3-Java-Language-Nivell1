import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static String[] writers;
    static Editorial editorial = new Editorial();
    public static void main(String[] args) {

        int select = -1;
        int num1 = 0, num2 = 0;

        while(select != 0){
            System.out.println("Opcions:");
            System.out.println("1-Introduir redactor");
            System.out.println("2-Eliminar redactor.");
            System.out.println("3-Introduir notícia a un redactor.");
            System.out.println("4-Eliminar notícia (ha de demanar redactor i titular de la notícia).");
            System.out.println("5-Mostrar totes les notícies per redactor.");
            System.out.println("6-Calcular puntuació de la notícia.");
            System.out.println("7-Calcular preu-notícia.");
            System.out.println("0-Finalitzar.");

            select = Integer.parseInt(scanner.nextLine());

            switch (select){
                case 1:
                    addNewWriter();
                    break;
                case 2:
                    deleteWriter();
                    break;
                case 3:
                    addNewsToWriter();
                    break;
                case 4:
                    //
                    break;
                case 5:
                    //
                    break;
                case 6:
                    //
                    break;
                case 7:
                    //
                    break;
                case 0:
                    //
                    break;
                default:
                    //
                    break;
            }
        }
    }

    private static void addNewWriter(){
        System.out.println("Name?");
        String name = scanner.nextLine();
        System.out.println("DNI?");
        String dni = scanner.nextLine();

        editorial.addNewWriter(new Writer(name, dni));
    }

    private static void deleteWriter(){
        int select = -1;

        System.out.println("Selecciona el redactor que quieres eliminar:");
        editorial.showWriters();
        select = Integer.parseInt(scanner.nextLine());

        editorial.deleteWriter(select);
    }

    private static void addNewsToWriter(){
        System.out.println("Titular?");
        String headline = scanner.nextLine();
        System.out.println("Text?");
        String text = scanner.nextLine();
        System.out.println("Puntuació?");
        String score = scanner.nextLine();
        System.out.println("Preu?");
        String price = scanner.nextLine();


    }
}