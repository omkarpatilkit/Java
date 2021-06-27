import java.util.*;

class GiveSum {

    int Root(int no) {

        int sum = no;
        while (sum > 9) {

            no = sum;
            sum = 0;

            while (no != 0) {
                sum = sum + (no % 10);
                no = no / 10;
            }

        }
        return sum;
    }
}

public class GenRoot {

    public static void main(String[] args) {

        int iNo = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        iNo = sc.nextInt();

        GiveSum obj = new GiveSum();

        System.out.println("Root is : " + obj.Root(iNo));

    }

}
