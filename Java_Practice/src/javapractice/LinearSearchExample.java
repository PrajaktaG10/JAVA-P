package javapractice;

import java.util.Scanner;

public class LinearSearchExample {
	
/*	public static int linearSearch(int[] arr,int key)
	  {
		for(int i=0; i<arr.length; i++)
		 {
	 	    if(arr[i]==key)
	 	    {
	 	    	return i;
	 	    }
	      }
		return -1;
	  }

	public static void main(String[] args) {
		int a1[]= {10,20,30,45,50,60,70};
         int key=50;
         System.out.println(key+" is found at index "+linearSearch(a1,key));
	}
*/
	
	//Another way by getting values from user
	public static void main(String[] args) {
	
	   int n, i, search,array[];
	   Scanner in=new Scanner(System.in);
	   System.out.println("Enter number of elements");
	   n=in.nextInt();
	   array=new int[n];
	   System.out.println("Enter those "+n+" elements");
	   for(i=0;i<n;i++)
	   {
		   array[i]=in.nextInt();
	   }
	
	   System.out.println("Enter value to find");
	   search=in.nextInt();
	    for(i=0;i<n;i++)
	     {
	    	if(array[i]==search)
	    	{
	    		System.out.println(search+" is present at "+(i+1)+" location.");
	    		break;
	    	}
	      }
	   if(i==n)
		   System.out.println(search+" is not present in array ");
	    }
  }
	
	
	
	
	

