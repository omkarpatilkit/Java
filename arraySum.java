import java.util.Scanner;

class SumOfArray {

    int sum = 0;

    int Sum(int Arr[]) {
        for (int i = 0; i < Arr.length; i++) {

            sum = sum + Arr[i];
        }
        return sum;
    }
}

public class arraySum {

    public static void main(String[] args) {

        int iSize = 0;
        int iRet = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter size of array");
        iSize = sc.nextInt();

        int Arr[] = new int[iSize];
        for (int i = 0; i < iSize; i++) {

            System.out.println("Enter the value of index " + (i + 1));
            Arr[i] = sc.nextInt();
            sc.nextLine();

        }

        SumOfArray obj = new SumOfArray();
        iRet = obj.Sum(Arr);
        System.out.println("Sum of all numbers in array is " + iRet);

    }
}
