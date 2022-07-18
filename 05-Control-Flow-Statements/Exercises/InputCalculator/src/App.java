import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    }

    public static class InputCalculator {
        public static void inputThenPrintSumAndAverage() {
            Scanner scanner = new Scanner(System.in);
            int sum = 0;
            int count = 0;

            while (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                count++;
                // scanner.nextLine(); // not really needed because we don't need to print an
                // alert for invalid number
                // however, inputting multiple numbers separated by space will add all numbers
            }
            System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum / count));
            scanner.close();
        }
    }

    // Another way to solve this challenge
    // import java.util.Scanner;

    // public class InputCalculator {
    // public static void inputThenPrintSumAndAverage() {

    // Scanner scanner = new Scanner(System.in);
    // int number = 0;
    // double sum = 0;
    // double avg = 0;
    // int count = 0;

    // while (true) {
    // boolean hasInt = scanner.hasNextInt();
    // if (hasInt) {
    // number = scanner.nextInt();
    // sum += number;
    // count++;
    // } else {
    // break;
    // }
    // }
    // scanner.nextLine();
    // avg = (sum / count);

    // System.out.println("SUM = " + Math.round(sum) + " AVG = " + Math.round(avg));
    // scanner.close();
    // }
    // }
}
