package JavaCollectionFramework;
import java.util.*;
import java.io.*;
// Properties : Special java class which used to store objects in the way of key-value pair. 
// we are creating files, extension is .properties
// it's comes from java.util package. it's child of Hash-table. 

//for Example Configuration of Data : 

//fileName : db.properties

//StringUrl = "jdbc:mysql://localhost:3306/test"
//StringUser = "root"
//StringPass = "1234"


public class JavaPropertiesExamples {
 
	public static void main(String[] args) throws Exception{
		
		//create properties object
		Properties P = new Properties();
		
		//Reading stream for FS
		FileInputStream fs = new FileInputStream("abc.properties");
		
		P.load(fs);
		
		//Printing all properties..
		//System.out.println(P);
		
		// reading specific value of property
		String S = P.getProperty("StringUser");
		
		System.out.println(S);
		
		//Add new property 
		P.setProperty("AmanKumar", "25");
		
		// Storing updated data : 
		FileOutputStream fos = new FileOutputStream("abc.properties");
		
		P.store(fos, "Updated File");
		
		System.out.println("Properties Updated successfully");
		
		
		
		//Printing all properties..
		System.out.println(P);	
		
	}
}

// Java Program for DB connection 

class JdbcDemo{
	
	public static void main(String[] args) throws Exception  {
		
		Properties props = new Properties();
		FileInputStream fis = new FileInputStream("db.properties");
		
		props.load(fis);
		
		props.setProperty("DBUrl", "\"jdbc\\:mysql\\://localhost\\:3306/test\"");
		props.setProperty("DBUser", "DbRoot");
		props.setProperty("DBPassword", "123@GCD");
		
		//System.out.println(props);
		
		// Enumeration creating .....
		
		Enumeration<?> e = props.propertyNames();
		
		while(e.hasMoreElements()) {
			String key = (String)e.nextElement();
			System.out.println(key + "=" + props.getProperty(key));
		}
		
		FileOutputStream fos = new FileOutputStream("db.properties");
		
		props.store(fos, "updated file");
		
		System.out.println(props);
		
	}
}