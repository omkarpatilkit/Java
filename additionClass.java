import java.util.*;

class Maths {

    int Addition(int x, int y) {
        return x + y;
    }

}

class MathStatic {

    static int Addition(int x, int y) {
        return x + y;
    }

}

public class additionClass {

    public static void main(String[] args) {

        int a, b, ans, ans2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Input First number: ");
        a = sc.nextInt();
        sc.nextLine();

        System.out.println("Input Second number: ");
        b = sc.nextInt();

        Maths obj = new Maths();

        ans2 = MathStatic.Addition(a, b);

        ans = obj.Addition(a, b);
        System.out.println("Addition is :" + ans);
        System.out.println("Addition by static is :" + ans2);
    }

}
