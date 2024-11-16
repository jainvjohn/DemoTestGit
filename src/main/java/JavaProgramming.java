import java.util.Scanner;

public class JavaProgramming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Reversing a String, number
		
		String str="Jack Daniels";
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
		
		String str1="Jack Daniels";
		String s="";
		for(int i=str1.length()-1;i>=0;i--)
		{
			s=s+str.charAt(i);
			
		}
		System.out.print("\n"+s);
		
		
	
		StringBuffer sb=new StringBuffer("The Great Valley");
		System.out.println("\n\n"+sb.reverse());
		
	int num=2013;
	
	int temp=0;
	while(num!=0)//2013,201,20,2
	{
		temp=temp*10+num%10;//3//31//310//3102
		num=num/10;//201//20//2
	}
	System.out.println("\n\n"+temp);
	
	
	int num2=8937;
	StringBuilder sbl=new StringBuilder(String.valueOf(num2));
System.out.println("\n\n"+sbl.reverse());




int no=34527;
int temp1=0;
int count=0;
while(no>0)//6442345,644234,64423
{
	temp1=temp1*10+no%10;//5//54//543	
	if(no%10>0)	//5,4,3
	{
		count++;//1/2/3
	}
	
	no=no/10;//644234//64423
	
}

System.out.println("No of digits in the number is "+count);
//no=34527
int no1=327;
int temp2=0;
int oddCount=0;
int evenCount=0;
while(no1>0) //34527,3452
{
	temp2=no1%10;//7,2
	if (temp2%2==0)
	{
		evenCount++;//-,1
	
	}	
	else
		{
		oddCount++;//1,
	}

no1=no1/10;	//3452//345
}
	System.out.println("No of even digits in the number is : "+evenCount);
	System.out.println("No of odd digits in the number is : "+oddCount);
	
	
	int no2=4435;
	int sum=0;
	int temp3=0;
	while(no2>0)
	{
		temp3=temp3+no2%10;
		no2=no2/10;
	}
	
	System.out.println("Sum of digits in the number is : "+temp3);
	
	
//	
//
//int num3=41;
////int num4=
//	if ((num3>1) && (num3%2!=0))
//	{
//	System.out.println(" is >1");
//	
//		System.out.println(" is a odd number");
//		
//		for(int j=1;j<=10;j++)
//		{
//
//		for(int i=2;i<num3-1;i++)
//		{
//			if((num3%1==0) && (num3%num3==0) && (num3%i!=0))
//			{
//
//				System.out.println(i);
//			}
//		//	System.out.println(num3+" is a Prime number");
//			
//			else
//			{
//			System.out.println("Not a Prime number");
//			break;
//			}
//		}
//		}
//		}
//		else
//		{
//			System.out.println("Not a Prime number");
//		}
//		
//		
//	
//	
	int arraySum=0;
	int[] arr= {3,4,1,2,1};
	for(int i=0;i<arr.length;i++)
	{
		arraySum=arraySum+arr[i];
	}
	System.out.println(arraySum);
	
	int arrSum=0;
	for(int c:arr)
	{
		arrSum=arrSum+c;
	}
	System.out.println(arrSum);
	
	int count1=0, count2=0;
	for(int a=0;a<arr.length;a++)
	{
		
		if(arr[a]%2==0)
		{
			System.out.println("Even no "+arr[a]);
		count1++;
		}
	
		else
			{
			System.out.println("Odd no "+ arr[a]);
			count2++;
			}}
	System.out.println("Even nos total "+ count1);
	System.out.println("Odd nos total "+ count2);
