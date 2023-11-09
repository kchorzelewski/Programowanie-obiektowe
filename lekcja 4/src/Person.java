public class Person{
    private String firstName;
    protected String lastName;
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

}

class Employee extends Person{

    public Employee(String firstName, String lastName){
        super(firstName, lastName);
    }
    void displayData(String firstName, String lastName){
        System.out.println(firstName);
        System.out.println(lastName);
    }
}

