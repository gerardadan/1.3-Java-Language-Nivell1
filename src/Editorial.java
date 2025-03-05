import java.util.ArrayList;

public class Editorial {
    private ArrayList<Writer> writersList;
    private ArrayList<News> newsList;

    public Editorial(){
        this.writersList = new ArrayList<Writer>();
        this.newsList = new ArrayList<News>();
    }

    public ArrayList<Writer> getWritersStringList(){
        return this.writersList;
    }

    public boolean addNewWriter(Writer writer){
        writersList.add(writer);
        return true;
    }

    public boolean deleteWriter(int index){
        if(index >= 0 && index <= writersList.size()){
            writersList.remove(index);
            return true;
        }
        else{
            return false;
        }
    }
}
