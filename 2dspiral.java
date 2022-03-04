import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Solution {

	// Function to print in spiral order
	public static List<Integer> spiral()
	{
		List<Integer> ans = new ArrayList<Integer>();

		if (matrix.length == 0)
			return ans;

		int R = matrix.length, C = matrix[0].length;
		boolean[][] seen = new boolean[R][C];
		int[] dr = { 0, 1, 0, -1 };
		int[] dc = { 1, 0, -1, 0 };
		int r = 0, c = 0, di = 0;

		// Iterate from 0 to R * C - 1
		for (int i = 0; i < R * C; i++) {
			ans.add(matrix[r]);
			seen[r] = true;
			int cr = r + dr[di];
			int cc = c + dc[di];

			if (0 <= cr && cr < R && 0 <= cc && cc < C
				&& !seen[cr][cc]) {
				r = cr;
				c = cc;
			}
			else {
				di = (di + 1) % 4;
				r += dr[di];
				c += dc[di];
			}
		}
		return ans;
	}

	// Driver Code
	public static void main(String[] args)
	{
        Scanner sc=new Scanner (System.in);

		int sn[][] = sc.nextInt();

		System.out.println(spiral(sn));
	}
}
