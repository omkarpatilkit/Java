
import java.util.*;

class StringToArray {

    void Display(String str) {

        char arr[] = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }
}

public class String2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the name: ");
        String str = sc.nextLine();

        StringToArray obj = new StringToArray();
        obj.Display(str);

    }

}
