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
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.lang.Object;

public class sparseArrays {

    // public static List<Integer> matchingStrings() {} - USE THIS INSTEAD
    public static void matchingStrings() {

        int n = 0; // size of strings
        int m = 0; // size of queries
        int i; // iterator one
        int z; // iterator two
        List<String> strings = new ArrayList<String>(); // the strings
        List<String> queries = new ArrayList<String>(); // the queries
        Scanner sc = new Scanner(System.in); // the scanner

        // Take input: size of strings
        // System.out.print("1. Input the size of strings: ");
        n = sc.nextInt();

        // Iterator 12 lines
        // System.out.println("2. Input the strings elements: ");
        for (i = 0; i <= n; i++) {
            // Take input: elements of strings
            strings.add(sc.nextLine());
        }

        // Take input: size of queries
        // System.out.print("3. Input the size of queries: ");
        m = sc.nextInt();

        // System.out.println("4. Input the queries elements: ");
        for (z = 0; z <= m; z++) {
            // Take input: elements of queries
            queries.add(sc.nextLine());
        }

        // to Test the input
        /*
         * System.out.print("5. Size of the strings are: "); System.out.println(n);
         * System.out.print("6. Elements of the strings are: ");
         * System.out.println(strings);
         * System.out.print("7. Size of the queries are: "); System.out.println(m);
         * System.out.print("8. Elements of the queries are: ");
         * System.out.println(queries);
         */

        // Count queries elements
        /*
         * Map<String, Integer> counts = queries.parallelStream()
         * .collect(Collectors.toConcurrentMap(w -> w, w -> 1, Integer::sum));
         * System.out.print("9. Count the number of queries elements: ");
         * System.out.println(counts);
         */

        // Create a new list that contain the same elements from both list
        List<String> sameElements = new ArrayList<>(strings);
        sameElements.retainAll(queries);
        // System.out.print("10. Queries elements in strings: ");
        // System.out.println(sameElements);

        /*
         * System.out.print("11. Count the number of sameELements elements: ");
         * System.out.println(countsElements);
         * System.out.println("12. The answers is: "); countsElements.forEach((key,
         * value) -> System.out.println(countsElements.get(key)));
         */

        // Count the number of sameElements elements
        Map<String, Integer> countsElements = sameElements.parallelStream()
                .collect(Collectors.toConcurrentMap(w -> w, w -> 1, Integer::sum));

        // Take only second to last index
        ArrayList<Integer> valueList = new ArrayList<Integer>(countsElements.values());
        int arrayLength = countsElements.size();
        ArrayList<Integer> sublist = new ArrayList<Integer>(valueList.subList(1, arrayLength));

        // Print the result
        // System.out.println("14. The final result is: ");
        sublist.forEach((c) -> System.out.println(c));

    }

    public static void main(String[] args) throws Exception {
        matchingStrings();

    }

}