//	
//	int[] arr1= {13,4,11,232,3};//[4,11,232,7]//[4,13,11,232,7],[4,11,13,232,3],[4,11,13,232,3],[4,11,13,3,232]
//	int an1=0;//																					[4,11,3,13,232]
//	int an2=0;
//	for(int j=0;j<arr1.length;j++)//0,1,2//0,1,2  //0 //1,2
//	{
//		for(int i=j;i<arr1.length;i++)//0 //1,2,3
//		{
//		if(arr1[i]>arr[i+1]);///  /13>11 // //
//		an1=arr[i];//13//13
//		arr[i]=arr[i+1];//4,11
//		arr[i+1]=an1;//13
//	}
//	}
//	
//	Scanner sc = new Scanner(System.in);
//	//
//	int[] arr2;
//	System.out.println("\n\nEnter size of the array");
//	int sizeArrray=sc.nextInt();
//	
//	System.out.println("Array size declaration");
//	arr2=new int[sizeArrray];
//	
//	System.out.println("Enter the array values");
//	
//	for(int i=0;i<sizeArrray;i++)
//	{
//		
//		arr2[i]=sc.nextInt();
//	}
//	System.out.println("\n\nDisplay the array values");
//	
//	for(int l=0;l<arr2.length;l++)
//	{
//		
//				System.out.println(arr2[l]);
//	
//	}
	
	System.out.println("\n\n");
	int[] arr1= {13,4,11,232,3};//[4,13,11,232,3],[4,11,13,232,3],[4,11,13,3,232],[4,11,3,13,232],[4,3,11,13,232],[3,4,11,13,232]
	int an1=0;//				[4,11,3,13,232]
	
	for(int j=0;j<arr1.length-1;j++)//0,1,2,3		/0,1,2,3
	{
		for(int i=0;i<arr1.length-1;i++)//0,1,2,3   1,2,3  2,3 3   //0,1,2,3 //0,1,2,3 //0,1,2,3 //0,
		{
		if(arr1[i]>arr1[i+1])///  /13>11 // //
		
		{
			an1=arr1[i];//13//13
			arr1[i]=arr1[i+1];//4,11
			arr1[i+1]=an1;//13
		}
		//System.out.println("hi");
		}
	}
	for(int l=0;l<arr1.length;l++)
	{
		
				System.out.println(arr1[l]);
	}
	
	
	 
    
    String strSpace=" ha amc csd 2 ";
    for (int i=0;i<strSpace.length();i++)
    {
    if (strSpace.charAt(i)==' ')
    {
    	System.out.println(strSpace.charAt(i)+" "+ strSpace.indexOf(strSpace.charAt(i)));
    	strSpace.replaceAll(strSpace.charAt(i)+"", "");
    }
    }

     System.out.println(strSpace);
	
     System.out.println("\n\nReversing each word in a string");
     
     int word=1;
     String srev="I'm a mad Max Fury Lover";//0,1,2,3
     
//     for(int i=1; i<srev.length();i++)
//     {
//    	 String crev="";
//    	 if((srev.charAt(i)!=' ') && (srev.charAt(i-1)!=' '))
//	{
//    		 crev=crev+""+srev.charAt(i);
//    	word++;
//    		 
//	}
//    	 
//    	 System.out.print(crev);
//    	 System.out.print(word); 
//    	 }
     
     int rev1=0, rev2=0,rev3=0;
    
     for(int i=0;i<srev.length()-1;i++)//0,1,2,3,//4,5,
     {
    	 String crev="";
    	 if((srev.charAt(i)==' ') && (srev.charAt(i+1)!=' '))//
    	 {
    		rev2=srev.indexOf(srev.charAt(i));
    		 System.out.print(rev2);//3,5[],9
//    		rev1=rev1+
//    		 int countrev=rev2-rev1;
    		 
    		 for(int j=rev2-1;j>=rev1;j--)//2,1,0
    		 {
    			 crev=crev + srev.charAt(j);//m'I
    		 }
    		 System.out.println(crev);
    	 }   
    	 
     }
     
     
     
     
	}
}
	

//str.charAt(int index)
//a=8
//b=5
//
//b=a-b
//a=a-b
//b=a+b


