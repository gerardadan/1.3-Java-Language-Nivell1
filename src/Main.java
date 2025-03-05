import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Editorial editorial = new Editorial();
        showMainMenu(editorial);
    }
    private static void showMainMenu(Editorial editorial){
        MainMenu mainMenu =  new MainMenu(editorial);
        mainMenu.showMenu();
    }
}