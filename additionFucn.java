import java.util.Scanner;

public class additionFucn {

    static int Addition(int x, int y) { // static method cannot access
                                        // instance variables
        return x + y;
    }

    public static void main(String[] args) {

        int a, b, ans;
        Scanner sc = new Scanner(System.in);

        System.out.println("Input First number: ");
        a = sc.nextInt();
        sc.nextLine();

        System.out.println("Input Second number: ");
        b = sc.nextInt();

        ans = Addition(a, b);
        System.out.println("Addition is :" + ans);
    }

}
