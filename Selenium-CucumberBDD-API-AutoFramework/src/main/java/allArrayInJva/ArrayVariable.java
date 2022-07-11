
package allArrayInJva;

import java.util.Arrays;

public class ArrayVariable {
     /////java collection ////
//variable  can't handle more then 1 value (int a=10;)this is one=(int is Data type ) (a is variable )(10 is value))
//static int a = 10;//(1)
	
//so i need 'array' object.
		//why java bring  this array because variable can't handle more then  i value
		// java bring object.ojbect name call is ;;Array;;
	
	static int [] a = {10,20,30,40,55};  //(2)after data type  array sing ([] this is single  dimension array)
	static int [][] b = {{35,45},{38,39}};//this is two dimension Array
	
	public static void main(String[] args) {
	
		int [] c= {5,6,7,8};
		//static int [][] b = {{12,13},{14,15}}
		
		//System.out.println(a);//(1)
		
		System.out.println(a);//java  (Arrays.toString)java bring new Class 
		//name is arrays.toString
        
		System.out.println( Arrays.toString(b));

        System.out.println(c);
	} 
	

}