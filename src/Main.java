import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static String[] writers;
    static Editorial editorial = new Editorial();

    public static void main(String[] args) {
        showMainMenu();

    }

    private static void showMainMenu(){

    }

    private static void addNewWriter(){
        System.out.println("Name?");
        String name = scanner.nextLine();
        System.out.println("DNI?");
        String dni = scanner.nextLine();

        //editorial.addNewWriter(new Writer(name, dni));
    }

    private static void deleteWriter(){
        int select = -1;

        System.out.println("Selecciona el redactor que quieres eliminar:");
        editorial.showWriters();
        select = Integer.parseInt(scanner.nextLine());

        editorial.deleteWriter(select);
    }

    private static void addNewsToWriter(){
        System.out.println("Tipo de noticia?");
        //int headline = scanner.nextLine();

        System.out.println("Text?");
        String text = scanner.nextLine();
        System.out.println("Puntuació?");
        String score = scanner.nextLine();
        System.out.println("Preu?");
        String price = scanner.nextLine();

    }

    private static void selectTypeOfNews(){
        System.out.println("Tipo de noticia?");
        for (News.Sports item : Arrays.asList(News.Sports.values())) {
            System.out.println(item);
        }
        int select = Integer.parseInt(scanner.nextLine());

        switch (select){
            case 0:
                //
                break;
            case 1:
                //
                break;
            case 2:
                //
                break;
            case 3:
                //
                break;
            case 4:
                //
                break;

        }
    }
}