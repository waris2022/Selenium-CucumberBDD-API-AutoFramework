package InterviewCoding;

public class ConvertStringToIntOrDouble {
///how to convert  String to Integer.
public void getStringConvertToint(String text) {//1
	

	int value = Integer.parseInt(text);   //(3)//Whatever the String text i have pass here.
	System.out.println(value);
	
}

public static void main(String[] args) {    //(2)
	new ConvertStringToIntOrDouble().getStringConvertToint("12434");
    
     }	  


}

               ///this is convert String to int.////
//(1)first i have create a normal method.and which String i have to convert pass 
    //this String inside the parenthesis()(i have to write String text).

//(2)then i have to call this method than i have to create object.than inside 
    //the method parenthesis()which String i have to convert pass here.

//(3)how to convert to int. i have pass int then value= to 
	//*int have two type.whenever is write int this is call primitive data type *
	//*and whenever write like this Integer this is call wrapper class so here i using this Integer
	//than i have to pass value inside the system out print parenthesis(). 

//Q=what is the method you have to using convert String to number
//An=convert String to number the method is call parseInteger.


         //how to converting String to double///
    //double=small double call is primitive data type.
	//Double=Capital Double call is Wrapper Class.
	
//{
//public void getStringconvertToDouble(String text) {
	
	//double value = Double.parseDouble(text);//(small letter double (value)this is call primitive data type
	//(= capital letter Double call is wrapper class)
	
	//System.out.println(value);
	
	//}

//public static void main(String[] args) {
	//ConvertStringToIntOrDouble().getStringconvertToDouble("20.34");
//}




