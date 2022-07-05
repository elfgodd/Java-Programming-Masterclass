public class App {
  public static void main(String[] args) throws Exception {
    System.out.println("\n");

    int highScorePosition = calculateHighScorePosition(1500);
    displayHighScorePosition(("Alberto"), highScorePosition);
    System.out.println("\n");

    highScorePosition = calculateHighScorePosition(900);
    displayHighScorePosition(("Josue"), highScorePosition);
    System.out.println("\n");

    highScorePosition = calculateHighScorePosition(400);
    displayHighScorePosition(("Yarelis"), highScorePosition);
    System.out.println("\n");

    highScorePosition = calculateHighScorePosition(50);
    displayHighScorePosition(("Maria Alejandra"), highScorePosition);
    System.out.println("\n");

    highScorePosition = calculateHighScorePosition(1000);
    displayHighScorePosition("Luigui", highScorePosition);
    System.out.println("\n");

    highScorePosition = calculateHighScorePosition(500);
    displayHighScorePosition("Mario", highScorePosition);
    System.out.println("\n");

    highScorePosition = calculateHighScorePosition(100);
    displayHighScorePosition("Yoshi", highScorePosition);
    System.out.println("\n");

  }

  public static void displayHighScorePosition(String playerName, int highScorePosition) {
    System.out.println(playerName + " managed to get into position "
        + highScorePosition + " on the high score table");
  }

  public static int calculateHighScorePosition(int playerScore) {
    int position = 4; // assuming position 4 will be returned

    if (playerScore >= 1000) {
      position = 1;
    } else if (playerScore >= 500) {
      position = 2;
    } else if (playerScore >= 100) {
      position = 3;
    }
    return position;
  }
}

// Another way
// public static int calculateHighScorePosition(int playerScore) {
// if (playerScore >= 1000) {
// return 1;
// } else if (playerScore >= 500 && playerScore < 1000) {
// return 2;
// } else if (playerScore >= 100 && playerScore < 500) {
// return 3;
// } else {
// return 4;
// }
// }
