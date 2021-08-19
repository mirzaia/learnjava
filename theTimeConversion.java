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

    public static void theTimeConversion(){


        // var declaration
        String s = "";
        Scanner theScan = new Scanner(System.in);


        // Input string
        System.out.print("Input some Time: ");
        s = theScan.next();
        // test of input work
        System.out.print("The Input is: ");
        System.out.print(s); // it works


        // split alphanumeric
        //String theSplit = "((?<=[a-zA-Z])(?=[0-9]))|((?<=[0-9])(?=[a-zA-Z]))";
        // test of split works
        //System.out.println(Arrays.asList(s.split(theSplit))); // it works


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
        System.out.println("Try split string with StringBuffer(): ");
        System.out.println(alpha);
        System.out.println(num);
        System.out.println(special); // it works


        // Convert StringBuffer num to String
        String numString = num.toString();

        // Convert StringBuffer num to long
        Long newNum = Long.parseLong(numString);

        
        // Control flow to convert AM/PM to Military Time
        String newAlpha = alpha.toString();
        if(newAlpha == 'PM'){

        }
        else if(newAlpha == 'AM'){

        }

        
        // declare long datatype
        //long theTime = Long.parseLong(s);
        // test Long datatype
       // System.out.print("In Long datatype is: ");
       // System.out.println(theTime);



    }

    public static void main(String[] args) throws Exception {
        theTimeConversion();

    }

}
