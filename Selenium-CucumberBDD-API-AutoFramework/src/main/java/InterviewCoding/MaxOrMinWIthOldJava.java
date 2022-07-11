package InterviewCoding;

public class MaxOrMinWIthOldJava {
	public static void getMax(int[] myArray) {//must
		int max =myArray[0];//88
		int secondMax =myArray[0];//88
		int min =myArray[0];//88
		int secondMin =myArray[0];//88
		for (int i = 0; i < myArray.length; i++) {//88, 6, 4, 22, 2, 99
			if (myArray[i] > max) {// 99>88 =true
				secondMax =max;//88
				max = myArray[i]; // change max from 88 =myArray[i] 99
			}
			
			if (myArray[i] <min) {//2<4 =true
				secondMin =min;//4
				min = myArray[i]; // 2
			}
		} // loop end
		
		System.out.println("Max number found = "+max);
		System.out.println("2nd Max number found = "+secondMax);
		System.out.println("Min number found = "+min);
		System.out.println("2nd min number found = "+secondMin);

	}

	public static void main(String[] args) {
		int[] myArray = { 88, 6, 4, 22, 2, 99 };//myArray[0] =88
		MaxOrMinWIthOldJava.getMax(myArray);
	}
}
