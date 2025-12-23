import java.util.Scanner;

public class MirrorMatrix
{
    public static void main(String[] args)
    {
        int row, column;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows matrix");
        row = input.nextInt();
        System.out.println("Enter the number of columns matrix");
        column = input.nextInt();

        int[][] matrix = new int[row][column];
        System.out.println("Enter the elements of the matrix");

        for (int i = 0; i < row; i++) // Read elements of the matrix row by row
        {
            for (int j = 0; j < column; j++)
            {
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.println("Mirror matrix");
        for (int i = 0; i < row; i++) // Loop through each row
        {
            for (int j =column-1; j >= 0; j--) // Print elements in reverse column order to create mirror effect
            {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
