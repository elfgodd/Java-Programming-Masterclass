public class Hello {
  public static void main(String[] args) {

    System.out.println("Hello World");

    int myFirstNumber = 5;
    double myFirstDouble = 5.5;
    
    System.out.println("\n");
    System.out.println(myFirstNumber + myFirstDouble); // 10.5

    System.out.println("\n");
    double multi2Nums = myFirstNumber * myFirstDouble;
    System.out.println(multi2Nums); // 27.5

    System.out.println("\n");
    int operations2Nums = (10 + 40) + (2 * 20); // 90
    System.out.println(operations2Nums);
    
    System.out.println("\n");
    int mySecondNumber = 12;
    int myThirdNumber = myFirstNumber * 2;
    int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
    System.out.println(myTotal); // 27

    System.out.println("\n");
    int myLastOne = 1000 - myTotal;
    System.out.println(myLastOne); // 973

  }
}