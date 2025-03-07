import java.util.Scanner;
import java.util.ArrayList;

abstract class Menu {
    protected static Scanner scanner = new Scanner(System.in);
    private static String title;
    static ArrayList<String> options = new ArrayList<String>();

    protected abstract void selectOptionMenu(int select);

    protected static int showMenuOptions(String title, ArrayList<String> options){
        if(options.size() <= 0)
            return 0;

        int select;
        do{
            System.out.println(title);

            for(int i = 0; i< options.size(); i++){
                System.out.println(i + "- " + options.get(i));
            }
            if(!scanner.hasNextInt()) {
                showMenuOptions(title, options);
            }
            select = Integer.parseInt(scanner.nextLine());
        } while (!checkIfOptionValueIsCorrect(select, options.size()));

        return  select;
    }

    private static boolean checkIfOptionValueIsCorrect(int select, int maxRange){
        return select >= 0 && select <= maxRange;
    }

}
