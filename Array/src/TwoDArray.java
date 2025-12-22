import java.util.Arrays; // Import Arrays class to use utility methods like deepToString()
import java.util.Scanner;

public class TwoDArray
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter # of rows ");
        int rows = scan.nextInt();
        System.out.print("Enter # of columns ");
        int columns = scan.nextInt();

        int [][] arr = new int[rows][columns];

        System.out.println("Enter" + rows + "x" + columns + ": " + (rows * columns) + "integers:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                arr[i][j] = scan.nextInt();
        System.out.println("Here are those" + (rows * columns) + " integers in arr" + rows + "x" + columns + "2d-array:");
        System.out.println(Arrays.deepToString(arr)); // deepToString() vs toString(): deepToString() is designed for multidimensional arrays and prints all nested elements recursively, showing the actual contents in a readable form.
//        toString() prints a one-dimensional view of an array, so for multidimensional arrays it only shows memory references of inner arrays.
    }
}
