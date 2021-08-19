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

public class theTimeConversion {

    public static void theTimeConversion() {

        // var declaration
        String s = "";
        Scanner theScan = new Scanner(System.in);



        // Input string
        System.out.print("TEST: Input some Time: ");
        s = theScan.next();
        // Check if input is working
        System.out.print("TEST: The Input is: ");
        System.out.println(s); // is working
        


        // split alphanumeric
        // String theSplit = "((?<=[a-zA-Z])(?=[0-9]))|((?<=[0-9])(?=[a-zA-Z]))";
        // Check if split is working
        // System.out.println(Arrays.asList(s.split(theSplit))); // is working



        // Try another split method
        // using StringBuffer()
        
        StringBuffer alpha = new StringBuffer();
        StringBuffer num = new StringBuffer();
        StringBuffer special = new StringBuffer();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)))
                num.append(s.charAt(i));
            else if (Character.isAlphabetic(s.charAt(i)))
                alpha.append(s.charAt(i));
            else
                special.append(s.charAt(i));
        }
        System.out.println("TEST: Try split string with StringBuffer(): ");
        System.out.println(alpha);
        System.out.println(num);
        System.out.println(special); // is working

        // Convert StringBuffer num to String
        String numString = num.toString();

        // Convert StringBuffer num to long
        Long newNum = Long.parseLong(numString);

        // Check if newNum is working
        System.out.print("The long convertion is: ");
        System.out.println(newNum); // is working



        // Control flow to convert AM/PM to Military Time
        
        boolean isAM = s.endsWith("AM") || s.endsWith("aM") || s.endsWith("Am") || s.endsWith("am");
        boolean isPM = s.endsWith("PM") || s.endsWith("pM") || s.endsWith("Pm") || s.endsWith("pm");
        int n = 2; // two digits
        int b = Integer.parseInt(("" + num).substring(0, n)); // take two digits from num
        System.out.println(b);
        /*boolean hour = 

        if(hour == true && minutes == true && seconds == true) */
        

        if (isPM) { 
            //System.out.println("is PM");
            if (newNum <= 120000) {
                String thePM = ""; 
                String onlyForPM = s.substring(2,8);

                switch(b) {
                    case 1: thePM = "13";
                    break;
                    case 2:
                    thePM = "14";
                    break; 
                    case 3:
                    thePM = "15";
                    break;
                    case 4:
                    thePM = "16";
                    break;
                    case 5:
                    thePM = "17";
                    break;
                    case 6:
                    thePM = "18";
                    break;
                    case 7:
                    thePM = "19";
                    break;
                    case 8:
                    thePM = "20";
                    break;
                    case 9:
                    thePM = "21";
                    break;
                    case 10:
                    thePM = "22";
                    break;
                    case 11:
                    thePM = "23";
                    break;
                    case 12:
                    thePM = "24";
                    break;

                }
                String pmAnswer = thePM.concat(onlyForPM);
                System.out.println(pmAnswer);
            }
            else { 
                System.out.println("ERROR - YOUR INPUT FORMAT IS INVALID"); 
            } 
        } 
        else if (isAM) {
            System.out.println("is AM");
            if (newNum <= 120000) { 
                System.out.println(s.substring(0,8));
                //long convertionAM = newNum; 
                //System.out.println(convertionAM);
            } 
            else {
                System.out.println("ERROR - YOUR INPUT FORMAT IS INVALID"); 
            } 
        } 
        else {
        System.out.println("ERROR - YOUR INPUT FORMAT IS INVALID"); 
        }
          
          
          // declare long datatype //long theTime = Long.parseLong(s); // test Long
         // datatype // System.out.print("In Long datatype is: "); //
         //System.out.println(theTime);
         
         

}

    public static void main(String[] args) throws Exception {
        theTimeConversion();

    }

}
