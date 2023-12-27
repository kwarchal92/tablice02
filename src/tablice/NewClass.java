package tablice;

public class NewClass {

    public static void main(String[] args)
    {
        int n = 10, i;
        int dane[] = new int[n]; //deklaracja tablicy typu int

        for (i = 0; i < dane.length; i++)
        {
            dane[i] = n - 1 - i; //wyswietlenie malejaco liczb w tablicy (9-0)
            System.out.println("dane[" + i + "] = " + dane[i]); //wyswietlenie zawartosci tablicy
        }
    }
}