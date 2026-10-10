public class ATMChecker {
    public static void main(String[] args) {

        double balance = 500;
        double withdrawal = 0;

        System.out.println("The current balance is: " + balance);

        if (withdrawal <= 0){
            System.out.println("Invalid withdrawal amount");
        }
        else if (withdrawal > balance){
            System.out.println("Insufficient funds");
        }
        else{
            System.out.println("Withdrawal successful");
            System.out.println("The remaining balance: " + (balance - withdrawal));
        }
    }
}
