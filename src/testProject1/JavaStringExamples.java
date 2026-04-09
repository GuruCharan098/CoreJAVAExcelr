package testProject1;
import java.util.StringTokenizer;
public class JavaStringExamples {
	
	// String Handling Concepts...!
	
	public static void main(String[] args) {
		
		// String : 
		String name1 = "RohitKumarMan";  // SCP Local Stack Memory of Java program
		String name2  = "Pawan";
		
		System.out.print(name1 == name2);
		
		String name3 = new String("pawan"); // Heap Memory of Java program (Using New keyword)
		
		String name4  = new String("pawan");
		
		System.out.println(name3 == name4);
		
		System.out.println(name1.charAt(2));
		System.out.println(name1.length());
		
		System.out.println(name1.substring(2,5) + " "+ name1.substring(10,13));
		System.out.println(name1.indexOf("i"));
		
		String S1 = "Hemant";	
		String S2 = "tEsT";

		System.out.println(S1.equals(S2));
		System.out.println(S1.equalsIgnoreCase(S2));
		
		System.out.println("roshan1".replace('1','i'));
		System.out.println(S2.toUpperCase());
		System.out.println(S2.toLowerCase());
		
		System.out.println(name1.hashCode());
		
		// String Buffer :
		
		StringBuffer sb = new StringBuffer("Pawan");
				
		sb.append("Kalyan");
		System.out.println(sb);
		
		sb.insert(11, "Ji");
		System.out.println(sb);
		
		sb.delete(11, 13);
		System.out.println(sb);
		
		
		sb.reverse();
		System.out.println(sb);
		
		// String Builder :
		
		StringBuilder Sr = new StringBuilder("Hello");
		Sr.append(" world");
		System.out.println(Sr);
		
		// String Tokenizer :
		
		StringTokenizer st = new StringTokenizer("This is a Book");
		while(st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}
		
		
		
		
	}
	

}
