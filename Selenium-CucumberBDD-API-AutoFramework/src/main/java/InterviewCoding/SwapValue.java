package InterviewCoding;
//two way i can  Swap the variable (1)one is call with third value(2)without any third value

public class SwapValue {
	//if i want swap int a=10;
	//if i want swap int b=20;

 public static  void getswap(int a,int b) {                  //(1)//method 
	          //int a=10
	          //int b=20
		System.out.println("A value before swap="+a); //(3) 
		System.out.println("B value before swap="+b); //(3) 
		a=a+b;           
		b=a-b;      //<(2) 
		a=a-b;  
	System.out.println("**********************");	
		System.out.println("A value after swap="+a);   //(3)
		System.out.println("B value after swap="+b);   //(3)		
		
	}
	
 public static void main(String[] args) {               //(4) 
	 SwapValue.getswap(10,20);                       //(5)this is static
    
	// SwapValue obj = new SwapValue();                    //(6)no static
	// obj.getswap(10,20);                                //(7)

    }

}

//(1) first i have to create a method.than inside the parameter i write only value int a ,(comma)int b;
     //its from int a =10 and int b= 20 for  dynamic coding Method level.
	 //and here is two parameter one is int a other one is int b.
     //dynamic code =two way i can do dynamic coding one is Method parameter other one is Constructor parameter.

//(2) Actual code inside the main method.

//(3)inside the printing parameter i write "A value after swap=" its for understanding 
	//and =(equal sign) its for String than +(plus) than a is int.so String + integer work together.

//(4)this is main method for calling the other method.i create a main method here my main method is static.

//(5)for static if method is static no need to create object.i have to call class name .(d0d) method name 
  //and parenthesis like this; SwapValue.getswap(29, 48);inside the parameter i have to pass argument value whatever i want.

//(6)i create a object because my method is no static 

//(7)inside the parameter i have to pass argument value whatever i want.


//Q=what is swap value?
//An=swap means opposite value.
