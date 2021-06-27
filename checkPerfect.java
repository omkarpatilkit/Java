import java.util.Scanner;

class isPerfect {

    void check(int Arr[]) {

        int sum;
        for (int i = 0; i < Arr.length; i++) {
            sum = 0;
            for (int j = 1; j <= (Arr[i] / 2); j++) {
                if ((Arr[i] % j) == 0) {
                    sum = sum + j;
                }

            }
            System.out.println(sum);

            if (sum == Arr[i]) {
                System.out.println(Arr[i] + " is the perfect number");
            } else {
                System.out.println(Arr[i] + " is not the perfect number");
            }
        }
    }
}

public class checkPerfect {

    public static void main(String[] args) {

        int iSize = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter size of array");
        iSize = sc.nextInt();

        int Arr[] = new int[iSize];
        for (int i = 0; i < iSize; i++) {

            System.out.println("Enter the value of index " + (i + 1));
            Arr[i] = sc.nextInt();
            // sc.nextLine();

        }

        isPerfect obj = new isPerfect();
        obj.check(Arr);

    }

}
