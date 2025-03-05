import java.util.ArrayList;

public enum NewsSections {
    SPORTS,
    POLITICS,
    ECONOMY;

    public static ArrayList<String> convertEnumToStringArrayList(){
        ArrayList<String> listNewsSection = new ArrayList<String>();
        for(NewsSections item : values()){
            listNewsSection.add(item.name());
        }

        return listNewsSection;
    }
}

