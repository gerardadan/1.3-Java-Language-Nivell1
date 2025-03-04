import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MainMenu extends Menu{
    protected Editorial editorial;
    private EditorialMenu editorialMenu;
    private static final String title = "Opciones:";
    private static final ArrayList<String> options = new ArrayList<>(Arrays.asList(
            "Introduir redactor",
            "Eliminar redactor.",
            "Introduir notícia a un redactor.",
            "Eliminar notícia (ha de demanar redactor i titular de la notícia).",
            "Mostrar totes les notícies per redactor.",
            "Calcular puntuació de la notícia.",
            "Calcular preu-notícia.",
            "Finalitzar."
    ));

    public MainMenu(Editorial editorial){
        this.editorial = editorial;
    }

    public void showMenu(){
        this.editorialMenu = new EditorialMenu();
        selectOptionMenu(Menu.showMenuOptions(title, options));
    }

    @Override
    protected void selectOptionMenu(int select){
        switch (select){
            case 0:
                editorialMenu.addNewWriter(this.editorial);
                break;
            case 1:
                editorialMenu.deleteWriter(this.editorial);
                break;
            case 2:
                editorialMenu.addNewsToWriter();
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

}
