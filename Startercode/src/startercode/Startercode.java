/**********************************************************************
*	Program:	Startercode 
* 	Purpose: 	Class assignment:  
*                       Students - Given starter code, students write code that uses the
*                       Locale object (language, country, etc.) *
*		        The questions marks (?) in the code are to be completed by the students.
*		        Add comments/documentation to the code lines
*	Programmer:	James Beichler			
*	Class:		PRG/421r13, Java Programming II			
*	Instructor:	Jeff Lee			
*	Creation Date:	2/11/2019	
*
*	Comments:
*		For additional information,  refer to: 
*		OCA/OCP Java SE7, Programmer I & II Study Guide 
*		Chapter 8: String Processing, Data Formatting, Resource Bundles
*		Section: Working with Dates, Numbers, and Currencies
*	
***********************************************************************/

package startercode; 

//imports
import java.text.DateFormat; 
import java.text.NumberFormat; 
import java.util.Currency; 
import java.util.Date; 
import java.util.Locale; 

public class Startercode { 
    public static void main(String[] args) { 
        
        //variable 
        long number = 5000000L; 

        //format variable into a default number
        NumberFormat numberFormatDefault = NumberFormat.getInstance(); 
        System.out.println("Number Format using Default Locale: "+numberFormatDefault.format(number)); 
        NumberFormat numberFormatLocale = NumberFormat.getInstance(Locale.US); 
        System.out.println("Number Format using Default Locale: "+numberFormatLocale.format(number)); 

        //taking number and making it into currency
        NumberFormat numberFormatDefaultCurrency = NumberFormat.getCurrencyInstance(); 
        System.out.println("Currency Format using Default Locale: "+numberFormatDefaultCurrency.format(number)); 

        NumberFormat numberFormatLocaleCurrency = NumberFormat.getCurrencyInstance(Locale.US); 

        System.out.println("Currency Format using Default Locale: "+numberFormatLocaleCurrency.format(number)); 
        
        //describing the type of currency
        Currency currency = Currency.getInstance(Locale.US); 
        System.out.println(currency.getDisplayName()+"("+currency.getCurrencyCode()+")"+currency.getDisplayName()); 
        
        //formating into today's date
        Date currentDate = new Date(); 
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, Locale.US); 
        System.out.println("Date Format in Default Locale: "+dateFormat.format(currentDate)); 

    } 
}
