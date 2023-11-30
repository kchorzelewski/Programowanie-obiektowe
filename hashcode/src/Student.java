import java.util.ArrayList;

public record Student(String imie, String nazwisko, ArrayList<Integer> oceny) {
    public void averageGrades(){
        double sum = 0;
        for (int i = 0; i < oceny.size(); i++){
            sum += oceny.get(i);
        }
        sum /= oceny.size();
        System.out.println(sum);
    }
}
