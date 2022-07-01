/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
  static int linear (int arr[], int x)
  {
    int l = 0, r = arr.length - 1;
    while (l <= r)
      {
	int m = l + (r - l) / 2;
	if (arr[m]==x)
	  {
	    return m;

	  }
	if (arr[m]<x)
	{
	    l = m + 1;
      }
    else
    {
      r = m - 1;
    }
   
  }
   return -1;
}

public static void
main (String[]args)
{
  int[] arr = { 1, 2, 3, 3, 4 };
  int a = 55;
  int u = linear (arr, a);
  if (u == -1)
    {
      System.out.println ("no elements");
    }
  else
    {
      System.out.println ("elements is here");
    }

}
}
