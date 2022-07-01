public class App {
    public static void main(String[] args) throws Exception {
        
        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        System.out.println("\n");
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1; // 3 - 1 = 2
        System.out.println("3(result) - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        System.out.println("\n");
        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        System.out.println("\n");
        result = result % 3; // the remainder of(4 % 3 = 1)
        System.out.println("4 % 3 = " + result);

        System.out.println("\n");
        // result = result + 1;
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);
        // result = result - 1;
        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        System.out.println("\n");
        // result = result + 2;
        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        // result = result - 2
        result -= 2; // 3 - 2 = 1
        System.out.println("3 - 2 = " + result);

        // result = result * 10;
        result *= 10; // 1 * 10 = 10
        System.out.println("1 * 10 = " + result);

        // result = result / 3;
        result /= 3; // 10 / 3 = 10
        System.out.println("10 / 3 = " + result);

    }
}
