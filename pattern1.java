import java.util.*;

class Pattern {

    void Display(int iRow, int iCol) {

        int n = 1;

        for (int i = 1; i <= iRow; i++) {

            for (int j = 1; j <= iCol; j++) {

                if (i == 1 || j == 1 || i == iRow || j == iCol) {

                    System.out.print(n + "\t");
                }

                else {
                    System.out.print("-\t");
                }

            }
            n = n + 2;
            System.out.println();
        }

    }
}

public class pattern1 {

    public static void main(String[] args) {

        int iRow, iCol;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Rows: ");
        iRow = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the number of Columns: ");
        iCol = sc.nextInt();
        Pattern obj = new Pattern();
        obj.Display(iRow, iCol);

    }

}
