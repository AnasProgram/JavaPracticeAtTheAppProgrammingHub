public class ArrayCopyExample
{
    public static void main(String[] args)
    {
        char [] copyForm = {'d','e','c','a','f','f','e','i','n','t','e','d'};
        char [] copyTo = new char[7];
        System.arraycopy(copyForm, 2, copyTo, 0, 7); //copies 7 characters from the array copyForm, starting at index 2, into the array copyTo starting at index 0.
        System.out.println(new String(copyTo));
    }
}
