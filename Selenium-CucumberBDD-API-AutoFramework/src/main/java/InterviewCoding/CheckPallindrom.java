package InterviewCoding;

public class CheckPallindrom {

	
	void getpalindrom(String text) {//1
StringBuffer reversetext =new StringBuffer(text).reverse();//2 this is original text befour Reverse.
		System.out.println(reversetext);//3 this is after reverse text
	
//before &after reverse is same for this reason i use java if else conditional statement hre.	
if(text.equals(reversetext.toString())) {//i have to covered .to String

	System.out.println("itspalindrom");	 

}else {
	
	System.out.println("its not palindrom");
}
	
		
		
	}
	
	public static void main(String[] args) { //in hare i  calling the main method.
	new CheckPallindrom().getpalindrom("MOM"); //here inside the parenthesis()i have to write whatever i want to reverse

	}
}
//write code to check pallindrom.
//Q=what is pallindrom?
//An= before reveres and after reverse word should be same if it is same this is call pallindrom.
//or before reverses and after reveres if anything is the same this is call pallindrom
//example is;"MOM","POP" first i have to reverse 
                      ////////code formula///
//(1)i create a method than inside the parameter(String text) i have write String text 
//whatever value i want pass its come here.for dynamic coding.

//(2)String don't have any reverse method for this reason i have to use StringBuffer 
//or i can use StringBuilder because i reversing my text

//(3)//so i reversing my String here

//(4)//in hare i  calling the main method.
//here inside the parenthesis()i have to write whatever word i want to reverse

//(5)then i have to check before reveres and after reverse is same for this reason i have use java,,if{ else}conditional statement  
//if my the text 