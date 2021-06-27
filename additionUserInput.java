import java.util.Scanner;

public class additionUserInput {

    public static void main(String[] args) {
        int a, b, ans;
        Scanner sc = new Scanner(System.in);

        System.out.println("Input First number: ");
        a = sc.nextInt();
        sc.nextLine();

        System.out.println("Input Second number: ");
        b = sc.nextInt();

        ans = a + b;

        System.out.println("Addition is : " + ans);

    }

}
