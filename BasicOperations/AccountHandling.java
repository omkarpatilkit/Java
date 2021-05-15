package BasicOperations;

import java.util.Scanner;

public class AccountHandling {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        AccountOperations ob1 = new AccountOperations();
        ob1.Login(10012 , "Omkar" , 4000.435f);

        int choice;

        System.out.println("1 . CheckBalance");
        System.out.println("2 . Deposit");
        System.out.println("3 . WithDraw");
        System.out.println("Please make a choice// 0. Exit");
        choice = sc.nextInt();
        sc.nextLine();

        while (choice != 0){
            switch (choice) {
                case 1 -> ob1.CheckBalance();
                case 2 -> ob1.Deposite();
                case 3 -> ob1.Withdraw();
            }

            System.out.println("Please make a choice: ");
            choice = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("Thank you for using our services.");
        System.out.println("Have a nice day....");
    }
}
