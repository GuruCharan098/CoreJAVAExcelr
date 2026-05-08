package JavaCollectionFramework;
import java.util.*;

// Enum In Collections like 
// a. List
// b. Set
// c. Map

// Enum List : 
enum Day{
	MON, TUE, WED
}
public class JavaEnumCollections {
     public static void main(String[] args) {
    	 
    	 List<Day> list = new ArrayList<>();
    	 
    	 list.add(Day.MON);
    	 list.add(Day.TUE);
    	 list.add(Day.WED);
    	 
    	 System.out.println(list);
     }
}


// Enum Map :

enum color{
	Red, Yellow, Blue
}
class JavaEnumMap{
	  public static void main(String[] args) {
	    	 
	    	 Map<color, String> map = new HashMap<>();
	    	 
	    	 map.put(color.Red, "A");
	    	 map.put(color.Yellow,"B");
	    	 map.put(color.Blue, "C");
	    	 
	    	 System.out.println(map);
	    	 System.out.println(map.get(color.Blue));
	     }
}

// Enum Set : 
enum Days{
	MON, TUE, WED, THRU, FRI, SAT
}
class JavaEnumSet{
	  public static void main(String[] args) {
	    	 //EnumSet<Days> set = EnumSet.of(Days.MON, Days.WED)	 ;
		     // EnumSet<Days> set = EnumSet.allOf(Days.class);
		  
		  EnumSet<Days> set = EnumSet.noneOf(Days.class);
		  
		  set.add(Days.MON);
		  
	      System.out.println(set);
	     }
}



//  Enum Set VS Enum Map: 
//1. Store : values only  ,    Key-value pair.. 
// 2. Keys : not applicable , must be enum constant.
// 3. Duplicates items : not allowed , Keys unique but value can be duplicate. 