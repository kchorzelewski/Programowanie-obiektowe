package pracownicy;

public class Employee implements Cloneable{
    String name;

    Double[] salaries = new Double[12];

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    Employee(String name, Double[] salaries){
        this.salaries = salaries;
        this.name = name;
    }

}
