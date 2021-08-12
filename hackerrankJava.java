import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.lang.Object.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.Scanner;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
     
    
    public static void plusMinus(List<Integer> arr) {
        // deklarasi variabel
        /*
         * int n; int i = 0; int jawaban; double positiveAnswer; double negativeAnswer;
         * double zeroAnswer;
         */

        Scanner sc = new Scanner(System.in); 
        int pos = 0;
        int neg = 0;
        int zer = 0;
        int i;
        int n;
        int jawaban;

        n = sc.nextInt();
        for(i=0; i<n; i++){
            jawaban = sc.nextInt();
            arr = arr.add( 
        }
        


        
        
        // List<Integer> arr = new ArrayList<Integer>();
        // int x;
        // List<Integer> thisArr = new ArrayList<Integer>();
        // List<Integer> arr = new ArrayList<Integer>();

        
        // Deklarasi objek scanner
        
        
        // Input jumlah elemen array
        // System.out.print("Masukan jumlah elemen yang diinginkan");
        // n = sc.nextInt(); // objek scanner untuk input elemen array
        
        
        // Input member array
        // arr = new int[n];
        // System.out.print("Masukan anggota array ini");
        // arr.nextInt();
        
        // for (i=0; i<n; i++){
        
        // jawaban = sc.nextInt();
        // arr.add(jawaban);
        // List<Integer> arr[x] = sc.nextInt();
        // } // objek scanner untuk input anggota array
        
        
        
        // Menghitung jumlah elemen masing2
        
        //long positive = arr.stream().count();
        // long negative = arr.stream().count();
        // long zero = arr.stream().count();

        // long positive = arr.stream().count(i > 0);
        // long negative = arr.stream().count(i < 0);
        // long zero = arr.stream().count(i == 0);
        
        
        // Menghitung rasio masing2
        //double ratioPositive = Math.floorDiv(positive, n);
        //double ratioNegative = Math.floorDiv(negative, n);
        //double ratioZero = Math.floorDiv(zero, n);
        
        
        
        // Deklarasi decimal format untuk 6 digit decimal
        //DecimalFormat df = new DecimalFormat();
        //df.setMaximumFractionDigits(6);
        
        //positiveAnswer = df.format(ratioPositive);
        
        
        // Print ratio of positive number
        // System.out.print("Rasio dari elemen yang bernilai positif = ");
        //System.out.println(df.format(ratioPositive));
        
        // Print ratio of negative number
        // System.out.print("Rasio dari elemen yang bernilai negatif = ");
        //System.out.println(df.format(ratioNegative));
        
        // Print ratio of zero number
        // System.out.print("Rasio dari elemen yang bernilai zero = ");
        //System.out.println(df.format(ratioZero));
        
        
        
        
    // Write your code here

    }

}

/* public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
} */
