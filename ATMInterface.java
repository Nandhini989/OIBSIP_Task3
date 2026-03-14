import java.util.Scanner;

public class ATMInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        UserAccount user = new UserAccount("nandhini", "1234", 10000);
        ATMOperations atm = new ATMOperations(user);

        System.out.println("===== ATM SYSTEM =====");

        System.out.print("Enter User ID: ");
        String id = sc.nextLine();

        System.out.print("Enter PIN: ");
        String pin = sc.nextLine();

        if(user.login(id, pin)) {

            int choice;

            do {
                System.out.println("\n1. Transaction History");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.println("4. Transfer");
                System.out.println("5. Quit");

                System.out.print("Choose option: ");
                choice = sc.nextInt();

                switch(choice) {

                    case 1:
                        atm.showHistory();
                        break;

                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        atm.withdraw(sc.nextDouble());
                        break;

                    case 3:
                        System.out.print("Enter amount to deposit: ");
                        atm.deposit(sc.nextDouble());
                        break;

                    case 4:
                        sc.nextLine();
                        System.out.print("Enter receiver ID: ");
                        String receiver = sc.nextLine();
                        System.out.print("Enter amount to transfer: ");
                        atm.transfer(receiver, sc.nextDouble());
                        break;

                    case 5:
                        System.out.println("Thank you for using ATM.");
                        break;

                    default:
                        System.out.println("Invalid choice");
                }

            } while(choice != 5);

        } else {
            System.out.println("Invalid Login Details");
        }

        sc.close();
    }
}