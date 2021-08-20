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
        System.out.print("1. Input the size of strings: ");
        n = sc.nextInt();

        // Iterator 12 lines
        System.out.println("2. Input the strings elements: ");
        for (i = 0; i <= n; i++) {
            // Take input: elements of strings
            strings.add(sc.nextLine());
        }

        // Take input: size of queries
        System.out.print("3. Input the size of queries: ");
        m = sc.nextInt();

        System.out.println("4. Input the queries elements: ");
        for (z = 0; z <= m; z++) {
            // Take input: elements of queries
            queries.add(sc.nextLine());
        }

        // to Test the input
        System.out.print("5. Size of the strings are: ");
        System.out.println(n);
        System.out.print("6. Elements of the strings are: ");
        System.out.println(strings);
        System.out.print("7. Size of the queries are: ");
        System.out.println(m);
        System.out.print("8. Elements of the queries are: ");
        System.out.println(queries);

        // Write your code here

        /*
         * Map<String, Long> collect = strings.stream().collect( groupingBy(
         * Function.identity(), counting() ) );
         * 
         * }
         */

        // Count queries elements
        Map<String, Integer> counts = queries.parallelStream()
                .collect(Collectors.toConcurrentMap(w -> w, w -> 1, Integer::sum));
        System.out.print("9. Count the number of queries elements: ");
        System.out.println(counts);

        /*
         * Set<String> set = new LinkedHashSet<>(); set.addAll(list);
         * 
         * for (String s : set) {
         * 
         * System.out.println(s + " : " + Collections.frequency(list, s)); }
         */

        /*
         * System.out.println("Freq of queries in strings: " +
         * Collections.frequency(strings, "abc"));
         */
    }

    public static void main(String[] args) throws Exception {
        matchingStrings();

    }

}
