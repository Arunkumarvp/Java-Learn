import java.util.*;
public class Main
{
	public static void main(String[] args) {
	     System.out.println("enter the number of elements");
	 Scanner ds = new Scanner(System.in);
        int n=ds.nextInt();
       
        int x[]=new int[n];
        System.out.println("enter the array elemrnts");
        for(int i=0;i<n;i++){
            x[i]=ds.nextInt();
        }
        for(int j=0;j<n;j++){
            if(x[j]/2==0){
                System.out.println(x[j]+"");
            }
        }
        
    	
	}
}
