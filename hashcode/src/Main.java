import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        BookDTO b1 = new BookDTO("a", "a", 12., 1999);
        BookDTO b2 = new BookDTO("b", "b", 1., 1699);
        BookDTO b3 = new BookDTO("c", "c", 129., 1979);

        Address a1 = new Address("a", 1, "a", "a");
        Person p2 = new Person("a", "b", "a");

        Point2D p = new Point2D(3, 4);
        System.out.println(p.distanceTo(p));

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Student s = new Student("a", "a", list);
        s.averageGrades();


    }
}