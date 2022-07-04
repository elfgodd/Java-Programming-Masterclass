public class App {
  public static void main(String[] args) throws Exception {
    boolean gameOver = true;
    int score = 800;
    int levelCompleted = 5;
    int bonus = 100;

    // calculateScore(gameOver, score, levelCompleted, bonus);

    int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
    System.out.println("Your final score was = " + highScore);

    gameOver = true;
    score = 10000;
    levelCompleted = 8;
    bonus = 200;

    // calculateScore(gameOver, score, levelCompleted, bonus);

    highScore = calculateScore(gameOver, score, levelCompleted, bonus);
    System.out.println("Your final score was = " + highScore);

  }

  public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

    if (gameOver) {
      int finalScore = score + (levelCompleted * bonus);
      finalScore += 1000;
      // System.out.println("Your final score was = " + finalScore);
      return finalScore;
    }
    return -1;
  }
}
