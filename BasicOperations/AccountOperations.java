package BasicOperations;

import java.util.Scanner;

public class AccountOperations {
    int AccNo;
    String Name;
    float Amount;
    Scanner sc = new Scanner(System.in);

    public void Login ( int i , String n , float Amt){
        AccNo = i;
        Name = n;
        Amount = Amt;
    }

    public void Deposite( ){
        float amt;
        System.out.println("Enter amount to add: ");
        amt = sc.nextFloat();
        sc.nextLine();
        Amount = Amount + amt;
        System.out.println("Updated balance is " + Amount);
    }

    public void Withdraw(){
        float amt;
        System.out.println("Enter Amount to withdraw: ");
        amt = sc.nextFloat();
        sc.nextLine();
        if ( Amount < amt) {
            System.out.println("Amount unable to withdraw low balance");
        }

        else {
            Amount = Amount - amt;
            System.out.println("Updated balance is " + Amount);
        }
    }

    public void CheckBalance(){
        System.out.println("Current balance is " + Amount);
    }



}
