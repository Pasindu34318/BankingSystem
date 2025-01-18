import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double balance = 0;
        boolean isRunning = (true);
        int choice;

        while (isRunning == true) {
            System.out.println("************** ");
            System.out.println("BANKING SYSTEM ");
            System.out.println("************** ");
            System.out.println("1. Your Balance: ");
            System.out.println("2. Deposit Deposit: ");
            System.out.println("3. Withdraw Amount: ");
            System.out.println("4. Exit: ");
            System.out.println("************** ");

            //Get And Process User choice
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice");

            }
        }
        System.out.println("************** ");
        System.out.println("Thank you for using our service ! Have a Nice day !");
        System.out.println("************** ");

        scanner.close();
    }
    static void showBalance(double balance) {
        System.out.println("************** ");
        System.out.printf("$%2f/n",  balance);
    }
    static double deposit() {
        double amount;
        System.out.print("Enter amount to deposit: ");
        amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("Invalid amount");
            return 0;
        }
        else {
            return amount;
        }
    }
    static double withdraw(double balance) {

        double amount;
        System.out.print("Enter amount to withdraw: ");
        amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("Invalid amount");
            return 0;
        }
        else if (amount > balance) {
            System.out.println("Insufficient balance");
            return 0;
        }
        else {
            return amount;
        }

    }
}