import java.util.ArrayList;
import java.util.Scanner;

public class EditorialMenu extends Menu{

    static void addNewWriter(Editorial editorial){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name?");
        String name = scanner.nextLine();
        System.out.println("DNI?");
        String dni = scanner.nextLine();

        editorial.addNewWriter(new Writer(name, dni));
    }

    //!!!!!!!!!!!revisar como hacer no es static como la de ADD)
    private void deleteWriter(Editorial editorial){
        Scanner scanner = new Scanner(System.in);
        String title = "Selecciona el redactor que quieres eliminar:";
        selectOptionMenu(Menu.showMenuOptions(title, editorial.getWritersStringList()));

        editorial.deleteWriter(Integer.parseInt(scanner.nextLine()));
    }

    @Override
    protected void selectOptionMenu(int select) {

    }
}
