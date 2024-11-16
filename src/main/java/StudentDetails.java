import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentDetails {
// a student has 5 subjects, find sum,avg of each sub score of each student if there are 3-5 students
	
	static Map<String,Integer> subDetails;
	static int totalSubs;
	static String stdName;
	static String subName;
	static int subScore;
	static int sum=0;
	static float avg=0.0f;
	
	StudentDetails(int totalSubs, String stdName)
	{
		this.totalSubs=totalSubs;
		this.stdName=stdName;
	}

	
	//add subjects
	public void studentSubjectDetails()
	{
		subDetails	= new HashMap<>();
		if(totalSubs>=1)
		{
		for(int i=0;i<totalSubs;i++)
		{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter subject name");
		subName= sc.next();
		this.subName=subName;
		
		System.out.println("Enter subject score");
		subScore= sc.nextInt();
		this.subScore=subScore;
		
		subDetails.put(subName, subScore);
		
	}
		System.out.println(subDetails);
		}
		else
		{
			System.out.println("Please add atleast 1 subject for the student");
		}
	}
	
	public void sumOfSubScore()
	{
		
		for(String sub:subDetails.keySet())
		{
			sum=sum+subDetails.get(sub);
		System.out.println(sum);
	}
		System.out.println("\nSum of each subject score is "+sum);
		
		float dSum=(float)sum;
		float dtotalSubs=(float)totalSubs;
		avg=dSum/dtotalSubs;
		System.out.println("\nAvg of all subject scores is "+avg);
	}
	
	public void avgOfSubScore()
	{
//		for(int i=0;i<totalSubs;i++)
//		{
//		sum=sum+subDetails.get(subName);
//	}
//		avg=sum/totalSubs;
//		System.out.println("\nAvg of all subject scores is "+avg);
	}
	
}
