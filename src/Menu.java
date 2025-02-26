import java.util.Scanner;
import java.util.ArrayList;

public abstract class Menu {
    static String title;
    static ArrayList<String> options = new ArrayList<String>();

/*
    public static Menu(String title, ArrayList<String> options) {
        this.title = title;
        this.options = options;
        showMenuOptions(title, options);
    }
*/

    public abstract void selectOptionMenu(int select);
    public abstract void setMenuOptions();

    public static int showMenuOptions(String title, ArrayList<String> options){
        Scanner scanner = new Scanner(System.in);
        int select;
        do{
            System.out.println(title);
            for(int i = 0; i< options.size(); i++){
                System.out.println(i + "- " + options.get(i));
            }

            if(!scanner.hasNextInt())
                showMenuOptions(title, options);

            select = Integer.parseInt(scanner.nextLine());
        } while (!checkIfOptionValueIsCorrect(select));

        return  select;
    }

    private static boolean checkIfOptionValueIsCorrect(int select){
        return select >= 0 && select <= options.size();
    }
}
