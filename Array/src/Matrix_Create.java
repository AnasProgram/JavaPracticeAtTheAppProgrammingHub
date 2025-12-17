import java.util.Scanner; // Import Scanner class to take input from the keyboard

public class Matrix_Create
{
    Scanner scan; // Scanner object to read user input
    int matrix[][]; // 2D array (matrix) to store numbers
    int row, column;

    void create() //this methode is a defealt methode. That means this methode is with no access modifier because I want to accessible only inside the same package.
    {
        scan = new Scanner(System.in);
        System.out.println("Matrix Creation");

        System.out.println("\nEnter number of rows:"); //"\n" is a newline escape character that moves the cursor to a new line before printing the text, so the message appears on the next line.
//       And "println" already moves the cursor to the next line, but "\n" adds an extra line break before the text, so it forces a blank line first and then prints Enter number of rows: on a new line.
        row = Integer.parseInt(scan.nextLine());//parseInt() is a method that converts a String containing a number (like "25") into an int value so it can be used in calculations.
//        nextLine() reads an entire line of text entered by the user (up to the Enter key) and returns it as a String.
//        Now you might ask me: Why did I use Integer before calling parseInt(), even though I converted every String using parseInt()?
//        You must use Integer.parseInt() because parseInt() is a static method of the Integer class, not a standalone function, so Java requires the class name to call it.
        System.out.println("Enter number of columns:");
        column = Integer.parseInt(scan.nextLine());

        matrix = new int[row][column];
        System.out.println("Enter the data:");

        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                matrix[i][j] = scan.nextInt();
            }
        }
    }
    void display()
    {
        System.out.println("\nThe Matrix is:");
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                System.out.print("\t" + matrix[i][j]); //\t is a tab character that inserts horizontal spacing, so it aligns the printed output neatly like columns in a table.
            }
            System.out.println();
        }
    }
}
class CreateAndDisplayMatrix
{
    public static void main(String[] args)
    {
        Matrix_Create obj = new Matrix_Create();
        obj.create();
        obj.display();
    }
}


