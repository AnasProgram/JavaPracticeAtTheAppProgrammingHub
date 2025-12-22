public class MissingNumberArray
{
    public static int count = 0; // Keeps track of how many numbers are missing so far
    public static int position = 0; // Current index position used during recursion

    public static boolean flag = false; // Flag to control recursive calls

    public static void main(String[] args)
    {
        int arr [] = {1,2,3,5,6,7,8,9,10,11,12,13,14,15,18,20,21,23};
        findMissiongNumbers(arr, position); // Start searching for missing numbers from position 0
    }
    private static void findMissiongNumbers(int arr [], int position)
    {
        if (position == arr.length-1)
            return;
        for (;position < arr[arr.length-1]; position++)
        {
            if ((arr[position]-count) !=position) // If the difference between value and index is incorrect, it means a number is missing
            {
                System.out.println("Missing Number: " + (position+count));
                flag = true;
                count++;
                break;
            }
        }
        if (flag) // If a missing number was found, continue searching recursively
        {
            flag = false;
            findMissiongNumbers(arr, position);
        }
    }
}
