import java.io.*;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        int a,b;
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        try
        {
            a = Integer.parseInt(bufferedReader.readLine());
            b = Integer.parseInt(bufferedReader.readLine());
            System.out.println(a+b);
        }
        catch (RuntimeException exception)
        {
            System.out.println("Вводимые значения должны быть целочисленными");
        }


        Scanner scanner = new Scanner(System.in);
        try {
            a = scanner.nextInt();
            b = scanner.nextInt();
            System.out.println(a+b);
        }
        catch (RuntimeException exception)
        {
            System.out.println("Вводимые значения должны быть целочисленными");
        }
    }
}
