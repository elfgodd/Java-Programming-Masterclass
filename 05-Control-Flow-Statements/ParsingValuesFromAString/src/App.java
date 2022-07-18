public class App {
    public static void main(String[] args) throws Exception {
        String numberAsString = "2022";
        System.out.println("numberAsString = " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;

        System.out.println("\n");
        System.out.println("numberAsString = " + numberAsString); // 20221
        System.out.println("number = " + number); // 2023

        numberAsString = "2022.125";
        double numberDouble = Double.parseDouble(numberAsString);
        System.out.println("numberAsString = " + numberAsString);
    }
}
