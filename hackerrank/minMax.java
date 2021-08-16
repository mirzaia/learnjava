import java.io.*;
import java.lang.reflect.Array;
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

    public static void miniMaxSum() {
        Scanner scanner = new Scanner(System.in); // scanner declaration
        List<Integer> arr = new ArrayList<Integer>(); // array declaration
        int k; // line iterator
        int j; // line member iterator
        int maxSoFar = 0; // max value so far
        int maxEndHere = 0; // max value updated

        // System.out.println("masukan angka");
        for (k = 0; k < 1; k++) { // Input the array
            for (j = 0; j < 5; j++) {
                arr.add(scanner.nextInt());
            }
        }

        for (int i : arr) { // Find the sum of the array
            // update the maximum sum of subarray "ending" at index `i` (by adding the
            // current element to maximum sum ending at previous index `i-1`)
            maxEndHere = maxEndHere + i;

            // if the maximum sum is negative, set it to 0 (which represents
            // an empty subarray)
            maxEndHere = Integer.max(maxEndHere, 0);

            // update the result if the current subarray sum is found to be greater
            maxSoFar = Integer.max(maxSoFar, maxEndHere);
        }

        List<Integer> newCollections = new ArrayList<>(arr); // Create new array for sortlist purpose
        Collections.sort(newCollections); // Sprt the new array (from min to max)
        int theMaxElement = newCollections.get(newCollections.size() - 1); // get the maximum element
        // (because its already sorted, so the max number is the last element in order)
        int theMinElement = newCollections.get(newCollections.size() - 5); // get the minimum element
        // (the first element in order is the min )

        int maxResult = maxSoFar - theMinElement;
        System.out.print(maxResult);

        System.out.print(" ");

        int minResult = maxSoFar - theMaxElement;
        System.out.print(minResult);

        // System.out.println(maxSoFar); // the sum of the array
        // arr.forEach(System.out::print); // print member of array

        // MinSum = sum - maxElement;
        // MaxSum = sum - minElement;

        // System.out.print(MinSum);
        // System.out.print(MaxSum);

    }

    public static void main(String[] args) {
        miniMaxSum();
    }

}

/*
 * public class Solution { public static void main(String[] args) throws
 * IOException { BufferedReader bufferedReader = new BufferedReader(new
 * InputStreamReader(System.in));
 * 
 * List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$",
 * "").split(" ")) .map(Integer::parseInt) .collect(toList());
 * 
 * Result.miniMaxSum(arr);
 * 
 * bufferedReader.close(); } }
 */
