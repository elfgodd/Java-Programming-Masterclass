public class App {
  public static void main(String[] args) throws Exception {
    int newScore = calculateScore("Alberto", 500);
    System.out.println("\n");

    System.out.println("New score is " + newScore);

    System.out.println("\n");
    calculateScore(75);

    System.out.println("\n");
    calculateScore();

    System.out.println("\n");

    calcFeetAndInchesToCentimeters(6, 0);
    calcFeetAndInchesToCentimeters(7, 5);
    calcFeetAndInchesToCentimeters(-10, 1);
    calcFeetAndInchesToCentimeters(0, 1);
    calcFeetAndInchesToCentimeters(6, -10);

    double centimeters = calcFeetAndInchesToCentimeters(6, 13);
    if (centimeters < 0.0) {
      System.out.println("Invalid parameters");
    }

    System.out.println("\n");
    calcFeetAndInchesToCentimeters(100);
    calcFeetAndInchesToCentimeters(157);
    calcFeetAndInchesToCentimeters(-10);

  }

  public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
    if ((feet < 0) || ((inches < 0) || (inches > 12))) {
      System.out.println("Invalid feet or inches parameters");
      return -1;
    }

    double centimeters = (feet * 12) * 2.54;
    centimeters += inches * 2.54;
    System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
    return centimeters;
  }

  public static double calcFeetAndInchesToCentimeters(double inches) {
    if (inches < 0) {
      return -1;
    }

    double feet = (int) inches / 12;
    double remainingInches = (int) inches % 12;
    System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
    return calcFeetAndInchesToCentimeters(feet, remainingInches);
  }

  public static int calculateScore(String playerName, int score) {
    System.out.println("Player " + playerName + " scored " + score + " points");
    return score * 1000;
  }

  public static int calculateScore(int score) {
    System.out.println("Unnamed player scored " + score + " points");
    return score * 1000;
  }

  public static int calculateScore() {
    System.out.println("No player name, No player score.");
    return 0;
  }

}