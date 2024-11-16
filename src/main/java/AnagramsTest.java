import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramsTest {

		//Anagrams

		
		public static boolean validateAnagrams(String[] strAry)
		{
			boolean flag = false;
			
			for(int i=0;i<strAry.length-1;i++)//i=0,1,2
				{
//				for(int j=0;j<=strAry.length-1;j++)//j=0,1,2
//				{
//			//strAry[i]=strAry[i];//i=0,1
			String strAryEle1=strAry[i];
			
			
		//	strAry[j]=strAry[i+1];//j=1,2
			String strAryEle2=strAry[i+1];
			
			 flag=compareAnagram(strAryEle1,strAryEle2);
			}
//			}
			
			
			
			return flag;
		}
		public static boolean compareAnagram(String s2, String s3)
		{

		if (s2.length()==s3.length())
		{
		char[] ch2=s2.toCharArray();
		char[] ch3=s3.toCharArray();
		 
		Arrays.sort(ch2);
		System.out.println(ch2);
		
		Arrays.sort(ch3);
		System.out.println(ch3);
		List<Character> li2= new ArrayList();
		List<Character> li3 = new ArrayList();

		for(int i=0;i<ch2.length;i++)
		{
		li2.add(ch2[i]);
		}
		System.out.println(li2);


		for(int i=0;i<ch3.length;i++)
		{
		li3.add(ch3[i]);
		}
		System.out.println(li3);

		if (li2.containsAll(li3))
		{
		System.out.println("It is a Anagram");
		return true;
		}

		else
		{
		System.out.println("String is not a anagram");
		return false;
		}
		}
		else
		{
		System.out.println("Not a anagram");
		return false;
		}

		}
		
		
		public static void main(String[] args)
		{
			 String[] strAry={"are","rea","tae","ear"};
		validateAnagrams(strAry);
		//compareAnagram("mars","sram");
		}
	}
