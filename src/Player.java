public class Player {

    // how much the player currently has
    private int balance;
    // array of current upgrades
    //private Upgrades upgrades[];

    private int clickPower;

    Player(){
        balance = 0;
        clickPower = 1;
    }

    public void updateBalance(int amount) {
        balance += amount;
    }
    public void displayBalance(){
        System.out.println("Balance: " + balance);
    }
    /*
    maybe a click modifier
     */
}
