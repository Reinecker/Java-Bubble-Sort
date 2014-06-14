/**
 * Java bubble sort of an array of integers.
 *
 * Goes through the array and swaps the integers if the left number is greater than the right.
 * Continues making passes until a pass is made without any swapping.
 *
 * @author Anthony Reinecker
 */
public class BubbleSort
{
    public static void main(String[] args)
    {
        int[] numbers = {5, 0, -1, 111, -200, 5, 8};
        boolean swapped;
        int temp;

        do
        {
            swapped = false;

            for (int i = 0; i < numbers.length - 1; i++)
            {
                if (numbers[i] > numbers[i+1])
                {
                    swapped = true;
                    temp = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = temp;
                }
            }
        } while(swapped);

        // Print out numbers in sorted array
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.print(numbers[i]);
        }
    }
}
