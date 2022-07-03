public class App {
    public static void main(String[] args) throws Exception {
        
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

        System.out.println("\n");
        topScore = 80;
        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100) {
          System.out.println("Greater than secondTopScore and less than 100");
        }

        System.out.println("\n");
        // Easier to read with parenthesis
        if ((topScore > secondTopScore) && (topScore < 100)) {
          System.out.println("Greater than secondTopScore and less than 100");
        }
        topScore = 80;
        secondTopScore = 95;
        // This code won't run
        if((topScore > 90) || (secondTopScore <= 90)) {
          System.out.println("Either or both of the conditions are true");
        }
    }
}
