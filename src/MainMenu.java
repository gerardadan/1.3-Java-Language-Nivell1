import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MainMenu extends Menu{
    static Editorial editorial = new Editorial();
    static final String title = "Opciones:";
    static final ArrayList<String> options = new ArrayList<>(Arrays.asList(
            "Introduir redactor",
            "Eliminar redactor.",
            "Introduir notícia a un redactor.",
            "Eliminar notícia (ha de demanar redactor i titular de la notícia).",
            "Mostrar totes les notícies per redactor.",
            "Calcular puntuació de la notícia.",
            "Calcular preu-notícia.",
            "Finalitzar."
    ));

    public MainMenu(){
        selectOptionMenu(Menu.showMenuOptions(title, options));
    }

    public void showMenu(){
        selectOptionMenu(Menu.showMenuOptions(title, options));
    }

    @Override
    protected void selectOptionMenu(int select){
        switch (select){
            case 0:
                EditorialMenu.addNewWriter(editorial);
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
        showMenu();
    }

    /*
    private static void addNewWriter(){
        System.out.println("Name?");
        String name = scanner.nextLine();
        System.out.println("DNI?");
        String dni = scanner.nextLine();

        //editorial.addNewWriter(new Writer(name, dni));
    }
*/

}
