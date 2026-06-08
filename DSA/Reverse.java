//Reverse an array
import java.util.Scanner;
import java.util.ArrayList;

public class Reverse
{
    static class Solution
    {
        public ArrayList<Integer> solve(int arr[])
        {
            ArrayList<Integer> rev = new ArrayList<>();
            int n = arr.length;

            for(int i = n - 1; i >= 0; i--)
            {
                rev.add(arr[i]);
            }
            return rev;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        System.out.println("Enter array elements:");
        for(int i = 0; i < 5; i++)
        {
            arr[i] = sc.nextInt();
        }

        Solution obj = new Solution();
        ArrayList<Integer> result = obj.solve(arr);

        System.out.println("Reversed array:");
        System.out.println(result);
    }
}
