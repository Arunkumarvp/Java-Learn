import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
 
public class Main
{
    public static String findLargestNumber(List<Integer> nums)
    {
        // sort using a custom function object
        Collections.sort(nums, (a, b) -> (String.valueOf(b) + a).compareTo(String.valueOf(a) + b));
        return nums.stream()
                .map(Object::toString)
                .collect(Collectors.joining(""));
    }
 
    public static void main(String[] args)
    {
        Scanner noum=new Scanner(System.in);
        List<Integer> numbers = new ArraysList<>();
        while(noum.hasNextInt()){
            numbers.add(noum.nextInt());

        }
        String largestNumber = findLargestNumber(numbers);
        System.out.println("The largest number is " + largestNumber);
    }
}


r