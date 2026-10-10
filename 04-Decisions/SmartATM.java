public class SmartATM {
    public static void main(String[] args) {

        double balance = 500;
        double withdrawal = 600;
        boolean cardBlocked = false;

        if (cardBlocked){
            System.out.println("Card is blocked");
        } else if (withdrawal <=0) {
            System.out.println("Invalid amount");
        } else if (withdrawal > balance){
            System.out.println("Insufficient funds");
        } else if(!cardBlocked && withdrawal> 0 && withdrawal <= balance){
            System.out.println("Withdrawal has been approved!");
            System.out.println("Remaining balance: " + (balance - withdrawal));
        }
}}
