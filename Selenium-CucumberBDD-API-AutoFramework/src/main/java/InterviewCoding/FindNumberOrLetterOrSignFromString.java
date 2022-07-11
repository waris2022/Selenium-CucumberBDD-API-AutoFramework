package InterviewCoding;

public class FindNumberOrLetterOrSignFromString {

	
	//how print only letter?so i have to do java regular expression.non as a java regex.
	//what is java regular expression?there is one regular expression is \\D.
	
	static String text="7812warisali#$@";//(1)this my all text String.
	
	public static void main(String[] args) {//(2)this is main method 
		
		String onlynumber= text.replaceAll("\\D","");//(4) remove all letter and sign.
		System.err.println(onlynumber);//(4)
		
		String noNumber= text.replaceAll("\\d","");//(5) remove all number.
		System.err.println(noNumber);//(5)
		
		String Nosign= text.replaceAll("\\W","");//(6)remove all  sign.
		System.err.println(Nosign);//(6)
	
		String onlysign= text.replaceAll("\\w","");//(7) only sign.
		System.err.println(onlysign);//(7)
		
		String onlyLetter= text.replaceAll("\\d","").replaceAll("\\W","");//(8) remove all number.
		System.err.println(onlyLetter);//(5)
		
	}
	
	
}
        ////how to FindNumber,OrLetter,Or Sign,FromString///

  //how to find  number from the hole String?
//(1)first i have write static String text="7812warisali#$@";
//(2)than i create  a main method.

//(4)than want to remove all letter and sign.first i have to write String onlynumber
//than = than text (this my String) than .(dod) than select  replaceAll method 
//inside the method parameter i have to write like this; "\\D","" (here i bring ("\\D") one regular expression.
//is double back slash like; \\ and capital D like;D. this regular expression which Remove all letter and spatial character) 
//**java regular expression is \\ and capital D.  D means it is looking for only number and remove all letters and sign. 

//(4)than i have to print this method.inside the parameter i have to  copy onlynumber.

//(5)java regular expression is \\ and small d.  d means it is looking for only letter and sign and remove all numbers. 

//(6)java regular expression is \\ and capital W. W means it is looking for only letter and number and remove all spatial character or sign.

//(7)java regular expression is \\ and small w.  w means it is looking for only spatial character or sign and remove all numbers and letter. 

// (8)this is combination of noNumber and Nosign first i have to write String onlyLetter than = then 
//(this will give me no number) text.replaceAll("\\d","") than .(dod) than replace one more time (witch one give  me nosing) replaceAll("\\W","");
//like this: String onlyLetter= text.replaceAll("\\d","").replaceAll("\\W","");