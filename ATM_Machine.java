import java.util.InputMismatchException;
import java.util.Scanner;

interface ATM {
   public void withdraw(double amount);

   public void deposit(double amount);

   public void balance();
}

class bankAccount implements ATM {
    private double balance = 0;

    public void withdraw(double amount) {
        if (balance >= amount) {
            System.out.println("Withdraw Completed Successfully -> " + amount);
            balance -= amount;
        } else
            System.out.println("Insufficient Balance");
    }

    public void deposit(double amount) {
        System.out.println("Amount Deposited Successfully -> " + amount);
        balance += amount;
    }

    public void balance() {
        System.out.println("Available Balance -> " + balance);
    }

}

class user_account {
    public void start() {
        System.out.println("\n\t\t\t\t\t\t********Welcome To ATM Center********");
        bankAccount account = new bankAccount();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nAVAILABLE OPTIONS");
            System.out.println("------------------");
            System.out.println("1.Withdraw\n2.Deposit\n3.Balance\n4.Exit");
            try {
                System.out.print("Enter Your Choice : ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter Amount To Withdraw : ");
                        double withdraw_amount = sc.nextDouble();
                        account.withdraw(withdraw_amount);
                        break;
                    case 2:
                        System.out.print("Enter Amount To Deposit : ");
                        double deposit_amount = sc.nextDouble();
                        account.deposit(deposit_amount);
                        break;
                    case 3:
                        account.balance();
                        break;
                    case 4:
                        System.out.println("\t\t\t\t\tTHANK YOU\n");
                        sc.close();
                        System.exit(0);
                    default:
                        System.out.println("Choose Correct Option");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number ");
                sc.next();
            }
        }
    }
}

public class ATM_Machine {
    public static void main(String[] args) {
        user_account user = new user_account();
        user.start();
    }
}