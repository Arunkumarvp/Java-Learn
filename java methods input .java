import java.util.*;

public class Main {
  static int plusMethod(int x, int y) {
    return x + y;
  }
  
 /* static double plusMethod(double x, double y) {
    return x + y;
  }*/
  
  public static void main(String[] args) {
   	Scanner sc=new Scanner(System.in);
    int myNum1 =sc.nextInt();
    int mynum2 =sc.nextInt();
    //double myNum2 = plusMethod(4.3, 6.26);
    System.out.println(plusMethod(myNum1,mynum2));
    //System.out.println("double: " + myNum2);
  }
}
