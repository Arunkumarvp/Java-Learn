import java.util.*;
import java.lang.Math;
class solve{
   
    public static void main(String[] args){
        Scanner sa=new Scanner(System.in);
        float cs=sa.nextFloat();
        System.out.println(roundvlaue(cs));
    }
     public static float roundvalue(float,fn){
        float f_num= (float).Math.floor(fn);
        float c_num= (float).Math.ceil(fn);
        if((fn-c_num)>(fn-f_num)){
            return c_num;
        }
        else if((c_num-fn)>(f_num-fn)){
            return f_num;
        }
        else{
            return c_num;
        
        }
        
        
    }
}
