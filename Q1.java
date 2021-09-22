/*
Exp 1: Write a Menu driven program in java to implement simple banking applications.
Application should read the customer name, account number, initial balance,
rate of interest, contact number and address field etc.

Application should have following methods.

1. createAccount()
2. deposit()
3. withdraw()
4. computeInterest()
5. displayBalance()

*/
import java.util.Scanner;

class BankAccount {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int userChoice;

        boolean quit = false;

        float balance = 0f;

        do {

            System.out.println("1. create acc");
            System.out.println("2. deposit");
            System.out.println("3. withdraw");
            System.out.println("4. display balance");
            System.out.print("Your choice, Q to quit: ");
            userChoice = scan.nextInt();

            switch (userChoice) {

                case 1:
                    int AccountName;
                    System.out.println("Enter the name for your acc:");
                    AccountName = scan.nextInt();

                    System.out.println("Account" +AccountName + "has been created!");

                case 2:
                    float amount;
                    System.out.print("Amount to deposit: ");
                    amount = scan.nextFloat();
                    if (amount <= 0)

                        System.out.println("Can't deposit non positive amount.");

                    else {

                        balance += amount;

                        System.out.println("$" + amount + " has been deposited.");

                    }

                    break;

                case 3:
                    System.out.print("Amount to withdraw: ");
                    amount = scan.nextFloat();
                    if (amount <= 0 || amount > balance)
                        System.out.println("Withdrawal can't be completed.");

                    else {

                        balance -= amount;
                        System.out.println("$" + amount + " has been withdrawn.");

                    }
                    break;

                case 4:
                    System.out.println("Your balance: $" + balance);
                    break;
                case 0:
                    quit = true;
                    break;

                default:

                    System.out.println("Wrong choice.");

                    break;

            }

            System.out.println();

        } while (!quit);

        System.out.println("Bye!");

    }

}