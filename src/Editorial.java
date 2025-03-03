import java.util.ArrayList;

public class Editorial {
    ArrayList<Writer> writers;

    public Editorial(){
        writers = new ArrayList<Writer>();
    }

    public ArrayList<String> getWritersStringList(){

        ArrayList<String> writerList = new ArrayList<String>();
        for(Writer item : writers){
            writerList.add(writers.indexOf(item) + "-> " + item.name + " - " + item.dni);
            //System.out.println(writers.indexOf(item) + "-> " + item.name + " - " + item.dni);
        }

        return writerList;
    }

    public boolean addNewWriter(Writer writer){
        writers.add(writer);
        System.out.println("Se ha creado un nuevo Redactor con nombre " + writer.name + " y DNI " + writer.dni);

        return true;
    }

    public boolean deleteWriter(int index){
        if(index >= 0 && index <= writers.size()){
            writers.remove(index);
            System.out.println("Se ha eliminado correctamente");
            return true;
        }
        else{
            System.out.println("Número de redactor incorrecto");
            return false;
        }
    }
}
