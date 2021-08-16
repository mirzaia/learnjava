import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    Scanner scanner = new Scanner(System.in);
    int k;
    int j;
    int i;
    int MaxSum = 0;
    int MinSum = 0;
    int sum = 0;
    int maxElement = Arrays.stream(arr).max().getAsInt(); // find the max element
    int minElement = Arrays.stream(arr).min().getAsInt();
    int maxSoFar = 0;
    int maxEndHere = 0; // find the min element
            
    for (k=0; k < 1; k++){
        for (j=0; j<5; j++){
            arr.add(scanner.nextInt());
        }
    }
    
    for (int i: arr)
        {
            // update the maximum sum of subarray "ending" at index `i` (by adding the
            // current element to maximum sum ending at previous index `i-1`)
            maxEndHere = maxEndHere + i;
 
            // if the maximum sum is negative, set it to 0 (which represents
            // an empty subarray)
            maxEndHere = Integer.max(maxEndHere, 0);
 
            // update the result if the current subarray sum is found to be greater
            maxSoFar = Integer.max(maxSoFar, maxEndHere);
        }
 
        return maxSoFar;
    sum = sum + arr[i];
    MinSum = sum - maxElement;
    MaxSum = sum - minElement;
    
    System.out.print(MinSum);
    System.out.print(MaxSum);
    
    

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
