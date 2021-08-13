//import java.io.*;
//import java.math.*;
//import java.security.*;
import java.text.*;
import java.util.*;
//import java.lang.Object.*;
//import java.util.concurrent.*;
//import java.util.function.*;
import java.util.Scanner;
//import java.util.regex.*;
//import java.util.stream.*;
//import static java.util.stream.Collectors.joining;
//import static java.util.stream.Collectors.toList;

class Result {

    
    public static void plusMinus() {
    

        Scanner sc = new Scanner(System.in); // scanner declaration
        List <Integer> arr = new ArrayList<Integer>(); // array declaration
        float pos = 0; // positive declaration
        float neg = 0; // negative declaration
        float zer = 0; // zero declaration
        int i; // iterator
        int n; // max array elements
        
         
        
        float hasilPos; // result of the positive
        float hasilNeg; // result of the negative
        float hasilZer; // result of the zero
        DecimalFormat df = new DecimalFormat(); // decimal format 

        n = sc.nextInt(); // input number of array element
        
        for(i=0; i<1; i++){
        
            for( int j = 0; j < n; j++){
                 arr.add(sc.nextInt());
            }  // input array element
            //arr.add(sc.nextInt());
        } 
        sc.close();

        for (i=0; i<n; i++){
            if(i > 0){ // if it is positive number, then
                pos++;

            }
            else if(i == 0){ // if it is zero numbers, then
            zer++;
            }
            else { // if it is negative numbers, then
            neg++;
            }
        }
            
        // calculation
        hasilPos = pos/n;
        hasilNeg = neg/n;
        hasilZer = zer/n;

        // set decimal number to 6 
        df.setMaximumFractionDigits(6);
        
        String hasilPosDec = df.format(hasilPos); // convert to decimal 6
        String hasilNegDec = df.format(hasilNeg);
        String hasilZerDec = df.format(hasilZer);

        
        float floatPos = Float.parseFloat(hasilPosDec); // convert to float
        float floatNeg = Float.parseFloat(hasilNegDec);
        float floatZer = Float.parseFloat(hasilZerDec);
        
        System.out.println(floatPos); // print result
        System.out.println(floatNeg);
        System.out.println(floatZer);

        sc.close();

        //System.out.println(hasilPosDec); // print result
        //System.out.println(hasilNegDec);
        //System.out.println(hasilZerDec);
        
    }



public static void main(String[] args){
        plusMinus();
}

}

