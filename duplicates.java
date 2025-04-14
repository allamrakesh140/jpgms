import java.util.Arrays;
import java.util.Scanner;
public class duplicates{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of an array:");
int n=sc.nextInt();
System.out.println("Enter the elements in  an array:");
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
int unique[]=new int[n];
int uniquecount=0;

  for(int i=0;i<n;i++)
  {
     Boolean isduplicate=false;
     for(int j=0;j<uniquecount;j++)
     {
      if(arr[i]==unique[j])
      {
       isduplicate=true;
       break;
      }
     }

 if(!isduplicate){
unique[uniquecount++]=arr[i];
}
  }
System.out.println("arrays after removing duplicates:");
for(int i=0;i<uniquecount;i++)
{
System.out.println(unique[i]+" ");
}


}
}