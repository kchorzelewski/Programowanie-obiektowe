package playlist;

import java.util.Arrays;

public class main2 {
    public static void main(String[] args) {
        System.out.println("test");

        Song s1 = new Song("A", "X", 1);
        Song s2 = new Song("B", "Y", 2);
        Song s3 = new Song("C", "Z", 3);

        Song[] tab = {s3, s1, s2};

        // tab = Arrays.sort(tab, new DurationComparator());


    }
}
