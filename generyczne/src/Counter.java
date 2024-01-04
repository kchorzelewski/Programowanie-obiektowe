import java.util.ArrayList;

public class Counter <T>{
    T t;
    int counter = 0;
    ArrayList<T> list = new ArrayList<T>();
    public void add(T element){
        list.add(element);
        counter++;
    }
    public int getCount(){
        return counter;
    }
}
