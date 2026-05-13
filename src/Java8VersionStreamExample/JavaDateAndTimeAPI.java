package Java8VersionStreamExample;
import java.util.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

// Date and Time J8 : java.time package , It's inspired by the Joda-Time library developer by joda.org.
   //Advantages : 
    /// a. Easy to use
    /// b. Better performance
    /// c.  Thread- safe 
    /// d. immutable objects
    /// e. more readable and convenient
   
// 1. Display Current System Date : 

public class JavaDateAndTimeAPI {
	public static void main(String[] args) {
		
		// get current date 
		LocalDate date = LocalDate.now();
		
		//display date 
		System.out.println("Current Date :" + date);
	}
       
}

// 2. Display Current System Time : 
     class JavaCurrentTime{
    	 public static void main(String[] args) {
    		 LocalTime time = LocalTime.now();
    		 
    			//display time 
    			System.out.println("Current Time :" + time);
    	 }
     }

 // 3. Together time and date 
     class JavaCurrentTimeDate{
    	 public static void main(String[] args) {
    		 
    		 LocalDateTime dt = LocalDateTime.now();
    		 
    		 System.out.println("Current Date and Time : "+dt);
    	 }
     }
     
     
   // 4. Get Day, Month and Year Separately : 
     
     class JavaDateSparate{
    	 public static void main(String[] args) {
    		 
    		 LocalDate date = LocalDate.now();
    		 
    		 int dd = date.getDayOfMonth();
    		 int mm = date.getMonthValue();
    		 int yy = date.getYear();
    		 
    		 System.out.println(dd+"/"+mm+"/"+yy);
    	 }
     }
     
     // 5. Get Hours, Minutes , Second and Nano Seconds Separately :
     
     class JavaTimeSparate{
    	 public static void main(String[] args) {
    		 LocalTime time = LocalTime.now();
    		 
    		 int h = time.getHour();
    		 int m = time.getMinute();
    		 int s = time.getSecond();
    		 int n = time.getNano();
    		 
    		 System.out.println(h +":"+ m+ ":"+ s + ":"+ n);
    				 
    	 }
    	 
     }	 
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     