import java.util.Scanner;

public class ReverseArray {
    private static Scanner scanner = new Scanner(System.in) ;

    public static void main(String[] args) {
        System.out.println("enter the number of elements in the array");
        int numberofelements = scanner.nextInt() ;
        System.out.println("enter " + numberofelements + " elements in array");
        reversearray(input(numberofelements));

    }

    public static int[] input (int numbers)
    {
        int[] input = new int[numbers] ;
        for (int i = 0 ; i < input.length ; i++)
        {
            input[i] = scanner.nextInt() ;
        }

        return input ;
    }

    public static void reversearray (int[] input)
    {
        int value = input.length - 1 ;
        System.out.println("reversed array ");
        for (int i = value ; i >= 0 ; i--)
        {
            System.out.println(input[i]);
        }
    }


}
