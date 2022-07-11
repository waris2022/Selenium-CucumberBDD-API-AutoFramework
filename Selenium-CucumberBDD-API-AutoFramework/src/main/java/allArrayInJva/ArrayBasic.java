package allArrayInJva;

public class ArrayBasic {

	public static void main(String[] args) {
		
		
        int a=10;
		
		int[]myArray= {12,23,24};//(1)here total value or object is 3 is fixed.but index is 0,1,2;
		System.out.println("1st object="+myArray[0]);//(2)
		System.out.println("1st object="+myArray[1]);
		System.out.println("lastst object="+myArray[2]);
		try{
		System.out.println("1st object="+myArray[3]); 
		}catch(Exception e){
			//e.printStackTrace();
		}
	
		System.out.println("Good morning");
	
	}
}///what is array?
//An=Array is a object in java .array two type (1)Single dimension Array and multiple dimension Array.
//(1)here total value or object is 3 is fixed.but index is 0,1,

//(2) how to print the Array first 	i have to write System.out.println(); inside parameter if i want to print Individual  object 
//inside the parameter write  "1st object=" than + sign than object name myArray than i put array sign [] than inside Angle bracket
//i wrire whatever index number i want print.

//(1)how to write  try catch ; first write try than { left carli brecekt than whatever exception code than } right carlibrecekt than catch
//than perenthisis than() carli bracet{}

//(2)first i have to write try than left { than after the code }than write catch than(inside the catch parameter write exception e)
//parenthisis {e.printStackTrace} if i want to print exception name.