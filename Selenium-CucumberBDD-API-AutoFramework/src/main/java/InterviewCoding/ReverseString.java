package InterviewCoding;

public class ReverseString {

    static void getReverse(String text) {//1
	
	StringBuffer reverseText=new StringBuffer(text).reverse();//2
	System.out.println(reverseText);//3

	
   }	
	
    public static void main(String[] args) {//4
	new ReverseString().getReverse("warisali");
	
    }

}
///**two way i can reverse String (1)one is negative forloop (2)another one is
///reverse method.Q=who has the reverse method?An=Stringbuffer and Stringbuilder have reverse method.
///string don't have reverse method.

/////////////////code formula//////////
//(1)i create a method than inside the parameter(String text) i have write String text
//for dynamic coding.

//(2)String don't have any reverse method for this reason i have to use StringBuffer 
//or i can use StringBuilder because i reversing my text

//(3)//so i reversing my String here

//(4)//in hare i  calling the main method.
//here inside the parenthesis()i have to write whatever word i want to reverse