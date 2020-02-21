import java.util.*;
import java.io.*;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;

class Hash
{
	public static void main(String[] args) throws Exception
	{
		File file =   new File("C:\\Users\\dell\\Desktop\\b_read_on.txt"); 
		Scanner s=new Scanner(file);
		int b=s.nextInt();
		int l=s.nextInt();
		int d=s.nextInt();
		int a[]=new int[b];
		FileWriter myWriter = new FileWriter("filename.txt");
		for(int i=0;i<b;i++)
		{
			a[i]=s.nextInt();
		}
		int tt=0,count=0;
		for(int i=0;i<l;i++)
		{
			int n=s.nextInt();
			int t=s.nextInt();
			int m=s.nextInt();
			int ar[]=new int[n];
			for(int j=0;j<n;j++)
			{
				ar[j]=s.nextInt();
			}
			tt=tt+t;
			if(tt>=d)
			{
				continue;
			}
			else
			{
				count++;
				int tl=d-tt;
				int n1=n;
				while(n1>=0 && tl>=0)
				{
					tl=tl-1;
					n1=n1-m;
				}
				if(n1<0)
				{
					n1=0;
				}
				
    			
   		  	   
				//System.out.println(count);
				int x1=i;
				//System.out.print(x1);
				myWriter.write(x1+" ");
				int x2=n-n1;
				//System.out.print(x2);
				myWriter.write(x2+ " ");
				 myWriter.write("\n");
				int x3[]=new int[x2];
				System.out.println();
				for(int q1=0;q1<x2;q1++)
				{
					x3[q1]=ar[q1];
					//System.out.print(x3[q1]);
					myWriter.write(x3[q1]+" ");
				}
				myWriter.write("\n");
				

			}
			

		}
		myWriter.write(count+" ");
		 myWriter.close();

	}
}