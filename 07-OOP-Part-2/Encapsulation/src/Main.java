public class Main {
    public static void main(String[] args) throws Exception {
        // Player player = new Player();
        // player.fullName = "Alberto";
        // player.health = 20;
        // player.weapon = "Sword";

        // int damage = 10;
        // player.loseHealth(damage);
        // System.out.println("Remaining health = " + player.healthRemainig());

        // damage = 11;
        // player.health = 200;
        // player.loseHealth(damage);
        // System.out.println("Remaining health = " + player.healthRemainig());

        // damage = 190;
        // player.loseHealth(damage);
        // System.out.println("Remaining health = " + player.healthRemainig());

        EnhancedPlayer player = new EnhancedPlayer("Alberto", 200, "Sword");
        System.out.println("Initial health is " + player.getHealth());

    }
}
