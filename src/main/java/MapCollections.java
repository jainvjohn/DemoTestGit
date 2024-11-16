import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hmap =new HashMap();
		hmap.put(101, "Jake");
		hmap.put(102, "Mil");
		hmap.put(108,"Sam");
		hmap.put(109, "Derik");
		hmap.put(103, "Jake");
		hmap.put(104, "Lily");
		hmap.put(105,"Ram");
		hmap.put(106, "Ceril");

		System.out.println(hmap);
		System.out.println("\n");
		
		boolean hmapData= hmap.isEmpty();
		System.out.println("HasMap is empty or not? "+hmapData);
		System.out.println("\n");
		
		System.out.println("Size of the Map is "+hmap.size());
		System.out.println("\n");
		
		String valueNameOfKey=(String) hmap.get(101);
		System.out.println(valueNameOfKey);
		System.out.println("\n");
		
	System.out.println(hmap.containsKey(101));
	System.out.println(	hmap.containsValue("Lily"));
	
	Set keys=hmap.keySet();
	for(Object key: keys)
	{
		System.out.println(key+" is present in the Map : "+hmap.containsKey(key));
		System.out.println("Value of the key : "+ key +" is present in the Map : "+hmap.get(key));
		System.out.println("\n");
		
	}
	
	//Map.Entry entries= hmap.entrySet();
	System.out.println("\n");
	System.out.println("\n");
	
	String str="12231";
	
	int num1=Integer.parseInt(str);
	System.out.println(num1);
	int n=3485;
	StringBuilder sbw= new StringBuilder();
	System.out.println(str.toString());
	}
}
