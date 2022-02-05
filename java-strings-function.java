import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    System.out.println ("enter the value to find the length of strings :\n");
    Scanner tx = new Scanner (System.in);
    String txt = tx.next ();

    String txt1, txt2, txt3;

      System.out.println ("the final length of the string:" + txt.length ());
      System.out.println ("enter the text to convert toUpperCase");
      txt1 = tx.next ();
      System.out.println ("String in upper case :" + txt1.toUpperCase ());
      txt2 = tx.next ();
      System.out.println ("String for lower case :" + txt2.toLowerCase ());
      txt3 = tx.next ();
      System.out.println ("String of index value :" + txt3.indexOf("kumar"));



  }
}
