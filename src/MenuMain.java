import java.util.ArrayList;
import java.util.Scanner;

public class MenuMain extends Menu{
    static Scanner scanner = new Scanner(System.in);
    static final String title = "Opciones:";
    static final ArrayList<String> options = new ArrayList<String>();

    public MenuMain(){
        setMenuOptions();
        selectOptionMenu(Menu.showMenuOptions(title, options));
    }

    private static void addNewWriter(){
        System.out.println("Name?");
        String name = scanner.nextLine();
        System.out.println("DNI?");
        String dni = scanner.nextLine();

        //editorial.addNewWriter(new Writer(name, dni));
    }

    @Override
    public void setMenuOptions(){
        options.add("Introduir redactor");
        options.add("Eliminar redactor.");
        options.add("Introduir notícia a un redactor.");
        options.add("Eliminar notícia (ha de demanar redactor i titular de la notícia).");
        options.add("Mostrar totes les notícies per redactor.");
        options.add("Calcular puntuació de la notícia.");
        options.add("Calcular preu-notícia.");
        options.add("Finalitzar.");
    }

    @Override
    public void selectOptionMenu(int select){
        switch (select){
            case 0:
                addNewWriter();
                break;
            case 1:
                //deleteWriter();
                break;
            case 2:
                //addNewsToWriter();
                break;
            case 3:
                //
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
            default:
                //
                break;
        }
    }

}
