import java.util.Scanner;
public class evenoddcount{
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
int evencount=0;
int oddcount=0;


  for(int i=0;i<n;i++){
   int num=arr[i];
   if(num%2==0)
    {
    evencount++;
    }
   else
   {
   oddcount++;
   }
}
System.out.println("Elements in an array even count:"+evencount);
System.out.println("Elements in an array odd count:"+oddcount);
}
}
