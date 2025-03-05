import java.util.*;

public class EditorialMenu extends Menu{
    private Scanner scanner = new Scanner(System.in);

    String addNewsToWriter(){
        String resultMessage = "";
        try{
            System.out.println("Titular?");
            String title = scanner.nextLine();
            System.out.println("Text?");
            String text = scanner.nextLine();
            System.out.println("Puntuació?");
            double score = Double.parseDouble(scanner.nextLine());
            System.out.println("Preu?");
            double price = Double.parseDouble(scanner.nextLine());
            selectTypeOfNews();

            SportNews news = new SportNews(title, score, price);
            news.setNewsText(text);

            resultMessage = "Se ha creado correctamente una nueva noticia";
        } catch (Exception e){
            resultMessage = "Error Add News";
        }

        return resultMessage;
    }

    void selectTypeOfNews(){
        String title = "Tipo de noticia?";
        Menu.showMenuOptions(title, NewsSections.convertEnumToStringArrayList());
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

    String addNewWriter(Editorial editorial){
        String resultMessage = "";
        try {
            System.out.println("Name?");
            String name = scanner.nextLine();
            System.out.println("DNI?");
            String dni = scanner.nextLine();

            editorial.addNewWriter(new Writer(name, dni));
            resultMessage = "Se ha creado un nuevo Redactor con nombre " + name + " y DNI " + dni;
        } catch (Exception e) {
            resultMessage = "Error Add User";
        }

        return resultMessage;
    }

    String deleteWriter(Editorial editorial){
        String resultMessage = "";
        try {
            String title = "Selecciona el redactor que quieres eliminar:";
            int select = Menu.showMenuOptions(title, getWritersStringList(editorial));
            editorial.deleteWriter(select);

            resultMessage = "Se ha eliminado correctamente";
        } catch (Exception e){
            resultMessage = "Error Delete User";
        }

        return resultMessage;
    }

    public ArrayList<String> getWritersStringList(Editorial editorial){
        ArrayList<Writer> writers = editorial.getWritersStringList();
        ArrayList<String> writerList = new ArrayList<String>();
        for(Writer item : writers){
            writerList.add(item.getName() + " - " + item.getDni());
        }

        return writerList;
    }

    @Override
    protected void selectOptionMenu(int select){
    }

}
