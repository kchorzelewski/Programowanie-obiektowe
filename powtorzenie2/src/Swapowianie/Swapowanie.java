package Swapowianie;

public class Swapowanie {

    public static <T> void swap(T[] myArray, int x, int y){
        if(x >= myArray.length || y >= myArray.length){
            return;
        }
        T cos = myArray[x];
        myArray[y] = myArray[y];
        myArray[y] = cos;
        for (int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }

    }

    public static void main(String[] args) {
        Integer[] tablica = {4, 5, 6, 3, 1, 6, 3};

        Swapowanie zmien = new Swapowanie();
        swap(tablica, 3, 6);
    }
}
