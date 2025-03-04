import java.util.ArrayList;

public class Editorial {
    private ArrayList<Writer> writers;

    public Editorial(){
        this.writers = new ArrayList<Writer>();
    }

    public ArrayList<Writer> getWritersStringList(){

        return this.writers;
    }

    public boolean addNewWriter(Writer writer){
        writers.add(writer);
        return true;
    }

    public boolean deleteWriter(int index){
        if(index >= 0 && index <= writers.size()){
            writers.remove(index);
            return true;
        }
        else{
            return false;
        }
    }
}
