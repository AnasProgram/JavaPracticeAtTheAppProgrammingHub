import java.util.Arrays;
import java.util.Scanner;

public class ArraySortingDemo
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no. of elements to sort: ");

        int size = input.nextInt();
//        initializing unsorted int array
        int iArr[] = new int[size];
        System.out.println("Enter " + size + " integers: ");
        for (int i = 0; i < size; i++)
        {
            iArr[i] = input.nextInt();
        }

//        I'm going to print all the elements available in list
        for (int number : iArr)
        {
            System.out.println("Number= " + number);
        }

//        sorting array
        Arrays.sort(iArr);

//        let us print all the elements abailable in list
        System.out.println("Sorted array: ");
        for(int number : iArr)
        {
            System.out.println("Number= " + number);
        }
    }
}
