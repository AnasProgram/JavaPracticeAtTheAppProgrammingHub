public class ArrayCopyOfRangeExample
{
    public static void main (String[] args)
    {
        char [] copyFrom = {'d','e','c','a','f','f','e','i','n','t','e','d'};
        char [] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9); //creates a new array by copying elements from index 2 (inclusive) to index 9 (exclusive) of copyFrom.
        System.out.println(new String(copyTo));
    }
}
