import java.util.Scanner; // Import Scanner class to read input from the keyboard

public class MatrixMultiplication
{
    public static void main(String[] args)
    {
        // Declare variables:
        // m, n -> rows and columns of first matrix
        // p, q -> rows and columns of second matrix
        // sum -> used to store multiplication results temporarily
        int m, n, p, q, sum = 0;

        // Create Scanner object to take user input
        Scanner in = new Scanner(System.in);

        // Ask user for dimensions of first matrix
        System.out.println("Enter the number of rows and columns of first matrix");
        m = in.nextInt();
        n = in.nextInt();

        // Create first matrix with given dimensions
        int first[][] = new int[m][n];

        // Ask user to enter elements of first matrix
        System.out.println("Enter the elements of first matrix");

        // Read elements of first matrix
        for (int c = 0; c < m; c++)
        {
            for (int d = 0; d < n; d++)
            {
                first[c][d] = in.nextInt();
            }
        }

        // Ask user for dimensions of second matrix
        System.out.println("Enter the number of rows and columns of second matrix");
        p = in.nextInt();
        q = in.nextInt();

        // Check if matrix multiplication is possible
        // Columns of first matrix must equal rows of second matrix
        if (n != p)
            System.out.println("Matrices with entered orders can't be multiplied with each other.");
        else
        {
            // Create second matrix
            int second[][] = new int[p][q];

            // Create result matrix to store multiplication output
            int multiply[][] = new int[m][q];

            // Ask user to enter elements of second matrix
            System.out.println("Enter the elements of second matrix");

            // Read elements of second matrix
            for (int c = 0; c < p; c++)
            {
                for (int d = 0; d < q; d++)
                {
                    second[c][d] = in.nextInt();
                }
            }

            // Perform matrix multiplication
            for (int c = 0; c < m; c++)
            {
                for (int d = 0; d < q; d++)
                {
                    for (int k = 0; k < p; k++)
                    {
                        // Multiply corresponding elements and add them
                        sum = sum + first[c][k] * second[k][d];
                    }

                    // Store result in multiply matrix
                    multiply[c][d] = sum;

                    // Reset sum for next calculation
                    sum = 0;
                }
            }

            // Print the resulting matrix
            System.out.println("Product of entered matrices:");
            for (int c = 0; c < m; c++)
            {
                for (int d = 0; d < q; d++)
                {
                    System.out.print(multiply[c][d] + "\t");
                }
                System.out.print("\n");
            }
        }
    }
}
