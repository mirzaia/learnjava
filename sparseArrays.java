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
        n = sc.nextInt();

        // Iterator 12 lines
        for (i = 0; i <= n; i++) {
            // Take input: elements of strings
            strings.add(sc.nextLine());
        }

        // Take input: size of queries
        m = sc.nextInt();

        for (z = 0; z <= m; z++) {
            // Take input: elements of queries
            queries.add(sc.nextLine());
        }

        // to Test the input
        System.out.println(n);
        System.out.println(strings);
        System.out.println(m);
        System.out.println(queries);

        // Write your code here

    }

    public static void main(String[] args) throws Exception {
        matchingStrings();

    }

}
