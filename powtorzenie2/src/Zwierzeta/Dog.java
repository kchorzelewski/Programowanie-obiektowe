package Zwierzeta;

public class Dog extends Animal{
    int wzrost;

    public Dog(int wiek){
        super(wiek);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "wzrost=" + wzrost +
                '}';
    }
}
