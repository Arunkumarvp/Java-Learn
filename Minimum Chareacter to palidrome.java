import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        if(str.indexOf(str.valueOf(str.charAt(str.length()-1)))<str.length()-1){
         System.out.println(str.indexOf(str.valueOf(str.charAt(str.length()-1))));
            
        }
        else{
            System.out.println(str.length()-1);
        }
        
        
        }
}