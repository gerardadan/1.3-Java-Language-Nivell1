public class Writer extends Employee {
    private String name;
    private final String dni;
    private static final double salary = 15000;

    public Writer(String name, String dni){
        this.name = name;
        this.dni = dni;
    }

    public String getName(){
        return this.name;
    }

    public String getDni(){
        return this.dni;
    }

    public double getSalary(){
        return salary;
    }

    public Writer getWriter(){
        return this;
    }
}
