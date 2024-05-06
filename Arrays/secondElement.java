package Arrays;
// import java.util.*;

// class secondElement
// {
//     static private void getElements(int[] arr, int n)
//     {
//         if(n == 0 || n == 1)
//         {
//             System.out.println(-1);
//             System.out.println("");
//             System.out.println(-1);
//             System.out.println("\n");
//         }
//         Arrays.sort(arr);
//         int small = arr[1];
//         int large = arr[n - 2];
//         System.out.println("Second smallest is " +small);
//         System.out.println("Second largest is " +large);
//     }

//     public static void main(String[] args) {
//         @SuppressWarnings("resource")
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();
//         int[] arr = new int[t];
//         for (int i=0; i<t; i++) {
//             arr[i] = sc.nextInt();
//         }
//         getElements(arr, t);
//     }
// }

class Test
{
static private int secondSmallest(int[] arr, int n)
{
	if (n < 2)
	{
		return -1;
	}
	int small = Integer.MAX_VALUE;
	int second_small = Integer.MAX_VALUE;
	int i;
	for (i = 0; i < n; i++)
	{
	   if (arr[i] < small)
	   {
		  second_small = small;
		  small = arr[i];
	   }
	   else if (arr[i] < second_small && arr[i] != small)
	   {
		  second_small = arr[i];
	   }
	}
   return second_small;
}
static private int secondLargest(int[] arr, int n)
{
	if(n<2)
	return -1;
	int large = Integer.MIN_VALUE;
	int second_large = Integer.MIN_VALUE;
	int i;
	for (i = 0; i < n; i++)
	{
		if (arr[i] > large)
		{
			second_large = large;
			large = arr[i];
		}

		else if (arr[i] > second_large && arr[i] != large)
		{
			second_large = arr[i];
		}
	}
	return second_large;
}

public static void main(String[] args)
{
	int[] arr = {1, 2, 4, 7, 7, 5};
	int n = arr.length;
		int sS = secondSmallest(arr, n);
		int sL = secondLargest(arr, n);
	System.out.println("Second smallest is "+sS);
	System.out.println("Second largest is "+sL);
}

}