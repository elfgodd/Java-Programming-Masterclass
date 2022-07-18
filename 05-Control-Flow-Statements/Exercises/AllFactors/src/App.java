public class App {
    public static void main(String[] args) throws Exception {

    }

    public static class FactorPrinter {
        public static void printFactors(int number) {
            if (number < 1) {
                System.out.print("Invalid Value");
                return; // add to "break" out of the method
            }
            // for(int i=1; i<=number; i++){
            for (int i = 1; i <= number / 2; i++) { // optimize to loop just half of the number
                if (number % i == 0)
                    System.out.print(i + " ");
            }
            System.out.print(number); // print last value
        }
    }

    // Another way to solve this challenge
    // public class FactorPrinter {

    // // public static int printFactors(int number){
    // public static void printFactors(int number) { // use void as return type

    // if (number < 1) {
    // // System.out.println("Invalid value");
    // System.out.println("Invalid Value"); // capital V
    // }
    // int i = 1;
    // while (i <= number) {
    // if (number % i == 0) {
    // // System.out.print(i);
    // System.out.println(i); // use println so i isn't concatenated
    // }
    // i++;
    // }
    // }
    // }

}
