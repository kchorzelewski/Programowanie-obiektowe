public class Main {
    public static void main(String[] args) {

        StringBuilder test = new StringBuilder("Piesek12 #24Romek");
        System.out.println(test);
        capitalizeEverySecond(test);
        System.out.println(test);

    }
    public static void capitalizeEverySecond(StringBuilder bld){
        for (int i = 1; i < bld.length(); i += 2){
            bld.setCharAt(i, Character.toUpperCase(bld.charAt(i)));
        }
    }


}
