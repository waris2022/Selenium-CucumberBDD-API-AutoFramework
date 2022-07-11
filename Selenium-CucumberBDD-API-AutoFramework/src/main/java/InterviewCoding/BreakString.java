package InterviewCoding;

import java.util.Arrays;

public class BreakString {
//how to breack String/
	
static String country="United states of america";//(1)how break the string into 4 pieces?
                                           //
    public static void main(String[] args) {//(2)

	
	String [] pieces = country.split(" ");//(3)here i breaking the String
	System.out.println(Arrays.toString(pieces));//(4)so how nto print the array
	
	//String sub =country.substring(12,14);//(5)this is substring have 3 type i have to select beginindex int endindex 
	//System.out.println(sub);
	
	 
	
  }
 

}
                  ///this is how to break the String?****///
//(1)how to break the string into 4 pieces?
//An=first i have  write static String then String name(here country is String name) = then inside 
//the double quotation ("") than i have to write whatever String(word)i want to break.
//like: static String country="United states of america";(i use static keyword Because of my main method is static).

//(2)the i have to create a main method for calling the String  

//(3)then here i have to the break String.if i want to break String name first copy or write String name.
//then .(dod) then i have to select split method.then inside the parameter i  have to put double quotation "" and one space
//for 4 pieces of String.this will break String piece by piece .the i have  to write before String name String pieces then put = sine it is giving me read.
//because String value(variable can not handle more then one value or data.here is 4 data) is more then one theswhy give me read.
//if i want handle 4 value then i have chose either Array or collection so i chose Array.before pieces i have to put [] sine. then code is work.

//(4)inside the System.out.println(Arrays.toString(pieces))parameter i have to write Arrays.toString(pieces) 
//then inside Arrays.toString(pieces) parameter i have put,pieces, now it is break into the 4 pieces.

                /////this is how to find the subString?****////
//(5)what is substring?
//An=if i want to print a small part from the String this is call substring method.
//then i write country.substring(12,14); inside the substring parameter i have to put starting index and ending index number whatever part of the String i want to print.
//then i write,String sub, whatever thing the value then i put = sine before the country.substring(12,14).

//(6)then i have print this method System.out.println(sub) inside the parameter i have put s.for calling the substring method.

//if i want to break the String then i have to chose  split method();
//if i want to find inside the big String then use substring method();