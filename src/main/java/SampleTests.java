import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SampleTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "Truth and Dare";
		//longest substring without repeat of characters
		
		String str1=str.replaceAll("\\s", "").toLowerCase();
		
			System.out.println(str1);
		//	Set<Character> li= new HashSet<>();
			List<Character> li= new ArrayList();
			char[] ch=str1.toCharArray();
			
//			for(char c: ch)
//			{
//				
//			li.add(c);
//		    }
//			
//			System.out.println(li+"\n\n");
//			for (char cs: ch)
//		{
//				if(li.contains(cs))
//				{
//					li.remove(cs);
//				//	break;
//				}
//				
//				else
//				{
//					li.add(cs);
//				}
//		}
//			System.out.println(li);
	
	
	
	for (int i=0;i<ch.length;i++)//truthanddare
	{
		System.out.print(li.get(i));
		
		for(int j=0;j<ch.length;j++)
		{
			
		}
	}
	}

}
