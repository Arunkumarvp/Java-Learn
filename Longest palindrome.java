
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int lpsubstring(){
    System.out.println("enter the value");
        Scanner aa = new Scanner(System.in);
        int n = aa.nextInt();
        if(n<2)
        return n;
        int maxLength=1,start=0;
        int more,less;
        for(int i=0;i<n;i++){
        less = i-1;
        more = i+1; 
        while ( more < n && str[more] == str[i]) //increment 'more'                                  
            more++;
       
        while ( less >= 0 && str[less] == str[i]) // decrement 'less'                   
            less--;
       
        while (less >= 0 && more < n && str[less] == str[more]){
              low--;
            more++;
        }
        int length = more -less - 1 ;
        if(maxLength > length){
            maxLength=lenght;
            start=low+1;
            
        }
        } 
        
    }
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    System.out.println("To find the longest strings ");
        
//        pending of code
      
    }
}
