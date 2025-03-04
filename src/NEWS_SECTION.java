import java.util.ArrayList;

public enum NEWS_SECTION {
    SPORTS,
    POLITICS,
    ECONOMY;

    public static ArrayList<String> convertEnumToStringArrayList(){
        ArrayList<String> listNewsSection = new ArrayList<String>();
        for(NEWS_SECTION item : values()){
            listNewsSection.add(item.name());
        }

        return listNewsSection;
    }
}

