package InterviewCoding;

public class UncheckExceptionOrRuntimeException {
static String name; 
public static void main(String[] args) {
	System.out.println(name);

	try {
	System.out.println(name.concat("waris"));
	}catch (Exception e)	{
	//e.printStackTrace();//this method show me exception  
		
	}
   System.out.println("buy");//this is concat method?
   
    } 
	
 }
//i can print the null but when i try to manipulate null.(means null join with anther 
//String name) suppose:if i want to waris with null joint with together then java
//can not handle.bacuse java told i can not handle null manipulation.so i can not see
//any completion problem befoul Run for this reason this is call uncheckException
//or RunTimeException

//inside pelethisis()i have write name.dodconcat
//inside concat pelethisis("waris")

//Q=what is the way to  handle Uncheck Exception 
//An=I can handle Uncheck Exception by try catch

//Q=what is concat method?
//An=if I want to add two string together this is  call concat method.

