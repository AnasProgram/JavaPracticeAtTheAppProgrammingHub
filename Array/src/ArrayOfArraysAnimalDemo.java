public class ArrayOfArraysAnimalDemo
{
    public static void main(String[] args)
    {
        String [][] animals ={{"DanaDog","WallyDog","JessieDog","AlexisDog","LuckyDog"},{"BibsCat","DoodleCat","MillieCat","SimonCat"},
                {"ElyFish","CloieFish","GlodieFish","ZippyFish","TedFisch"}, {"RascalMule","GeorgeMule","GracieMule","MontyMule","BluckMule","RosieMule"}};

        for(int i = 0; i < animals.length; i++)
        {
            System.out.print(animals[i][0] + ": ");
            for (int j= 1; j < animals[i].length; j++)
            {
                System.out.print(animals[i][j] + " ");
            }
            System.out.println();
        }
    }
}
