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

public class lonelyInteger {

    public static void lonelyInteger() {

        Scanner deScan = new Scanner(System.in); // scanner
        int n; // member of array
        List<Integer> a = new ArrayList<Integer>(); // array
        int i; // iterator
        int x;

        n = deScan.nextInt();

        for (i = 0; i < 1; i++) {
            for (x = 0; x < n; x++) {
                a.add(deScan.nextInt());
            }

        }

        System.out.println("Number of array elements: " + n);
        System.out.println("The array was: " + a);

    }

    public static void main(String[] args) {
        lonelyInteger();
    }

}
