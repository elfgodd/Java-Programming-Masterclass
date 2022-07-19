import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth:");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine(); // handle next like character (enter key)

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        int age = 2022 - yearOfBirth;

        System.out.println("You name is " + name + ", and you are " + age + " years old.");

        scanner.close();
    }

}
