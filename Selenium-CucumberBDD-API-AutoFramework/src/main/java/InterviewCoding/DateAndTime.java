package InterviewCoding;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTime {
public static void main(String[] args) {//(1)create a main method
	
	
	Date date = new Date();//(2)//i creating object using java date,calendar and currentTime class.
	System.out.println(date);//(3)now i printing java default date.
	
	
	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss:a");//(4)//here i creating format object.
	
	System.out.println(sdf.format(date));//(5)here i change my format


   }

}

//(1)create a main method
	
//(2)i creating object using java date,calendar.current time class. now i create a object.
  //this is the java default format.this will give me everything date,calendar,current time.
  //first i have to create a object of Date.like: first write Date Date than = than new than Date(); 
  //than i have to import java.util.Date.

//(3) than System.out.println(date)inside the parameter i write date.

///(4)i don't want java default format.if i want to change the format(like;04/28/2022)this is call java SimpleDateFormat class.
  //this will be the first month than Date then year is coming.first i create a object like; first write SimpleDateFormat 
  //than i import it than object name like sdf then = than java New keyword than SimpleDateFormat();
  //than inside the SimpleDateFormat parameter i have to pass whatever format i want. 
  //than i write inside the parameter like this;("mm/dd/yyyy" hh:mm:a);mm for month,dd for date
  //yyyy for year,hh: for hour,mm for menit, a for am and pm.

//(5)now i printing the format and changing the format.inside the System.out.println(sdf.format(date));parameter frist i bring 
// object. here my object is sdf than .(dod) than i have to call format(Date date):String -DateFormat.
//than DateFormat parameter i have to bring my original date here.
