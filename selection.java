/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    static void sort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int mid=i;
            for (int j=i+1;j<n;j++ ){
                if(arr[j]<arr[mid]){
                    mid=j;
                
                    
                }
                int temp=arr[mid];
                arr[mid]=arr[i];
                arr[i]=temp;
                
            } 
            
        }
        
    }
    static void printarry(int arr[]){
        int n=arr.length;
        for (int i=0;i<n;++i ){
            System.out.println(arr[i]+"");
        }
        System.out.println();
        
    }
	public static void main(String[] args) {
		Main ob=new Main();
		int[] arr={4,5,55,2,100};
		ob.sort(arr);
		ob.printarry(arr);
	}
}
