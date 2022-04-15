import java.util.*;
class s{
    public static void main(String[] args){
        int i,j, row;
        Scanner ds= new Scanner(System.in);
        row=ds.nextInt();
        for(i=row; i>=1; --i){
            for(j=i; j>=1;j--){
                System.out.print(j+"");
            }
            System.out.println();
        }
    }
}
