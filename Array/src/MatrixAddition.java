import java.util.Scanner; // Used to take input from the user

public class MatrixAddition 
{
    Scanner scan;
    int matrix1[][], matrix2[][], sub[][];
    int row, column;

    void create() {
        scan = new Scanner(System.in);

        System.out.println("Matrix Addition");

//        First Matrix Creation
        System.out.println("\nEnter number of rows and columns");
        row = Integer.parseInt(scan.nextLine());
        column = Integer.parseInt(scan.nextLine());

        matrix1 = new int[row][column];
        matrix2 = new int[row][column];
        sub = new int[row][column];

        System.out.println("Enter the data for first matrix");
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                matrix1[i][j] = scan.nextInt();
            }
        }

//        Second Matrix Creation
        System.out.println("Enter the data for second matrix");
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                matrix2[i][j] = scan.nextInt();
            }
        }
    }

    void display()
    {
        System.out.println("\nThe First Matrix is:");
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                System.out.print("\t" + matrix1[i][j]);
            }
            System.out.println();
        }
        System.out.println("\nThe Second Matrix is:");
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                System.out.print("\t" + matrix2[i][j]);
            }
            System.out.println();
        }
    }
    void sub()
    {
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                sub[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        System.out.println("\n\nThe Addition is:");
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                System.out.print("\t" + sub[i][j]);
            }
            System.out.println();
        }
    }
}
class MatrixAdditionExample
{
    public static void main(String[] args)
    {
        MatrixAddition obj = new MatrixAddition();
        obj.create();
        obj.display();
        obj.sub();
    }
}