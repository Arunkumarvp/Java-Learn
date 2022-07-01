public class Main
{
    static int linear(int arr[],int x){
        int r=arr.length;
        for(int i=0;i<r;i++){
            while(arr[i]==x){
                return 1;
            }
        }
        return -1;
    }
	public static void main(String[] args) {
	    int[]arr={1,2,3,3,4};
	    int a=3;
	    int u=linear(arr,a);
	    if(u==-1){
	       System.out.println("no elements");
	    }
	    else
	    {
	        System.out.println("elements is here");
	    }
	
	}
}
