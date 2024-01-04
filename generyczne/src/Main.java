import jdk.jfr.Unsigned;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal2 = new Animal();
        Box<Animal, String> box = new Box<>(animal, "czesc");
        box.value.dajGlos();
        Box<String, Animal> box2 = new Box<>("Czesc", animal);
        Box<String, String> box3 = new Box<>("Czesc", "Do widzenia");
        wypisz("czesc");
        wypisz(animal);
        wypisz(3);
        isEqual<Animal, Animal> isequal = new isEqual<>(animal, animal2);
        System.out.println(isequal.equals(animal, animal2));

        Integer[] list = {1,2,3,4};

        swap(list, 0, 2);
        System.out.println(list);

        String[] list1 = {"A", "B", "C", "D"};
        Integer[] list2 = {1, 2, 3, 4};
        Double[] list3 = {1.0, 2.0, 3.0, 4.0};
        Person<Person> person2 = new Person<Person>();
        Person<Person> person1 = new Person<Person>();
        Person[] list4 = {person1, person2};
        // System.out.println(minValue(list4));

        Animal animal3 = new Animal();
        Animal animal4 = new Animal();

    }
    public static <T> void wypisz(T value){
        System.out.println(value);

    }

    public static <T> void swap(T[] list, int ind1, int ind2){
        if (ind1 < list.length || ind2 < list.length){
            T temp = list[ind1];
            list[ind1] = list[ind2];
            list[ind2] = temp;
        }
    }

    public static <T extends Comparable<T>> T minValue(T[] list){
        T smallest = null;
        if(list.length > 0){
            smallest = list[0];
            for(int i = 0; i < list.length; i++){
                if(smallest.compareTo(list[i]) > 0){
                    smallest = list[i];
                }
            }
        }
        return smallest;
    }
    public static <T extends Animal> Animal findMax(T element1, T element2){
        if (element1.wiek > element2.wiek) {
            return element1;
        }
        return element2;
    }

    public static <T> tree

}