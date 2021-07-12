package myPackage;

import java.util.*;

public class MatrixOOps {
    protected int rows, cols;
    protected int arr[][];

    public MatrixOOps(int row, int col) {
        this.rows = row;
        this.cols = col;

    }

    public void EnterTheNumber() {
        arr = new int[rows][cols];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public void Display() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + "\t");

            }

            System.out.println();
        }

    }

    public int Maximum() {
        int iMax = arr[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (iMax < arr[i][j]) {

                    iMax = arr[i][j];
                }

            }
        }
        return iMax;

    }

    public int Minimum() {
        int iMin = arr[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (iMin > arr[i][j]) {

                    iMin = arr[i][j];
                }

            }
        }
        return iMin;

    }

}
