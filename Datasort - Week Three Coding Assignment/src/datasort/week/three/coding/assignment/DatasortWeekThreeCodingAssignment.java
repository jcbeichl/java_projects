/**********************************************************************
*	Program:	Datasort 
*	Purpose: 	Java code that sorts, extracts data and saves it to a collection
*	Programmer:	James Beichler			
*	Class:		PRG/421r13, Java Programming II			
*	Instructor:	Jeff Lee			
*	Creation Date:	02/04/2019	
*
* Comments:
* Extracts data from a file, sorts it, displays it on screen, and saves it.
*
***********************************************************************/
package datasort.week.three.coding.assignment;

// import the needed classes
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class DatasortWeekThreeCodingAssignment {

    public static void main (String [] args) throws IOException {
        
        // input file on c: drive (with data)
        File fin = new File("C:\\Users\\Chris\\Desktop\\School Work\\PRG421\\week 3\\individual\\Datasort - Week Three Coding Assignment\\input.txt");
        
        // create an out file on c: drive
        File fout = new File("C:\\Users\\Chris\\Desktop\\School Work\\PRG421\\week 3\\individual\\Datasort - Week Three Coding Assignment\\sorted.txt");	

        // Java FileInputStream class obtains input bytes from a file
        FileInputStream fis = new FileInputStream(fin);	  
        FileOutputStream fos = new FileOutputStream(fout);

        BufferedWriter out;
        try ( // buffering characters so as to provide for the efficient reading of characters, arrays, and lines
                BufferedReader in = new BufferedReader(new InputStreamReader(fis))) {
            out = new BufferedWriter(new OutputStreamWriter(fos));
            // declare an array in-line, ready for the sort
            String aLine;
            ArrayList<String> al = new ArrayList<> ();
            int i = 0;
            while ((aLine = in.readLine()) != null) {
                
                // set the sort  for values is greater than 0
                if (!aLine.trim().startsWith("-") && aLine.trim().length() > 0) {
                    al.add(aLine);
                    i++;
                }
            }
            // sorted content to the output  file
            Collections.sort(al);
            for (String s : al) {
                System.out.println(s);
                out.write(s);
                out.newLine();
                out.newLine();
            }
            // close file
        }
		out.close();
	}
}

