package OasisInfoByte;
import java.util.*;
class Account {
    int balance=  2000;
    int pin = 1234;


    private int i= 0;
    private final int j= 3;

    public void checkpin() {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter the pin:");
            int enteredpin = sc.nextInt();

            if (enteredpin == pin) {
                menu();
                return;
            } else {
                System.out.println("Invalid pin. Please enter a valid pin.");
                i++;

                if (i>=j) {
                    System.out.println("Exceeded maximum incorrect attempts.");
                    System.out.println("Your account has been temporarily locked. Please try after 5 hours");
                    return;
                }

                System.out.println("Remaining attempts: " + (j-i));
            }

        } while (true);
    }

    public void menu() {
        System.out.println("\n ATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Quit");

        System.out.print("Enter your choice: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if (choice == 1) {
            checkBalance();
        } else if (choice == 2) {
            withdrawMoney();
        } else if (choice == 3) {
            depositMoney();
        } else if (choice == 4) {
            System.out.println("Thank You");
            return;
        } else {
            System.out.println("Invalid choice ,Enter a valid choice");
        }

    }

    public void checkBalance() {
        System.out.println("Balence:" + balance);
        menu();
    }

    public void withdrawMoney() {
        System.out.println("Enter the Amount you want to withdraw");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Money withdrawn Successfully");
        } else {
            System.out.println("Insufficient Balance");
        }
        menu();
    }

    public void depositMoney() {
        System.out.println("Enter the money to deposit");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        balance = balance + amount;
        System.out.println("Amount deposited successfully");
        menu();
    }

}
public class ATMMachine
{
    public static void main(String[] args) {
        Account obj=new Account();
        obj.checkpin();

    }
}

