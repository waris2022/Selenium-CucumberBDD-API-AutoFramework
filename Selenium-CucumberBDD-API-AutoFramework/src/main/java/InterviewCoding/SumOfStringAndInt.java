package InterviewCoding;

public class SumOfStringAndInt {

    
	static String value ="15";//(1)this is String value 
    static int data =5;//(1)this is int value

    public static void main(String[] args) {//(2)
	
    int a=Integer.parseInt(value);//(4)here i convert String to int	
	int sum =a + data;//(3)
	
	System.out.println(sum);//(5)
	
	}

}

//Q=what is sum?
//An= sum means String value+int valie like if String value is 15+INT value is 15+ 5= 20. 
//how i am loking for sum what will be sum(sum means String value plus int value i have )
                           
                                      //code logic ///
//(1)first i have to declare String and int value.example:String value is 15 and int value is 5.

//(2)then i create a main method for the method call 

//(4)than i convert String to int:i hve to write int a =(capital)Integer.parseIntthen pass inside the paramiter(value)
//then i have to do the int sum= a+data;

//(3)//here sum = value is string and data is int .so in java String and int dose not match because of two different kind of data.
//java math do not allow String with int,java allow int with Double.for this reason i convert String to the int.

//(5)than ihave to do the sum.now i have to write ystem.out.println(sum) 
//for print the sum inside the  put sum.