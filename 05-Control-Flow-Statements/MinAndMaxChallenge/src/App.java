import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        // int min = 2147483647;
        int min = Integer.MAX_VALUE;
        // int max = -2147483648;
        int max = Integer.MIN_VALUE;

        while (true) {
            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            } else {
                break;
            }
            scanner.nextLine(); // handle input
        }
        System.out.println("min = " + min + " " + "max = " + max);
        scanner.close();
    }

    // Scanner scanner = new Scanner(System.in);

    // int min = 0;
    // int max = 0;
    // boolean first = true;

    // while (true) {
    // System.out.println("Enter number:");
    // boolean isAnInt = scanner.hasNextInt();

    // if (isAnInt) {
    // int number = scanner.nextInt();

    // // This is a flag to set first values
    // if (first) {
    // first = false;
    // min = number;
    // max = number;
    // }

    // if (number > max) {
    // max = number;
    // }

    // if (number < min) {
    // min = number;
    // }

    // } else {
    // break;
    // }

    // scanner.nextLine(); // handle input
    // }

    // System.out.println("min = " + min + " " + "max = " + max);

    // scanner.close();

    // }
}
