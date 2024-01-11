package pracownicy;

public class Main {
    public static void main(String[] args) {
        Double[] tab = {1.1, 1.2, 1.3, 1.4, 2.2};
        Employee e1 = new Employee("Robert", tab);
        Employee e2;
        try {
            e2 = (Employee) e1.clone();
        } catch (CloneNotSupportedException e){
            throw new RuntimeException(e);
        }

        e1.salaries[5] = 99.0;
        System.out.println(e2.salaries[5].toString());
    }
}
