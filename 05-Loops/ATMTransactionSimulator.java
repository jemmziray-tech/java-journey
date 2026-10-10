public class ATMTransactionSimulator {
    public static void main(String[] args) {

        double balance = 1000;
        int transactions = 0;

        System.out.println("Starting balance: " + balance);

        while (transactions <= 2){
            balance -= 100;
            transactions += 1;
            System.out.println("Transactions " + transactions + " | " + "Remaining balance: " + balance);
        }

        System.out.println("All transactions completed!");
    }
}
