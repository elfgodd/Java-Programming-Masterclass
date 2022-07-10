public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public static class TeenNumberChecker {
        public static boolean hasTeen(int nr1, int nr2, int nr3) {
            return isTeen(nr1) || isTeen(nr2) || isTeen(nr3);
        }

        public static boolean isTeen(int nr1) {
            return (nr1 >= 13 && nr1 <= 19);
        }
    }

    // Another way
    //
    // public class TeenNumberChecker {

    // public static boolean hasTeen(int age1, int age2, int age3) {

    // boolean teen = false;
    // boolean teen1 = false;
    // boolean teen2 = false;
    // boolean teen3 = false;

    // if (age1 >= 13 && age1 <= 19)
    // teen1 = true;

    // if (age2 >= 13 && age2 <= 19)
    // teen2 = true;

    // if (age3 >= 13 && age3 <= 19)
    // teen3 = true;

    // if (teen1 || teen2 || teen3) {
    // teen = true;
    // }
    // return teen;
    // }

    // public static boolean isTeen(int age) {
    // return (age >= 13 && age <= 19);
    // }
    // }

}
