import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc=new Scanner(System.in);
        float l=sc.nextFloat();
        float b=sc.nextFloat();
        double c=(int
                 ) l*b;
        double d=(int) 2*(l+b);
        System.out.println("Required length is"+d+"sqm");
        System.out.println("Required quantity of carpet is"+c+"sqm");
     
        
        
    }
}
