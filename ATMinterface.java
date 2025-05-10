import java.util.*;

public class ATMinterface {

    public static void atminterface() {

        Scanner sc = new Scanner(System.in);
        int balance = 50000;  

        

            System.out.println("                          Welcome to your account");
            System.out.println("1. Check balance");
            System.out.println("2. Withdraw Cash");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");
            System.out.println();

            //Loop untill user chooses 4 i.e. Exit
            while (true) {
            System.out.println("Please select any valid option between 1-4 to proceed further");

            int response = sc.nextInt();
            if (response <= 0 || response > 4) {
                System.out.println("Invalid option. Please try again.");
            } else {
                int amount;

                if (response == 1) {
                    System.out.println("Your balance = " + balance);
                } else if (response == 2) {
                    while (true) {
                        System.out.print("Enter the amount you want to withdraw = ");
                        amount = sc.nextInt();
                        if (amount > balance || amount <= 0) {
                            System.out.println("Please enter a valid amount");
                        } else {
                            balance = balance - amount;
                            System.out.println("Balance left after withdrawal = " + balance);
                            break;
                        }
                    }
                } else if (response == 3) {
                    while (true) {
                        System.out.print("Enter the amount you want to deposit = ");
                        amount = sc.nextInt();
                        if (amount <= 0) {
                            System.out.println("Please enter a valid amount");
                        } else {
                            balance = balance + amount;
                            System.out.println("Balance after deposit = " + balance);
                            break;
                        }
                    }
                } else if (response == 4) {
                    System.out.println("Thank you for using our service. Goodbye!");
                    break;  // Exit the loop and end the program
                }
            }
        }
        sc.close();  
    }

    public static void main(String[] args) {
        atminterface();
    }
}