
import java.util.*;

class CheckArmstrong {

    boolean isArmstrong(int no) {

        int iCnt = 0; //
        int temp = no;
        int iDigit = 0;
        int power = 1, Sum = 0;

        while (temp != 0) {

            temp = temp / 10;
            iCnt++;
        }

        temp = no;

        while (temp != 0) {

            iDigit = temp % 10;
            for (int i = 0; i < iCnt; i++) {
                power = power * iDigit;
            }
            Sum = Sum + power;
            power = 1;
            temp = temp / 10;

        }

        if (Sum == no) {

            return true;
        } else {
            return false;
        }

    }
}

public class armstrongNumber {

    public static void main(String[] args) {

        int iNo;
        boolean isArmstrongNumber = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number");
        iNo = sc.nextInt();

        CheckArmstrong obj = new CheckArmstrong();
        isArmstrongNumber = obj.isArmstrong(iNo);

        if (isArmstrongNumber) {

            System.out.println(iNo + " Is a Armstrong number");
        } else {
            System.out.println(iNo + " Is not a Armstrong number");
        }

    }

}
