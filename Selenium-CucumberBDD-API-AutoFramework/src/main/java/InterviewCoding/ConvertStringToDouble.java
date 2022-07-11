package InterviewCoding;

public class ConvertStringToDouble {
	 //how to converting String to double///
	
	public void getConvertStringToDouble(String text) {//(1)dynamic method 
	
	double value=Double.parseDouble(text);//(2)Original code 
	
	System.out.println(value);//(3)//here i pass value and print value
	
   }
 

public static void main(String[] args) {//(4)
	new ConvertStringToDouble().getConvertStringToDouble("22.30");//(5)
   }

}
//small  double is primitive data type .
//Capital Double is wrapper class.
//(2) first write small letter double than my value than = than wrapper class capital Double 
	// than .(dod) than parseDouble(text)