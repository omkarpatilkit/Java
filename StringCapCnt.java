import java.util.*;

class CapCnt {

    int CapitalCnt(String str) {
        int cnt = 0;

        char arr[] = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                cnt++;
            }
        }
        return cnt;

    }
}

public class StringCapCnt {

    public static void main(String[] args) {

        int iRet = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the name: ");
        String str = sc.nextLine();

        CapCnt obj = new CapCnt();
        iRet = obj.CapitalCnt(str);
        System.out.println("The number of capital characters are: " + iRet);

    }
}
