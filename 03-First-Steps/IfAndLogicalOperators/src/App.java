public class App {
    public static void main(String[] args) throws Exception {

      // ********************
      // if-then Statement
      
      boolean isAlien = false;
      if (isAlien == false) {
        System.out.println("It is not an alien!");
        System.out.println("And i am scared of aliens");
      }

      System.out.println("\n");
      int topScore = 100;
      if (topScore == 100) {
        System.out.println("Top score if equal to 100!");
      }
      topScore = 110;
      if (topScore != 100) {
        System.out.println("Top score is diff of 100!");
      }
      topScore = 110;
      if (topScore > 100) {
        System.out.println("Top score is higher than 100!");
      }
      topScore = 90;
      if (topScore < 100) {
        System.out.println("Top score is lower than 100!");
      }
      topScore = 110;
      if (topScore >= 100) {
        System.out.println("Top score is higher or equal to 100!");
      }
      topScore = 90;
      if (topScore <= 100) {
        System.out.println("Top score is lower or equal to 100!");
      }

      // ********************
      // Logical and Operator

      System.out.println("\n");
      topScore = 80;
      int secondTopScore = 60;
      if (topScore > secondTopScore && topScore < 100) {
        System.out.println("Greater than secondTopScore and less than 100");
      }

      System.out.println("\n");
      // Easier to read with parenthesss
      if ((topScore > secondTopScore) && (topScore < 100)) {
        System.out.println("Greater than secondTopScore and less than 100");
      }

      // ********************
      // Logical OR Operator

      topScore = 80;
      secondTopScore = 95;
      // This code won't run
      if((topScore > 90) || (secondTopScore <= 90)) {
        System.out.println("Either or both of the conditions are true");
      }

      // ********************
      // Assignment Operator VS Equals to Operator

      System.out.println("\n");
      int newValue = 50;
      if (newValue == 50) {
        System.out.println("This is true");
      }

      boolean isCar = false;
      if (isCar != true) {
        System.out.println("This is not supposed to happen");
      }
      if (!isCar) {
        System.out.println("This is not supposed to happen");
      }

      // ********************
      // Ternary Operator

      System.out.println("\n");
      isCar = true;
      boolean wasCar = isCar ? true : false;
      if (wasCar) {
        System.out.println("wasCar is true");
      }

      // ********************
      // Operator Precedence
      
      System.out.println("\n");
      double myFirstValue = 20.00;
      double mySecondValue = 80.00d;
      // double myValuesTotal = myFirstValue + mySecondValue * 100.00d;
      double myValuesTotal = (myFirstValue + mySecondValue) * 100.00d;
      System.out.println("MyValuesTotal = " + myValuesTotal);
      double theRemainder = myValuesTotal % 40.00d;
      System.out.println("theRemainder = " + theRemainder);
      boolean isNoRemainder = (theRemainder == 0) ? true : false;
      System.out.println("isNoRemainder = " + isNoRemainder);
      if(!isNoRemainder) {
        System.out.println("Got some remainder");
      }
    }
}
