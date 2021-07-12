import java.util.*;
import myPackage.MatrixOOps;
// import myPackage.MatrixOOps.*;

class Demo extends MatrixOOps {

    public Demo(int iRow, int iCol) {
        super(iRow, iCol);
    }

    public void MaximumInRow() {

        int max = 0;
        for (int i = 0; i < rows; i++) {

            max = arr[i][0];
            for (int j = 0; j < cols; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
            System.out.println("Maximum in Row is " + max);
        }
    }

    public void MinimumInRow() {
        int min = 0;
        for (int i = 0; i < rows; i++) {

            min = arr[i][0];
            for (int j = 0; j < cols; j++) {
                if (min > arr[i][j]) {
                    min = arr[i][j];
                }
            }
            System.out.println("Maximum in Row is " + min);
        }
    }

    public void SumInRow() {

        int Sum = 0;
        for (int i = 0; i < rows; i++) {

            Sum = 0;
            for (int j = 0; j < cols; j++) {
                Sum = Sum + arr[i][j];
            }
            System.out.println("Maximum in Row is " + Sum);
        }
    }
}

public class MatrixInhereted {

    public static void main(String[] args) {

        int iRow, iCol;
        Scanner sc = new Scanner(System.in);
        System.out.println("Give number of rows: ");
        iRow = sc.nextInt();
        System.out.println("Give number of columns: ");
        iCol = sc.nextInt();
        Demo obj = new Demo(iRow, iCol);

        obj.EnterTheNumber();
        obj.Display();
        System.out.println("Maximum is " + obj.Maximum());
        System.out.println("Minimum is " + obj.Minimum());
        obj.MaximumInRow();
        obj.MinimumInRow();
        obj.SumInRow();

    }
}
