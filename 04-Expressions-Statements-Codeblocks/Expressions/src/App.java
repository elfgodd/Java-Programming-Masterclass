public class App {
  public static void main(String[] args) throws Exception {

    // ********************
    // Keywords And Expressions

    // A mile is equal to 1.609344 kilometres
    double kilometres = (100 * 1.609344);
    int highScore = 50;

    if (highScore == 50) {
      System.out.println("This is an expression");
    }
    // the expressions in the code on top are
    // kilometres = (100 * 1.609344);, highScore = 50;, "This is an expression"

    System.out.println("\n");
    // ********************
    // Statements, Whitespace and Indentation (Code Organization)

    int myVariable = 50;
    myVariable++;
    myVariable++;
    System.out.println("myVariable = " + myVariable);

    System.out.println("This is" +
        " another" +
        " still more.");

    int anotherVariable = 50;
    anotherVariable--;
    System.out.println("anotherVariable = " + anotherVariable);

    System.out.println("\n");
    // ********************
    // Code Blocks And The If Then Else Control Statements

    boolean gameOver = true;
    int score = 5000;
    int levelCompleted = 5;
    int bonus = 100;

    // Example of Code Block
    if (score == 5000)
      System.out.println("Your score was 5000");

    System.out.println("This was executed");

    if (score < 5000 && score > 1000) {
      System.out.println("Your score wass less than 5000 but greater than 1000");
    } else if (score < 1000) {
      System.out.println("Your score was less than 1000");
    } else {
      System.out.println("Got here");
    }

    System.out.println("\n");
    if (gameOver == true) {
      int finalScore = score + (levelCompleted * bonus);
      finalScore += 1000;
      System.out.println("Your final score was = " + finalScore);
    }

    // Error finalScore is inside code block, out of scope
    // int savedFinalScore = finalScore;
    // System.out.println("savedFinalScore = " + savedFinalScore);

    System.out.println("\n");
    boolean newGameOver = true;
    int newScore = 10000;
    int newLevelCompleted = 8;
    int newBonus = 200;

    if (gameOver) {
      int finalScore = newScore + (newLevelCompleted * newBonus);
      System.out.println("Your final score was = " + finalScore);
    }

  }
}
